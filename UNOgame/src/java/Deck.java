
//import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;


public class Deck {
    private LinkedList<UNOCard> cardlist;
    private int numofcards;
    public Deck(){
        cardlist=new  LinkedList<UNOCard>();
    }
    ;
    public Deck(int number,LinkedList<UNOCard> deck ){
        this.numofcards=number;
        this.cardlist=deck;
    }
    
    public void createDeck(){
       //LinkedList<UNOCard> cardlist=new  LinkedList<UNOCard>();
        for (int a=0;a<4;a++)
        {
            
            for (int i=0;i<2;i++){
                
            for (int j=1;j<10;j++){
             UNOCard c=new UNOCard();
             c.setCardColor(c.Color[a]);//2 represent red
             c.setCardType(c.Type[0]);//O represents numbers
             c.setCardValue(c.Value[j]);
             c.setCardImg(c.Color[a]+" "+j+" png");
             cardlist.add(c);
            }
             
            }
          }
          // above code is about  settig  72 number cards value
          for (int b=0;b<3;b++)
          {
              
              for (int i=0;i<2;i++){
                  for (int j=0;j<4;j++){
                      UNOCard c=new UNOCard();
                      c.setCardColor(c.Color[j]);
                      c.setCardType(c.Type[b+1]);
                      c.setCardValue(20);
                      c.setCardImg(c.Color[j]+c.Type[b+1]+" png");
                     cardlist.add(c);
                  }
              }
          }
          //above code is about setting three special cards
          for (int i=0;i<4;i++){
             UNOCard c=new UNOCard();
             c.setCardColor(c.Color[i]);
             c.setCardType(c.Type[0]);
             c.setCardValue(0);
             c.setCardImg(c.Color[i]+" "+0+" png");
             cardlist.add(c);
             
          }
          //above code is about setting the 0 card.
          for (int i=0;i<2;i++){
              for (int j=0;j<4;j++){
                  UNOCard c=new UNOCard();
                  c.setCardColor(c.Color[4]); // 4 reprents nocolor
                  c.setCardType(c.Type[4+i]);
                  c.setCardValue(50);
                  c.setCardImg(c.Type[4+i]+" png");
                  cardlist.add(c);
              }
              
          }
          
//         Collections.shuffle(cardlist);  
//         Deck deck=new Deck(cardlist.size(),cardlist);
//          return deck;
    }
    public UNOCard takeCard(){
        Random rand =new Random();
        int n=rand.nextInt(cardlist.size()); // generate a random number between 0 and 107
        UNOCard c=cardlist.get(n);
        cardlist.remove(n);
        return c;
     }

    public int getDecknum(){
        return (cardlist.size());
    }
        
}
