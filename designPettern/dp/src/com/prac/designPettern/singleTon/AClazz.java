package com.prac.designPettern.singleTon;

public class AClazz {

    private SocketClient sc;

    public AClazz(){
        this.sc = SocketClient.getInstance();
    }

    public SocketClient getSocketClient(){
        return this.sc;
    }
}
