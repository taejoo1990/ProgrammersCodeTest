import com.prac.designPettern.adapter.*;
import com.prac.designPettern.aop.AopBrowser;
import com.prac.designPettern.proxy.Browser;
import com.prac.designPettern.proxy.BrowserProxy;
import com.prac.designPettern.proxy.IBrowser;
import com.prac.designPettern.singleTon.AClazz;
import com.prac.designPettern.singleTon.BClazz;
import com.prac.designPettern.singleTon.SocketClient;

import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) throws Exception {
        //singleTon Test
            //singleTonTest();
        //adapter Test
            //adapterTest();
        //proxy Test
            //proxyTest();
        //Aop Test
        aopTest();
    }


    public static void singleTonTest(){
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println("aClientとbClientは同じ？");
        System.out.println(aClient.equals(bClient));
        System.out.println("Test is Done");
        System.out.println();
    }
    public static void connect(Electronic110V electronic110V){
        System.out.println("110v Connected");
        electronic110V.powerOn();
        System.out.println();
    }
    public static void adapterTest(){
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        //connect(cleaner);

        Electronic110V cleaner110V = new SocketAdapter(cleaner);
        connect(cleaner110V);
        Electronic220V airConditioner = new AirConditioner();
        Electronic110V airConditioner110V = new SocketAdapter(airConditioner);
        connect(airConditioner110V);
    }
    public static void proxyTest() throws Exception{
        IBrowser browser = new Browser("www.google.com");
        callShow(4,browser);
        browser = new BrowserProxy("www.google.com");
        callShow(4,browser);
    }
    public static void aopTest() throws Exception{
        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser browser = new AopBrowser("www.google.com",
                ()->{
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                ()->{
                    long now = System.currentTimeMillis();
                    end.set(now-start.get());
                });
        browser.show();
        System.out.println("loadingTime : " + end.get());

    }
    public static void callShow(int cnt, IBrowser ib) throws InterruptedException {
        for(int i=0; i<cnt ; i++){
            ib.show();
        }
        System.out.println();
    }


}
