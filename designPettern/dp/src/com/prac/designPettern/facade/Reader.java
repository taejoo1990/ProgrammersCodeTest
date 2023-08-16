package com.prac.designPettern.facade;

public class Reader {

    private String fileName;

    public Reader(String fileName) {
        this.fileName = fileName;
    }

    public void fileConnect(){
        String msg = String.format("Reader %sにつながります",fileName);
        System.out.println(msg);
    }

    public void fileRead(){
        String msg = String.format("Reader %s 読み取り",fileName);
        System.out.println(msg);
    }

    public void fileDisconnect(){
        String msg = String.format("Reader %s Disconnect",fileName);
        System.out.println(msg);
    }
}
