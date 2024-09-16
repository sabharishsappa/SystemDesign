public class Main {
    public static void main(String[] args) {

        AuctionMediator auctionMediator = new Auction();

        Bidder b1 = new Bidder(auctionMediator,"b1");
        Bidder b2 = new Bidder(auctionMediator,"b2");
        Bidder b3 = new Bidder(auctionMediator,"b3");
        Bidder b4 = new Bidder(auctionMediator,"b4");

        b1.placeBid(1000);
        b2.placeBid(1100);
        b3.placeBid(1500);
        b4.placeBid(2500);
    }
}