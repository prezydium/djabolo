package sda.krzysztof.djabolo.actor;

import sda.krzysztof.djabolo.AbleToAttack;
import sda.krzysztof.djabolo.WeaponType;

public class Player extends Creature implements AbleToAttack {

    public Player(WeaponType playerWeapon) {
        hp = 100;
        strength = 15;
        weaponType = playerWeapon;
        alive = true;
    }

    @Override
    public int attack() {
        if (weaponType.equals(WeaponType.MACE)){
            hp += 5;
        }
        return strength + weaponType.getDamage() + 1;
    }

}
