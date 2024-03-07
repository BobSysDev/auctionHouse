import java.util.ArrayList;

public class Auction
{
  private Clerk clerk;
  private Timer timer;
  private Item item;
  private Bidder highestBidder;
  private ArrayList<Bidder> bidders;
  Thread timerThread;
  private float price;
  private boolean running;

  public Auction(Clerk clerk, Timer timer, Item item, float startingPrice){
    this.clerk = clerk;
    this.timer = timer;
    this.item = item;
    this.highestBidder = null;
    this.bidders = new ArrayList<Bidder>();
    this.price = startingPrice;
    this.timerThread = null;
  }

  public float getPrice(){
    return item.getBid();
  }

  public void joinAuction(Bidder bidder){
    bidders.add(bidder);
  }

  public void leaveAuction(Bidder bidder){
    bidders.remove(bidder);
  }

  public void placeABid(Bidder bidder, float bid){
    highestBidder = bidder;
    item.bid(bid, bidder);
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

  public void startTimer(){
    Thread timerThread = new Thread(timer);
    timerThread.start();
  }

  public String getTimer(){
    return timer.toString();
  }

  public int getTimerRaw(){
    return timer.getCurrentTime();
  }

  public void stopTimer(){
    timerThread.interrupt();
  }
}
