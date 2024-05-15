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
    System.out.println("**" + getName() + " WARRIOR ATTACK TO " + enemy.getName() + "**");
    int damage = getAttackP() + weapon;
    enemy.reciveAttack(damage);
  }

  public void specialAttack(Character enemy){
  //Thunder eco
    System.out.println("                         .                                               \n" +
        "                     /   ))     |\\         )               ).           \n" +
        "               c--. (\\  ( `.    / )  (\\   ( `.     ).     ( (           \n" +
        "               | |   ))  ) )   ( (   `.`.  ) )    ( (      ) )          \n" +
        "               | |  ( ( / _..----.._  ) | ( ( _..----.._  ( (           \n" +
        " ,-.           | |---) V.'-------.. `-. )-/.-' ..------ `--) \\._        \n" +
        " | /===========| |  (   |      ) ( ``-.`\\/'.-''           (   ) ``-._   \n" +
        " | | / / / / / | |--------------------->  <-------------------------_>=-\n" +
        " | \\===========| |                 ..-'./\\.`-..                _,,-'    \n" +
        " `-'           | |-------._------''_.-'----`-._``------_.-----'         \n" +
        "               | |         ``----''            ``----''                  \n" +
        "               | |                                                       \n" +
        "               c--`                                                   \n** THE WARRIOR USED THUNDER ECO **");
    int damageThunderEco = 38;
    enemy.reciveAttack(damageThunderEco);

  }
  //TODO defend logic when I create the other player
  public void defend(){

  }
  public void berserkerFury(){
    //increase attack
    System.out.println("⠀⠀⠀⠀⠀⠀⢱⣆⠀⠀⠀⠀⠀⠀\n" +
        "⠀⠀⠀⠀⠀⠀⠈⣿⣷⡀⠀⠀⠀⠀\n" +
        "⠀⠀⠀⠀⠀⠀⢸⣿⣿⣷⣧⠀⠀⠀\n" +
        "⠀⠀⠀⠀⡀⢠⣿⡟⣿⣿⣿⡇⠀⠀\n" +
        "⠀⠀⠀⠀⣳⣼⣿⡏⢸⣿⣿⣿⢀⠀\n" +
        "⠀⠀⠀⣰⣿⣿⡿⠁⢸⣿⣿⡟⣼⡆\n" +
        "⢰⢀⣾⣿⣿⠟⠀⠀⣾⢿⣿⣿⣿⣿\n" +
        "⢸⣿⣿⣿⡏⠀⠀⠀⠃⠸⣿⣿⣿⡿\n" +
        "⢳⣿⣿⣿⠀⠀⠀⠀⠀⠀⢹⣿⡿⡁\n" +
        "⠀⠹⣿⣿⡄⠀⠀⠀⠀⠀⢠⣿⡞⠁\n" +
        "⠀⠀⠈⠛⢿⣄⠀⠀⠀⣠⠞⠋⠀⠀\n" +
        "⠀⠀⠀⠀⠀⠀⠉⠀⠀⠀⠀⠀⠀⠀");
    System.out.println("Warrior attack increase +5");
    setAttackP(getAttackP()+ 5);
  }

}
