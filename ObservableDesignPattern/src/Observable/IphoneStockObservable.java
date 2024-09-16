package Observable;

import Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StocksObservable{

    List<NotificationAlertObserver>observerList = new ArrayList<>();
    public int stockCount=0;

    @Override
    public int getStockCount() {
        return stockCount;
    }

    @Override
    public void setStockCount(int newStockAdded) {

        if(stockCount==0)
            notifySubscribers();

        stockCount+=newStockAdded;

    }

    @Override
    public void notifySubscribers() {

        for(var observer : observerList){
            observer.update();
        }

    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);

    }

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);

    }
}
