import Charecters.Robot;
import Charecters.Warrior;

public class Main {
  public static void main(String[] args) {

    Warrior warrior = new Warrior("      _,.\n" +
        "    ,` -.)\n" +
        "   ( _/-\\\\-._\n" +
        "  /,|`--._,-^|            ,\n" +
        "  \\_| |`-._/||          ,'|\n" +
        "    |  `-, / |         /  /\n" +
        "    |     || |        /  /\n" +
        "     `r-._||/   __   /  /\n" +
        " __,-<_     )`-/  `./  /\n" +
        "'  \\   `---'   \\   /  /\n" +
        "    |           |./  /\n" +
        "    /           //  /\n" +
        "\\_/' \\         |/  /\n" +
        " |    |   _,^-'/  /\n" +
        " |    , ``  (\\/  /_\n" +
        "  \\,.->._    \\X-=/^\n" +
        "  (  /   `-._//^`\n" +
        "   `Y-.____(__}\n" +
        "    |     {__)\n" +
        "          ()", "Jose", 100, 20, 10, 40, 10);

    Robot robot = new Robot("     ____          ____\n" +
        "    |oooo|        |oooo|\n" +
        "    |oooo| .----. |oooo|\n" +
        "    |Oooo|/\\_||_/\\|oooO|\n" +
        "    `----' / __ \\ `----'\n" +
        "    ,/ |#|/\\/__\\/\\|#| \\,\n" +
        "   /  \\|#|| |/\\| ||#|/  \\\n" +
        "  / \\_/|_|| |/\\| ||_|\\_/ \\\n" +
        " |_\\/    o\\=----=/o    \\/_|\n" +
        " <_>      |=\\__/=|      <_>\n" +
        " <_>      |------|      <_>\n" +
        " | |   ___|======|___   | |\n" +
        "//\\\\  / |O|======|O| \\  //\\\\\n" +
        "|  |  | |O+------+O| |  |  |\n" +
        "|\\/|  \\_+/        \\+_/  |\\/|\n" +
        "\\__/  _|||        |||_  \\__/\n" +
        "      | ||        || |\n" +
        "     [==|]        [|==]\n" +
        "     [===]        [===]\n" +
        "      >_<          >_<\n" +
        "     || ||        || ||\n" +
        "     || ||        || ||\n" +
        "     || ||        || ||\n" +
        "   __|\\_/|__    __|\\_/|__\n" +
        "  /___n_n___\\  /___n_n___\\", "Alex", 100, 15, 5, 40, 85, 50);
    warrior.attack(robot, warrior.getSword());
    warrior.berserkerFury();
    warrior.attack(robot, warrior.getSword());
    warrior.specialAttack(robot);
// crear una clase no se donde
    //poner un switch case con dowhile pa que inicie el juego

  }
}

