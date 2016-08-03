
import java.util.LinkedList;
import java.util.List;


public class UNOTest {
 
   
    UNOgame game=new UNOgame();

    
    private void PrinthandsDetail(Players p){
        int totalValue=0;
        for (int i=0;i<7;i++){
         // p.addCard();
           UNOCard c=p.hands.get(i);
           totalValue+=c.getCardValue();
           
           System.out.println("color:"+ c.getCardColor()+" Type:"+c.getCardType()+" Value:"+c.getCardValue()+" ImgName: "+c.getCardImg());
           
        }
      System.out.println("TotalValue "+ totalValue);
    }

     public static void main(String[] args){
       // Deck d=new Deck();
        UNOgame ga=new UNOgame();
        ga.createNewgame();   // create a new deck
        Players p1= new Players("yin");
        Players p2= new Players("TK"); Players p3= new Players("verra"); Players p4= new Players("mary");
        Players p5= new Players("brouces");
         
        ga.addPlayer(p1);
        ga.addPlayer(p2);
        ga.addPlayer(p3);
        ga.addPlayer(p4);
        ga.addPlayer(p5);
        List<Players> pl=ga.getPlayers();
        for (int i=0;i<pl.size();i++){
        UNOTest ts=new UNOTest();
        ga.deal(pl.get(i));
        System.out.println("Player:"+pl.get(i).getName());
        ts.PrinthandsDetail(pl.get(i));        
    }
         System.out.println("The number of remaining :"+ga.getDeck().getDecknum());
         ga.discard(pl.get(3).hands.getFirst(), pl.get(3));
         UNOCard topCard=ga.getDiscardPile().getFirst();
         System.out.println("TopCard:"+topCard.getCardColor()+topCard.getCardType()+""+topCard.getCardValue()+" "+topCard.getCardImg());
        
        
 }
   
   

}