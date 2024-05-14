package Charecters;

public class Warrior extends Character {
  private int shield;
  private int sword;

  public Warrior(String personaje,String name, int hp, int attackP, int armor, int shield, int sword) {
    super(personaje, name, hp, attackP, armor);
    this.shield = shield;
    this.sword = sword;
  }

  public int getSword() {
    return sword;
  }

  public void  attack(Character enemy, int weapon){
    System.out.println(getPersonaje());
    System.out.println(getName() + " WARRIOR ATTACK TO " + enemy.getName() + "\n");

    int damage = getAttackP() + weapon;
    enemy.reciveAttack(damage);
  }

  public void specialAttack(){
  //Eco del trueno

  }
  public void defend(){

  }
  public void furiaBerserker(int attack){

  }

}
