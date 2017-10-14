import java.awt.*;

import static javafx.scene.input.KeyCode.Y;

class PointCoordinates {

    private int x, y;

    public PointCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {

        return y;
    }
@Override
    public String toString() {

        return "X=" + x + " " + "Y=" + y;
    }
}


