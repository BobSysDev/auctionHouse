public class Item
{
  private String name;
  private float startPrice;
  private float buyOutPrice;
  private float bid;
  private Bidder bidder;

  public Item(String name, int startPrice, int buyOutPrice){
    this.name = name;
    this.startPrice = startPrice;
    this.buyOutPrice = buyOutPrice;
    this.bid = 0;
    this.bidder = null;
  }

  public String getName()
  {
    return name;
  }

  public float getStartPrice()
  {
    return startPrice;
  }

  public float getBuyOutPrice()
  {
    return buyOutPrice;
  }

  public float getBid()
  {
    return bid;
  }

  public Bidder getBidder()
  {
    return bidder;
  }

  public void bid(float bid, Bidder bidder){
    if (bid>startPrice&&bid>this.bid){
      this.bid = bid;
      this.bidder = bidder;
    }
  }
}
