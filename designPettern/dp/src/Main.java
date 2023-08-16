import com.prac.designPettern.adapter.*;
import com.prac.designPettern.aop.AopBrowser;
import com.prac.designPettern.decorator.*;
import com.prac.designPettern.facade.FTP;
import com.prac.designPettern.facade.Reader;
import com.prac.designPettern.facade.SftpClient;
import com.prac.designPettern.facade.Writer;
import com.prac.designPettern.observer.Button;
import com.prac.designPettern.observer.IButtonListener;
import com.prac.designPettern.proxy.Browser;
import com.prac.designPettern.proxy.BrowserProxy;
import com.prac.designPettern.proxy.IBrowser;
import com.prac.designPettern.singleTon.AClazz;
import com.prac.designPettern.singleTon.BClazz;
import com.prac.designPettern.singleTon.SocketClient;
import com.prac.designPettern.strategy.*;

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
            //aopTest();
        //DecoratorTest
            //decoTest();
        //ObserverTest
            //observerTest();
        //facadeTest
            //facadeTest();
            //facadeTest2();
        //strategyTest
            strategyTest();
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
    public static void decoTest(){
        ICar audi = new Audi(1000);
        audi.showPrice();
        //a3
        ICar audiA3 = new A3(audi,"A3");
        audiA3.showPrice();
        //a4
        ICar audiA4 = new A4(audi,"A4");
        audiA4.showPrice();
        //a5
        ICar audiA5 = new A5(audi,"A5");
        audiA5.showPrice();
    }
    public static void observerTest(){
        Button button = new Button("button");
        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });

        button.click("ボタンクリック　：　Click : 1");
        button.click("ボタンクリック　：　Click : 2");
        button.click("ボタンクリック　：　Click : 3");
        button.click("ボタンクリック　：　Click : 4");
    }
    public static void facadeTest(){
        FTP ftpClient = new FTP("www.file.co.kr",22,"/home/etc");
        ftpClient.connect();
        ftpClient.moveDirectory();
        Writer writer = new Writer("text.tmp");
        writer.fileConnect();
        writer.write();
        Reader reader = new Reader("text.tmp");
        reader.fileConnect();
        reader.fileRead();

        reader.fileDisconnect();
        writer.fileDisconnect();
        ftpClient.disConnect();
    }
    public static void facadeTest2(){
        SftpClient sftpClient = new SftpClient("www.file.co.kr",22,"home/etc","text.tmp");
        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();
        sftpClient.disConnect();
    }
    public static void strategyTest(){

        String testStr = "Hello java";
        //normal
        Encoder encoderNormal = new Encoder(new NormalStrategy());
        //base64
        Encoder encoderBase64 = new Encoder(new Base64Strategy());
        //append
        Encoder encoderAppend = new Encoder(new AppendStrategy());
        System.out.println(encoderNormal.getMessage(testStr));
        System.out.println(encoderBase64.getMessage(testStr));
        System.out.println(encoderAppend.getMessage(testStr));
    }

}
