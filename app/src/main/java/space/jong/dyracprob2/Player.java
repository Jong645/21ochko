package space.jong.dyracprob2;



public class Player {

    private String name;
    private Hand hand;

    public Player() {

    }

    public Player(String name, Hand hand) {
        this.name = name;
        this.hand = hand;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newPlayer) {
        this.name = name;
    }

    public Hand getHand() {
        return this.hand;
    }

}