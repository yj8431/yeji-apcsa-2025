package cards;
import java.util.Random;

public class Deck {

    private int top;
    Card[] deck = new Card[52];

    public Deck()
    {
        //Card[] deck = new Card[52];
        int top = 0;
        for (int i=0; i<13; i++)
        {
            deck[i] = new Card(0,i);
        }
        for (int i=13; i<26; i++)
        {
            deck[i] = new Card(1,i);
        }
        for (int i=26; i<39; i++)
        {
            deck[i] = new Card(2,i);
        }
        for (int i=39; i<52; i++)
        {
            deck[i] = new Card(3,i);
        }
    }

    public void shuffle()
    {
        //randomizes order of deck
        for (int i=deck.length; i>0; i--)
        {
            int randnum = (int) (Math.random()*(i+1));
            deck[]
        }

    }

    public void cut(int position)
    {

    }

    public String draw()
    {

    }

    public void print(int )
}
