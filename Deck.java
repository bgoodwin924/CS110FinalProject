/*
Brandon Goodwin
CS110
Assignment 10
*/
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Deck
{
   private ArrayList<Card> deck; // Deck
 
   //makes deck
   public Deck()
   {
     newDeck();
   }
    
   //creates new deck
   public void newDeck()
   {
      deck = new ArrayList<Card>(); 
      //adds all cards into the deck
      for (int r = Card.ACE; r<=Card.KING; r++)
      {
         for (int s = Card.SPADES; s <= Card.CLUBS; s++)
         {
            deck.add(new Card(r,s));
         }
      }
   }
   
   //add a card to the deck
   public void add(Card newCard)
   {
      deck.add(newCard);
   }

   //gets the top card of the deck
   public Card getTop()
   {
      return deck.remove(0);
   }
   
 	//gets the size of the deck
   public int size()
   {
      return deck.size();
   }
       
   //shuffles the deck    
   public void shuffle()
   {  
      Card temp;
      int rand;
      Random r = new Random();
      for (int i = 0; i < deck.size(); i++)
      {
         rand = r.nextInt(deck.size());
         temp = deck.get(i);                
         deck.set(i,deck.get(rand));
         deck.set(rand,temp);
      }      
   } 
   
   
   //checks if deck is empty 
   public boolean isEmpty()
   {
      return (deck.size() == 0);
   }
   
    
   //clears all the cards in the deck   
   public void clear()
   {
      deck.clear();
   } 

   //returns the arraylist in string form    
   public String toString()
   {
      return deck.toString();
   }
       
}