package ru.sbt.javaschool.step1.action;

import java.rmi.server.UID;

public abstract class AbstractNotifyClienDaService {

    public void createMessage(){
        System.out.println("Message was created");
    }

    public void validateMessage() {
        System.out.println("Message was validated by XSD");
    }

    public abstract UID sendMessage();

    public void writeLog(){
        System.out.println("Message was sended by " + getNotifier());
    }

    protected abstract String getNotifier();


}
