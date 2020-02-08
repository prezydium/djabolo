package sda.krzysztof.djabolo;


import sda.krzysztof.djabolo.actor.Player;

public class App {
    public static void main(String[] args) {
        System.out.println("Dungeon master says: Hello World!");
        Player player = PlayerCreator.createPlayer();
        System.out.println(player);
    }


}
