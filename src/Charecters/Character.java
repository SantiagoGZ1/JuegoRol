package Charecters;

public class Character {
  private String name;
  private int hp;
  private int attackP;
  private int armor;

  public Character(String name, int hp, int attackP, int armor) {
    this.name = name;
    this.hp = hp;
    this.attackP = attackP;
    this.armor = armor;
  }

  public String getName() {
    return name;
  }

  public int getHp() {
    return hp;
  }

  public int getAttackP() {
    return attackP;
  }

  public int getArmor() {
    return armor;
  }

  public void attack(){

  }

  public void specialAttack(){

  }
}