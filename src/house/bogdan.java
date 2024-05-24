package house;

public class bogdan {
    public static void main(String[] args) {
        Human bogdan = new Human("секрет","новость","опыт", "сплетня");
        System.out.println(bogdan.getGossip());
        System.out.println(bogdan.getExperience());
        System.out.println(bogdan.getNews());
        Child vova = new Child("секрет","новость","опыт", "сплетня", "игра");
        System.out.println(vova.getGame());
        Human chelomey =  new Child("секрет","новость","опыт", "сплетня","игра");
        System.out.println(chelomey.getNews());
    }
}
