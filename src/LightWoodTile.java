import java.awt.Color;
import java.awt.Graphics;

public class LightWoodGameTile extends Tile {
    public int getType() {
        return Tile.GAME_TILE;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(new Color(247, 231, 158));
        g.fillRect(x, y, BRunner.PATH_WIDTH, BloonsRunner.PATH_WIDTH);
    }
}

