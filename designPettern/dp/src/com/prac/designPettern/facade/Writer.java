package com.prac.designPettern.facade;

public class Writer {
    private String fileName;

    public Writer(String fileName) {
        this.fileName = fileName;
    }

    public void fileConnect(){
        String msg = String.format("Reader %sにつながります",fileName);
        System.out.println(msg);
    }
    public void write(){
        String msg = String.format("Reader %s を描きます。",fileName);
        System.out.println(msg);
    }
    public void fileDisconnect(){
        String msg = String.format("Reader %s Disconnect",fileName);
        System.out.println(msg);
    }


}
