package com.prac.designPettern.proxy;

public class BrowserProxy implements IBrowser{
    private String url;
    private HTML html;

    public BrowserProxy(String url) {
        this.url = url;
    }

    @Override
    public HTML show() {
        if(html==null) {
            this.html = new HTML(url);
            System.out.println("BrowserProxy loading html from" + url);
        }else{
            System.out.println("BrowserProxy using html cache" + url);
        }
        return this.html;
    }
}
