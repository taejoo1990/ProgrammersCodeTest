package com.prac.designPettern.singleTon;

public class SocketClient {

    private static SocketClient sc = null;

    private SocketClient() {

    }

    public static SocketClient getInstance() {
        if (sc == null) {
            sc = new SocketClient();
        }
        return sc;
    }

    public void connect(){
        System.out.println("connected");
    }
}
