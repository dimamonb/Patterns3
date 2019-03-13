package ru.sbt.javaschool.step1.util;

import ru.sbt.javaschool.step1.action.AbstractNotifyClienDaService;
import ru.sbt.javaschool.step1.action.NotificationDaService;
import ru.sbt.javaschool.step1.action.NotifyEnum;
import ru.sbt.javaschool.step1.action.PPRBNotifyDaService;

public class NotificationSender {

    AbstractNotifyClienDaService service = selectNotifier(NotifyEnum.UNS);


    public void sendMessage() {
        service.createMessage();
        service.validateMessage();
        service.sendMessage();
        service.writeLog();
    }

    private static AbstractNotifyClienDaService selectNotifier(NotifyEnum notifyEnum){

        switch (notifyEnum){
            case CEP:
                return new PPRBNotifyDaService();
            case UNS:
                return new NotificationDaService();
            default:
                throw  new RuntimeException("Несуществующий тип уведомления");
        }
    }
}
