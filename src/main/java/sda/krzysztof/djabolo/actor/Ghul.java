package sda.krzysztof.djabolo.actor;

import sda.krzysztof.djabolo.WeaponType;

public class Ghul extends Monster {

    public Ghul() {
        hp = 50;
        strength = 8;
        weaponType = WeaponType.UNARMED;
        alive = true;
    }

    @Override
    public int attack() {
        return 0;
    }
}
