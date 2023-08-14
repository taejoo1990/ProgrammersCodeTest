package com.prac.designPettern.aop;

import com.prac.designPettern.proxy.HTML;
import com.prac.designPettern.proxy.IBrowser;

public class AopBrowser implements IBrowser {
    private String url;
    private HTML html;
    private Runnable before;
    private Runnable after;


    public AopBrowser(String url, Runnable before, Runnable after) {
        this.url = url;
        this.before = before;
        this.after = after;
    }

    @Override
    public HTML show() throws InterruptedException {
        before.run();
        if(html == null){
            this.html = new HTML("www.yahoo.co.jp");
            System.out.println("AOP Browser loading from" + url);
        }else{
            System.out.println("AOP Browser loading from" + url);
        }
        Thread.sleep(1500);
        after.run();
        return html;
    }
}
