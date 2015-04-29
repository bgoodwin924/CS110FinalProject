/*
Brandon Goodwin
CS110
Assignment 10
*/
public class Card 
{
   //suits
   public final static int  SPADES = 0, HEARTS = 1,   
                            DIAMONDS = 2, CLUBS = 3;
   //special ranks
   public final static int ACE = 1, JACK = 11,        
                           QUEEN = 12, KING = 13;
   private int suit;   
                              
   private int rank;  
                       
  
   //Constructor creates cards	      	
   public Card(int r, int s)
    {
      rank = r;
      suit = s;
   }
   
   
   //gets the rank of the card   
   public int getRank() 
   {
      return rank;
   }
	
   //get suit of the card
   public int getSuit() 
   {
      return suit;
   }
   
   //converts rank into string form
   public String getRankString() 
   {
      switch ( rank ) 
      {
         case 1:   
            return "ace";
         case 2:   
            return "2";
         case 3:   
            return "3";
         case 4:   
            return "4";
         case 5:   
            return "5";
         case 6:   
            return "6";
         case 7:   
            return "7";
         case 8:   
            return "8";
         case 9:   
            return "9";
         case 10:  
            return "10";
         case 11:  
            return "jack";
         case 12:  
            return "queen";
         case 13:  
            return "king";
        default:
        	return " ";
      }
      
   }
    
   //converts suit into a string
   public String getSuitString() 
   {
      switch ( suit ) 
      {
         case 0:   
            return "s";
         case 1:   
            return "h";
         case 2:  
            return "d";
         case 3:    
            return "c";
         default:       
            return "Invalid";
      }
   }         
      
   //returns entire string of card
   public String toString() 
   {
      return getRankString() + " of " + getSuitString();
   }
  
  
   //puts together the name of the card file
   public String cardFile() 
   {
      return "cardpics/" + getRankString()+ getSuitString()+".jpg";
   }
    
  //compares two cards rank and suit
   public boolean equals(Card otherCard ) 
   {
      if ( ( rank == otherCard.rank ) || ( suit == otherCard.suit ) )
         return true;
      else
         return false;
   }
   
}