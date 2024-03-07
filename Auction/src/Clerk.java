
public class Clerk {
private Auction auction;

    Clerk(){
        auction=null;
    }
    public void setAuction(Auction auction){
        this.auction= auction;
    }
    public void startAuction(){
        auction.getTimer().start; //to change
    }
    public String stopAuction(){
        return getBidder();
    }
    //public void addItem(String item){}
