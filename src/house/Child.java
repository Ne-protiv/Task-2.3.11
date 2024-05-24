package house;

public class Child extends Human {
    private final String game;

    public Child(String secret, String news, String experience, String gossip, String game) {
        super(secret, news, experience, gossip);
        this.game = game;
    }
    public String getGame()  {
        return game;
    }
}

