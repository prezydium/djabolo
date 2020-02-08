package sda.krzysztof.djabolo.actor;

import sda.krzysztof.djabolo.WeaponType;

public abstract class Creature {

    protected int hp;
    protected int strength;
    protected boolean alive;
    protected WeaponType weaponType;

    public void receiveDamage(int dmg) {
        hp -= dmg;
        if (hp <= 0){
            alive = false;
        }
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }
}
