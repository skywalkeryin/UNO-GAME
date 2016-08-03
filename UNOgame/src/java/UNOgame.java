
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class UNOgame {
    private String gameID;
    private ArrayList<Players> players ;
    private String  gameStatus;   //={"waiting","started","ended"};
    private Deck deck ;
    private LinkedList<UNOCard> discardPile;
    public UNOgame(){
       deck=new Deck();
       players =new ArrayList<Players>();
       discardPile=new  LinkedList<UNOCard>();
    }
    public UNOgame(String id,ArrayList<Players> player,String status,Deck deck,LinkedList<UNOCard> pile){
        
        this.gameID=id;
        this.players=player;
        this.gameStatus=status;
        this.deck=deck;
        this.discardPile=pile;
       
        
    }

    public Deck getDeck() {
        return deck;
    }

    public LinkedList<UNOCard> getDiscardPile() {
        return discardPile;
    }

    public List<Players> getPlayers() {
        return players;
    }
    public void  createNewgame(){
       deck.createDeck();
        
        
    }
    public void addPlayer(Players p){
      //  this.players=new ArrayList<Players>();
        players.add(p);
        
    }
    public UNOCard takecardfromdeck(){
        Deck deck=new Deck();
        UNOCard c=deck.takeCard();
        return c;
    }
    public void discard(UNOCard card,Players p ){
       // Players p=new Players();
        LinkedList<UNOCard> a= p.getHands();
        discardPile.addFirst(card);
        a.remove(card);
        
    }
//    public UUOCard tcardfrompile(){
//        
//    }
    
    public String changeStatus(String status){
        gameStatus=status;
        return status;
    }
    public void deal( Players p){
       for(int i=0;i<7;i++){
         p.addCard(deck);
       
    }
      
   }
}
    

