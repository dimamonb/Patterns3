package ru.sbt.javaschool.step3.observable;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}