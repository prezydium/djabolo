package sda.krzysztof.djabolo;


import sda.krzysztof.djabolo.actor.Monster;
import sda.krzysztof.djabolo.actor.Player;

import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Dungeon master says: Hello World!");
        Player player = PlayerCreator.createPlayer();
        List<Monster> monsters = MonsterCreationUtil.createMonsters();

        monsters.get(0).receiveDamage(player.attack());
        monsters.stream().filter(m -> m.isAlive())
                .forEach(singleMonster -> player.receiveDamage(singleMonster.attack()));
        System.out.println(monsters);
    }


}
