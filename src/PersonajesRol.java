public class PersonajesRol {
  private String name;
  private int HP;
  private int damage;
  private int vel;//define quien ataca primero
  private int defensa;

  public PersonajesRol(String name, int HP, int damage, int vel, int defensa) {
    this.name = name;
    this.HP = HP;
    this.damage = damage;
    this.vel = vel;
    this.defensa = defensa;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHP() {
    return HP;
  }

  public void setHP(int HP) {
    this.HP = HP;
  }

  public int getDamage() {
    return damage;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }

  public int getVel() {
    return vel;
  }

  public void setVel(int vel) {
    this.vel = vel;
  }

  public int getDefensa() {
    return defensa;
  }

  public void setDefensa(int defensa) {
    this.defensa = defensa;
  }

  //Turnos:


  //Ataque:
}


