public class Bidder
{
  private String firstName;
  private String lastName;
  private int age;
  private Auction auction;

  public Bidder(String firstName, String lastName, int age, Auction auction)
      throws Exception
  {
    this.firstName = firstName;
    this.lastName = lastName;
    if(age<18){
      throw new Exception("You are too young to legally participate in an auction");
    }
    this.age = age;
    this.auction = auction;
  }

  public Bidder(String firstName, String lastName, int age) throws Exception
  {
    this.firstName = firstName;
    this.lastName = lastName;
    if(age<18){
      throw new Exception("You are too young to legally participate in an auction");
    }
    this.age = age;
    this.auction = null;
  }

  public void placeABid(float bid){
    auction.placeABid(this, bid);
  }

  public void joinAuction(Auction auction){
    auction.joinAuction(this);
    this.auction = auction;
  }

  public void leaveAuction(){
    auction.leaveAuction(this);
    this.auction = null;
  }

  public int getAge()
  {
    return age;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public String getLastName()
  {
    return lastName;
  }
}
