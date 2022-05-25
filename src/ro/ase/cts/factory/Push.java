package ro.ase.cts.factory;

public class Push implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Push notification!");
    }
}
