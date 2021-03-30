public class GameEnemy {
    double width, height;
    int positionX, positionY;

    GameEnemy() {
    }

    GameEnemy(double width, double height) {
        this.width = width;
        this.height = height;
    }

    GameEnemy(double width, double height, int positionX, int positionY) {
        this.width = width;
        this.height = height;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public void setDimension(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setPosition(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public int getX() {
        return positionX;
    }

    public int getY() {
        return positionY;
    }

    void Run() {
        System.out.println("Enemy is running");
    }

    void Run(int incrementX) {
        positionX = positionX + incrementX;
    }

}