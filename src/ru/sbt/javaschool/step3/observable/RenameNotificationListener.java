package ru.sbt.javaschool.step3.observable;

import java.io.File;

public class RenameNotificationListener implements RenameListener {
    private File fileName;
    public RenameNotificationListener(String fileName){
        this.fileName = new File(fileName);
    }
    @Override
    public void rename(File fileName) {
        System.out.println("File: " + fileName + "was renamed.");
    }
}
