public class Item
{
  private String name;
  private int startPrice;
  private int buyOutPrice;
  private int bid;
  private String bidder;

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

  public int getStartPrice()
  {
    return startPrice;
  }

  public int getBuyOutPrice()
  {
    return buyOutPrice;
  }

  public int getBid()
  {
    return bid;
  }

  public String getBidder()
  {
    return bidder;
  }

  public void bid(int bid, String bidder){
    if (bid>startPrice&&bid>this.bid){
      this.bid = bid;
      this.bidder = bidder;
    }
  }
}
