
import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;
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
public class Players {
    private String name;
    private LinkedList<UNOCard>hands=new LinkedList<UNOCard>();
    
    public Players(){
        super();
    }
    public Players(String name,LinkedList<UNOCard> hands){
        this.name=name;
        this.hands=hands;
        
    }
    public LinkedList<UNOCard> addCard(){
        
        Deck d=new Deck();
        Random rand =new Random();
        int n=rand.nextInt(108);
        hands.add(d.randomCard());
        return hands;
    }
    
        
    
}
