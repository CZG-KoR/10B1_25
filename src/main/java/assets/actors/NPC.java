
package assets.actors;

import assets.GameAsset;
import javax.swing.ImageIcon;

public class NPC extends GameAsset{

    boolean alive;
    
    public NPC(int x, int y, ImageIcon img, String name) {
        super(x, y, img, name);
        this.alive = true;
    }
           

    @Override
    public void swim(int x, int y) {
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    
    
 
}
