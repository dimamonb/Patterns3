package ru.sbt.javaschool.step3.observable;

import java.io.File;

public class EmailNotificationListener implements EventListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("На адрес " + email + " было отправлено сообщение: кто то  выполнил операцию \"" + eventType + " \" для файла: " + file.getName());
    }
}