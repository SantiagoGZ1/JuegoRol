package Charecters;

public class Character {

  private String personaje;
  private String name;
  private int hp;
  private int attackP;
  private int armor;

  public Character(String personje, String name, int hp, int attackP, int armor) {
    this.personaje = personje;
    this.name = name;
    this.hp = hp;
    this.attackP = attackP;
    this.armor = armor;
  }

  public String getPersonaje() {
    return personaje;
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

  public void attack(){
  }

  public void reciveAttack(int damage){
    if (damage > getArmor()){
      int excessDamage = damage - getArmor();
      setArmor(0);
      setHp(getHp() - excessDamage);
      System.out.println(getPersonaje());
      System.out.println(String.format("%s \nArmor: %d \nHP: %d ", getName(), getArmor(), getHp()));


    }else{
      setArmor(getArmor()- damage);
      System.out.println(getName() + "armor: " + getArmor());
    }

  }

  public void specialAttack(){
  }
}