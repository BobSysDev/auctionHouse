public class Auction
{
  private Clerk clerk;
  private Timer timer;
  private Item item;
  private Bidder highestBidder;
  private float price;
  private boolean running;

  public Auction(Clerk clerk, Timer timer, Item item, float startingPrice){
    this.clerk = clerk;
    this.timer = timer;
    this.item = item;
    this.highestBidder = null;
    this.price = startingPrice;
  }

  public float getPrice(){
    return price;
  }

  public void placeABid(Bidder bidder, float priceIncrease){
    highestBidder = bidder;
    if(priceIncrease <= 0){
      throw new UnsupportedOperationException("The price increase provided was invalid");
    }
    price += priceIncrease;
  }

  public Item getItem(){
    return item;
  }

  public void setItem(Item item){
    this.item = item;
  }

  public void endAuction(){
    running = false;
  }

  public boolean getAuctionStatus(){
    return running;
  }
}
