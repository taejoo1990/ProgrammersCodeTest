package com.prac.designPettern.facade;

public class FTP {

    private String host;
    private int port;
    private String path;

    public FTP(String host, int port, String path) {
        this.host = host;
        this.port = port;
        this.path = path;
    }

    public void connect(){
        System.out.println("FTP Host : " + host +", Port : "+port+" Connected");
    }
    public void moveDirectory(){
        System.out.println("path : " + path + "に移動します");
    }
    public void disConnect(){
        System.out.println("FTP disconnected");
    }
}
