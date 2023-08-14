package com.prac.designPettern.singleTon;

public class BClazz {
    private SocketClient sc;

    public BClazz(){
        this.sc = SocketClient.getInstance();
    }

    public SocketClient getSocketClient(){
        return this.sc;
    }
}
