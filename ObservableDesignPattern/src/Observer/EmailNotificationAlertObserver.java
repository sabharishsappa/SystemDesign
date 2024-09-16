package Observer;

import Observable.StocksObservable;

public class EmailNotificationAlertObserver implements NotificationAlertObserver{

    String emailId;
    StocksObservable observable;

    public EmailNotificationAlertObserver(String emailId, StocksObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        String msg = "iPhone stock is now available!";
        sendEmail(emailId,msg);

    }

    public void sendEmail(String emailId,String msg){
        System.out.println("Mail sent to - "+emailId+" and the message is \n "+msg);
    }
}
