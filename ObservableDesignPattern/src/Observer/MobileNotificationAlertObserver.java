package Observer;

import Observable.StocksObservable;

import javax.management.Notification;

public class MobileNotificationAlertObserver implements NotificationAlertObserver{

    String userName;
    StocksObservable observable;

    public MobileNotificationAlertObserver(String userName, StocksObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        String msg = "iPhone stock is now available!";
        sendMessage(userName,msg);
    }

    public void sendMessage(String userName, String msg){
        System.out.println("Message sent to - "+userName+" and the message is \n"+msg);
    }



}
