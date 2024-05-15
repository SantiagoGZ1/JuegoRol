package Charecters;

public class Robot extends Character {
  private int gun;
  private int mechaniclArm;
  private int rocket;
  public Robot(String personaje, String name, int hp, int attackP, int armor, int gun, int mechaniclArm, int rocket) {
    super(personaje, name, hp, attackP, armor);
    this.gun = gun;
    this.mechaniclArm = mechaniclArm;
    this.rocket = rocket;
  }

  public void attack(Character enemy, int weapon){
    System.out.println("");
  }
  public void specialAttack(){
  }
  public void venom(){

  }

}
