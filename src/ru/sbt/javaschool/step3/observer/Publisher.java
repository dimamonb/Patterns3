package ru.sbt.javaschool.step3.observer;

import ru.sbt.javaschool.step3.observer.CommonPublisher;

import java.io.File;

public class Publisher {
    public CommonPublisher events;
    private File file;

    public Publisher() {
        this.events = new CommonPublisher("open", "save", "rename");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            events.notify("save", file);
        } else {
            throw new Exception("Откройте для начала файл");
        }
    }

}
