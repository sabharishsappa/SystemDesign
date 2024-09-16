public class Bidder implements Colleague{

    String name;
    AuctionMediator auctionMediator;

    public Bidder(AuctionMediator auctionMediator, String name){
        this.auctionMediator = auctionMediator;
        this.name = name;
        auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(int bidAmount){
        auctionMediator.placeBid(bidAmount,this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void receiveBidNotification(int bidAmount) {
        System.out.println("Bidder "+name+ " got the notification that someone has put bid of "+bidAmount);
    }
}
