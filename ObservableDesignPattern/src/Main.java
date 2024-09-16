import Observable.IphoneStockObservable;
import Observable.StocksObservable;
import Observer.MobileNotificationAlertObserver;
import Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {


        StocksObservable iphoneStockObservable = new IphoneStockObservable();

        NotificationAlertObserver obs1 = new MobileNotificationAlertObserver("ss_ss",new IphoneStockObservable());
        NotificationAlertObserver obs2 = new MobileNotificationAlertObserver("ss1@gmail.com",new IphoneStockObservable());
        NotificationAlertObserver obs3 = new MobileNotificationAlertObserver("ss2@gmail.com",new IphoneStockObservable());

        iphoneStockObservable.add(obs1);
        iphoneStockObservable.add(obs2);
        iphoneStockObservable.add(obs3);

        iphoneStockObservable.setStockCount(100);


    }
}