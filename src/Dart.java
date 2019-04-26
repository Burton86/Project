import java.awt.Color;
import java.awt.Graphics;

public class Dart extends ProjectileFunction {

    public Dart(int xStart, int yStart, int xTarget, int yTarget, double velocity) {
        super(xStart, yStart, xTarget, yTarget, velocity);
    }

    @Override
    public void move() {
        x += xVelocity;
        y += yVelocity;
    }

    public void popBloons() {
        if (reachedTarget()) {
            for (int i = 0; i < BRunner.currentBloons.length; i ++) {
                if (BRunner.currentBloons[i].getCoordinates() == null) continue;

<<<<<<< HEAD
                int xCoordOfBloon = (BRunner.currentBloons[i].getCoordinates()[0] * BRunner.PATH_WIDTH) + (BRunner.PATH_WIDTH / 2);
                int yCoordOfBloon = (BRunner.currentBloons[i].getCoordinates()[1] * BRunner.PATH_WIDTH) + (BRunner.PATH_WIDTH / 2);
=======
                int xCoordOfBloon = (BRunner.currentBloons[i].getCoordinates()[0] * BloonsRunner.PATH_WIDTH) + (BloonsRunner.PATH_WIDTH / 2);
                int yCoordOfBloon = (BRunner.currentBloons[i].getCoordinates()[1] * BloonsRunner.PATH_WIDTH) + (BloonsRunner.PATH_WIDTH / 2);
>>>>>>> 93c91778771ea49dc275f70f3c3b04f796092e34

                if (xTarget == xCoordOfBloon && yTarget == yCoordOfBloon) {
                    BRunner.currentBloons[i].pop();
                }
            }
        }
    }

    public boolean reachedTarget() {
        if (xVelocity < 0) {
            if (x >= xTarget) return false;
        } else if (x <= xTarget) return false;

        if (yVelocity <= 0) {
            if (y >= yTarget) return false;
        } else if (y <= yTarget) return false;

        return true;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillOval(x - 4, y - 4, 8, 8);
    }
}

