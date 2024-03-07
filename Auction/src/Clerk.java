public class Clerk {

private Item item;
private Auction auction;

    Clerk(){
        auction=null;
        item=null;
    }
    public void createAuction(Item item){
        this.item=item;
        this.auction= new Auction(this, );
    }
    public  startAuction(){

    }
    public String stopAuction(){
        return getBidder();
    }
    public void addItem(String item){}
}
