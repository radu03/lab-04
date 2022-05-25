package ro.ase.cts;

import ro.ase.cts.factory.Notification;
import ro.ase.cts.factory.NotificationFactory;
import ro.ase.cts.prototype.Copac;
import ro.ase.cts.prototype.Livada;
import ro.ase.cts.prototype.Pozitie;

public class Main {
    public static void main(String[] args) {
        //Factory
        try {
            Notification sms = NotificationFactory.CreateNotification("SMS");
            sms.notifyUser();
            NotificationFactory.CreateNotification("Email").notifyUser();
            //NotificationFactory.CreateNotification("cv").notifyUser();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Prototype
        try {
            Pozitie pozitie = new Pozitie(10,10);
            Copac copac = new Copac(12,"verde","mare",pozitie);
            Copac copac1 = (Copac) copac.clone();
            Livada livada = new Livada();
            livada.planteaza(copac);
            livada.planteaza(copac1);
            for (Copac c: livada.getCopaci()) {
                System.out.println(c.getXoY());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
