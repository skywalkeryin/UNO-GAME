/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class UNOCard {
    protected String cardColor;
    private String cardType;
    private int cardValue;
    private String cardImg;
    
    public String[] Color={"Green","Yellow","Red","Blue","nocolor"}; 
    public String[] Type={"number","take 2","skip","reverse","wild","wild draw 4"};
    public Integer[] Value={0,1,2,3,4,5,6,7,8,9,20,50};
    public  String[] Image;
     
    public UNOCard(){
        super();
    }
    public UNOCard(String color,String type,int value,String img){
        this.cardColor=color;
        this.cardType=type;
        this.cardValue=value;
        this.cardImg=img;
    }
   	public String getCardColor() {
			return cardColor;
		}
		public String getCardType() {
			return cardType;
		}
		public int getCardValue() {
			return cardValue;
		}
		public String getCardImg() {
			return cardImg;
		}
		public void setCardColor(String cardColor) {
			this.cardColor = cardColor;
		}
		public void setCardType(String cardType) {
			this.cardType = cardType;
		}
		public void setCardValue(int cardValue) {
			this.cardValue = cardValue;
		}
		public void setCardImg(String cardImg) {
			this.cardImg = cardImg;
		} 
}
