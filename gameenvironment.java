import java.util.ArrayList;
import java.util.*;

public class GameEnvironment {
    double width;
    double height;
    private ArrayList<GamePlayer> arrPlayer = new ArrayList<GamePlayer>();
    private ArrayList<GameEnemy> arrEnemy = new ArrayList<GameEnemy>();

    GameEnvironment() {
    }

    GameEnvironment(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void addPlayer(GamePlayer Player) {
        arrPlayer.add(Player);
    }

    public void removePlayer(GamePlayer Player) {
        arrPlayer.remove(Player);
    }

    public void getAllPlayer() {
        System.out.println("All player : " + arrPlayer);
    }

    public void addEnemy(GameEnemy Enemy) {
        arrEnemy.add(Enemy);
    }

    public void removeEnemy(GameEnemy Enemy) {
        arrEnemy.remove(Enemy);
    }

    public void getAllEnemy() {
        System.out.println(arrEnemy);
    }

    void interaction() {
        if (arrPlayer == null || arrEnemy == null) {
            System.out.println("Player or enemy not sets");
        }
        for (int i = 0; i < arrEnemy.size(); i++) {
            int j = 0;
            while (j < arrEnemy.size()) {
                if (arrPlayer.get(i).getY() != arrEnemy.get(j).getY()) {
                    System.out.println("Player : " + arrPlayer.get(i) + " and Enemy : " + arrEnemy.get(j)
                    + " not in the same Y position");
                }
                if (EuclideanDistance(arrPlayer.get(i).getX(), arrPlayer.get(i).getY(), arrEnemy.get(j).getX(),
                arrEnemy.get(i).getY()) < 2) {
                    System.out.println("Player : " + arrPlayer.get(i) + " Attacked");
                    System.out.println("Enemy : " + arrEnemy.get(j) + " loses");
                } else {
                    System.out.println("==> Player " + arrPlayer.get(i));
                    arrPlayer.get(i).Run((int) Math.ceil(Math.random() * 10));
                    System.out.println("Current x position = " + arrPlayer.get(i).getX() + " <==");
                }
                j++;
                
            }

        }
    }

    public double EuclideanDistance(int x1, int y1, int x2, int y2) {
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println(distance);
        return distance;

    }
}