package Charecters;

public class Warrior extends Character {

  private int shield;
  private int sword;

  public Warrior(String name, int hp, int attackP, int armor, int shield, int sword) {
    super(name, hp, attackP, armor);
    this.shield = shield;
    this.sword = sword;
  }

  public int getSword() {
    return sword;
  }

  public void specialAttack(){

  }
  public void defend(){

  }
  public void furiaBerserker(int attack){

  }

}
