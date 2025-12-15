package assets.actors;

import assets.GameAsset;
import gamelogic.Inventory;
import javax.swing.ImageIcon;

public class Axolotl extends GameAsset {

    int velocity, hunger;
    Inventory inv;

    public Axolotl(int x, int y, ImageIcon img, String name) {
        super(x, y, img, name);
        this.hunger = 10;
        this.velocity = 5;

    }

    public Axolotl(int damage, int velocity, int healthpoints, int bounty, int x, int y, ImageIcon img, String name) {
        super(x, y, img, name);
        this.hunger = hunger;
        this.velocity = velocity;
    }
    
    
    public void update() {
    
    }

    public int getHunger() {
        return hunger;
    }


    public int getVelocity() {
        return velocity;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
 

}
