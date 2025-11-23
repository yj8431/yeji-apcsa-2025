package cards;
import java.util.Random;

public class Deck {

    private int top;
    private Card[] deck;
    //Card[] deck = new Card[52];

    public Deck()
    {
        deck = new Card[52];
        int top = 0;
        
        int index = 0;
        for (int suit = 0; suit<4; suit++)
        {
            for (int value = 0; value<13; value++)
            {
                deck[index] = new Card(suit, value);
                index++;
            }
        }
        
    }

    public void shuffle()
    {
        //randomizes order of deck
        for (int i=deck.length-1; i>0; i--)
        {
            int j = (int) (Math.random()*(i+1));
            Card temp = deck[j];
            deck[i] = deck[j];
            deck[j] = temp;
        }

    }

    public void cut(int position)
    {
        Card[] newDeck = new Card[52];
        int idx = 0;
        for (int i=position; i<52; i++)
        {
            newDeck[idx] = deck[i];
            idx++;
        }
        for(int i=0; i<position; i++)
        {
            newDeck[idx] = deck[i];
            idx++;
        }
        deck = newDeck;
    }

    public Card draw()
    {
        if (top>=52)
        {
            return null;
        }
        return deck[top++];
    }

    public void print(int cardposition)
    {
        for (int i=0; i<cardposition; i++)
        {
            System.out.print(deck[i] + " ");
        }
    }
}
