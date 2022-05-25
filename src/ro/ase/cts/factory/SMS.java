package ro.ase.cts.factory;

public class SMS implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("SMS notification!");
    }
}
