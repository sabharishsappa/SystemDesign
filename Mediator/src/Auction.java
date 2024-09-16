import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator{

    List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void addBidder(Colleague bidder) {
        colleagues.add(bidder);
    }

    @Override
    public void placeBid(int bidAmount, Colleague bidder) {

        System.out.println("Bid Placed Successfully of "+bidAmount+" Rs. by "+bidder.getName());

        for(var colleague : colleagues) {
            if(!colleague.getName().equals(bidder.getName())){
                colleague.receiveBidNotification(bidAmount);
            }
        }
        System.out.println();

    }
}
