public interface AuctionMediator {

    public void addBidder(Colleague bidder);

    public void placeBid(int bidAmount, Colleague bidder);

}
