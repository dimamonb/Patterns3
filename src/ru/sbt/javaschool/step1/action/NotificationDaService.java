package ru.sbt.javaschool.step1.action;

import java.rmi.server.UID;

public class NotificationDaService extends AbstractNotifyClienDaService{
    @Override
    public UID sendMessage() {
        System.out.println("Дратути, это нотифаер3000, всем добра, и вы сами знаете что нельзя так просто сделать)");

        return new UID();
    }

    @Override
    protected String getNotifier() {
        return "UNS";
    }
}
