package assets.actors;

import assets.GameAsset;
import javax.swing.ImageIcon;

public class Player extends GameAsset {
    
    int hp;
    
    public Player(int x, int y, ImageIcon img, String name) {
        super(x, y, img, name);
        this.hp = 1000;
    }

    @Override
    public void swim(int x, int y) {

    }
    
    public void attack(int direction) {

    }
    
}
