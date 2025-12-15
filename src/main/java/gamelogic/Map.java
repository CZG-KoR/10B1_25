
package gamelogic;


public class Map {
    
    int[][] map;
    boolean light;
    
    public Map() {
        this.map = new int[][] {{0,0,1,0},{0,0,1,0},{0,0,1,0}};
        light = true;
    }

    public int[][] getMap() {
        return map;
    }

    public boolean isLight() {
        return light;
    }

    public void setLight(boolean light) {
        this.light = light;
    }
    
}
