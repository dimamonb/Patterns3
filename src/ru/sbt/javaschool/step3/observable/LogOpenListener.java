package ru.sbt.javaschool.step3.observable;

import ru.sbt.javaschool.step3.observable.EventListener;

import java.io.File;

public class LogOpenListener implements EventListener {
    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Лог был сохранене в файл: " + log + ": Кто-то выполнил операцию \"" + eventType + "\" с файлом: " + file.getName());
    }
}