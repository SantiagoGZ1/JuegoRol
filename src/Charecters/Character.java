package Charecters;

import Gameplay.Gameplay;

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

  public void setName(String name) {
    this.name = name;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public void setAttackP(int attackP) {
    this.attackP = attackP;
  }

  public void setArmor(int armor) {
    this.armor = armor;
  }

  //------- Action Methods

  //TODO valid armor or hp
  public void attack(Character enemy, int weapon, Gameplay gameplay){
    System.out.println(getName() + " attack " + enemy.getName());
    int damage = getAttackP() + weapon;
    enemy.reciveAttack(damage, gameplay);
  }

  public void reciveAttack(int damage, Gameplay attackinfo){
    if (damage > getArmor()){
      int excessDamage = damage - getArmor();
      setArmor(0);
      setHp(getHp() - excessDamage);
      attackinfo.attackEventInfo();
      System.out.println(String.format("%s \nArmor: %d \nHP: %d ", getName(), getArmor(), getHp()));

    }else{
      setArmor(getArmor()- damage);
      System.out.println(getName() + "armor: " + getArmor());
    }

  }

  public void specialAttack(){

  }
}