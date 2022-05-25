package ro.ase.cts.factory;

import ro.ase.cts.factory.Notification;

public class Email implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Email notification!");
    }
}
