/*
Brandon Goodwin
CS110
Assignment 10
*/
public class WarGame extends Deck
{
   private Card topP1, topP2, downP1, 
           downP2, upP1, upP2;
   private Deck deck;
   private Deck cardsP1;
   private Deck cardsP2; 
   private String winner;
   private boolean flag; 
   
  //makes deck 	 
  public WarGame()
  {
      deck = new Deck();         
      deck.shuffle();  
  }
   
  //gets cards for player 1	   
  public Deck getHandP1()
  {
      return cardsP1;
  }
   
   //gets cards for player 2
  public Deck getHandP2()
  {
      return cardsP2;
  }
  
  //deals the cards
   public void deal()
   {
      // Player 1
      cardsP1 = new Deck();
      cardsP1.clear();
      // Player 2
      cardsP2 = new Deck();
      cardsP2.clear();
      
      // Split deck between both players
      for(int i = 0; i < 26; i++)
      {
         cardsP1.add(deck.getTop());
         cardsP2.add(deck.getTop());
      }
   }

   
    //gets the top card of each players pile
    public void flip()
    {
      topP1 = cardsP1.getTop();
      topP2 = cardsP2.getTop();
    }
    
    
   //gets the string file of the card for player1
    public String getTopP1()
    {
      return topP1.cardFile();     
    }
    
   //gets string file of card for player 2  
    public String getTopP2()
    {
      return topP2.cardFile(); 
    }

   //gets image for player 1's war card 
   public String getUpP1()
   {
     return upP1.cardFile();
   }
   
   //gets image of player 2's war card
   public String getUpP2()
   {
     return upP2.cardFile();
   }
   
   //gets size of player ones pile  
   public int getSizeP1()
   {
      return cardsP1.size();
   }

   //gets size of player twos pile  
   public int getSizeP2()
   {
      return cardsP2.size();
   }
   
   //gets the winner of that round
   public void winner()
   {
      if (topP1.getRank() < (topP2.getRank())) // if player 2 wins
      {
         cardsP2.add(topP1);
         cardsP2.add(topP2);     
         winner = "Player 2 Wins the Round";
      }    
      else if (topP1.getRank() > (topP2.getRank())) // if player 1 wins          
      {  
         cardsP1.add(topP1); 
         cardsP1.add(topP2); 
         winner = "Player 1 Wins the Round";    
      }
      else 
      { 
         winner = "WAR!!!!!!!!";
         flag = true;
      }
                
                     
   }
   
   //simulates war between two cards
   public void warBattle()
   {
      // Get one card for war, and get next top card
      downP1 = cardsP1.getTop(); 
      downP2 = cardsP2.getTop();
      upP1 = cardsP1.getTop();
      upP2 = cardsP2.getTop(); 
      if (upP1.getRank() > (upP2.getRank())) // if player 1 wins
      {
         cardsP1.add(topP1);       
         cardsP1.add(topP2);           
         cardsP1.add(upP1);
         cardsP1.add(upP2);
         cardsP1.add(downP1);
         cardsP1.add(downP2);
         flag = false;              // ends war
         cardsP1.shuffle();         
         cardsP2.shuffle(); 
         winner = "Player 1 Won the War!"; 
      }
      else if (upP2.getRank() > (upP1.getRank())) // if player 2 wins
      {
         cardsP2.add(topP1);       
         cardsP2.add(topP2);           
         cardsP2.add(upP1);
         cardsP2.add(upP2);
         cardsP2.add(downP1);
         cardsP2.add(downP2);
         flag = false;              //ends war 
         cardsP1.shuffle();         
         cardsP2.shuffle(); 
         winner = "Player 2 Won the War!"; 
      } 
      else
      {  
         winner = "The War Isn't Over!";                     
      }
   }

  //determines status of war
  public boolean getFlag()
  {
   return flag;
  }

  //shows who won the round
   public String getWinMessage()
   {
      return winner;
   }   
}