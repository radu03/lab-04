package ro.ase.cts.factory;

public class NotificationFactory {
    public static Notification CreateNotification(String tipNotificare) throws Exception {
        switch (tipNotificare){
            case "SMS":
                return new SMS();
            case "Push":
                return new Push();
            case "Email":
                return new Email();
            default:
                throw  new Exception("Tip incorect!");
        }
    }

}
