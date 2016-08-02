
import java.util.LinkedList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Deck {
    private int numofcards;
    public Deck(int number){
        this.numofcards=number;
    }
    private LinkedList<UNOCard> Deck;
    public LinkedList<UNOCard> Deck(){
        
        for (int a=0;a<4;a++)
        {
            UNOCard c=new UNOCard();
            for (int i=0;i<2;i++){
                
            for (int j=1;j<10;j++){
             c.setCardColor(c.Color[a]);//2 represent red
             c.setCardType(c.Type[0]);//O represents numbers
             c.setCardValue(c.Value[j]);
             c.setCardImg(c.Color[a]+j+" png");
             Deck.add(c);
            }
             
            }
          }
          // above code is about  settig  72 number cards value
          for (int b=0;b<3;b++)
          {
              UNOCard c=new UNOCard();
              for (int i=0;i<2;i++){
                  for (int j=0;j<4;j++){
                      c.setCardColor(c.Color[j]);
                      c.setCardType(c.Type[b+1]);
                      c.setCardValue(20);
                      c.setCardImg(c.Color[j]+c.Type[b+1]+" png");
                      Deck.add(c);
                  }
              }
          }
          //above code is about setting three special cards
          for (int i=0;i<4;i++){
             UNOCard c=new UNOCard();
             c.setCardColor(c.Color[i]);
             c.setCardType(c.Type[0]);
             c.setCardValue(0);
             c.setCardImg(c.Color[i]+0+" png");
             Deck.add(c);
             
          }
          //above code is about setting the 0 card.
          for (int i=0;i<2;i++){
              for (int j=0;j<4;j++){
                  UNOCard c=new UNOCard();
                  c.setCardColor(c.Color[4]);// 4 reprents nocolor
                  c.setCardType(c.Type[4+i]);
                  c.setCardValue(50);
                  c.setCardImg(c.Type[4+i]+" png");
                  Deck.add(c);
              }
          }
          return Deck;
    }
    public LinkedList<UNOCard> takeCard(){
        Random rand =new Random();
        int n=rand.nextInt(108);// generate a random number between 0 and 107
        Deck.remove(n);
        return Deck;
     
        
       
    }
    public UNOCard randomCard(){
         UNOCard c=new UNOCard();
         Random rand =new Random();
         int n=rand.nextInt(108);
         c= Deck.get(n);
         return c;
         
         
    }
        
}
