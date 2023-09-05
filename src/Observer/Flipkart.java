package Observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    private static Flipkart instance=null;
    private List<OnOrderPlacedSubscriber> onOrderPlacedSubscribers= new ArrayList<>();

    public static Flipkart getInstance(){
        if(instance==null){
            instance=new Flipkart();
        }
        return instance;
    }

    void registerSubscriber (OnOrderPlacedSubscriber onOrderPlacedSubscriber){
        onOrderPlacedSubscribers.add(onOrderPlacedSubscriber);
    }

    void unRegisterSubscriber (OnOrderPlacedSubscriber  onOrderPlacedSubscriber){
        onOrderPlacedSubscribers.remove(onOrderPlacedSubscriber);
    }

    public void onOrderPlaced(){
        //ns.notify();
        //es.sendEmail();
        for(OnOrderPlacedSubscriber onOrderPlacedSubscriber : onOrderPlacedSubscribers){
            onOrderPlacedSubscriber.announceOrderPlaced();
        }
    }
}
