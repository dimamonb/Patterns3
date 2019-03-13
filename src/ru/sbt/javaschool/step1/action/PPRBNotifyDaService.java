package ru.sbt.javaschool.step1.action;

import java.rmi.server.UID;

public class PPRBNotifyDaService extends AbstractNotifyClienDaService {


    @Override
    public UID sendMessage() {
        System.out.println("CEP doesn't return UID");
        return null;
    }

    @Override
    protected String getNotifier() {
        return "CEP";
    }
}
