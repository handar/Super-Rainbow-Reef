/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superRainbowReef;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

/**
 *
 * @author handa
 */
public abstract class Brick  {

    public static Brick[] blocks = new Brick[256];
//    public static Brick purpleBreakable = new purpleBreakable(0);
//    public static Brick yellowBreakable = new yellowBreakable(1);
//    public static Brick redBreakable = new redBreakable(2);
//    public static Brick greenBreakable = new greenBreakable(3);
//    public static Brick lightblueBreakable = new lightblueBreakable(4);
//    public static Brick lifeBreakable = new lifeBreakable(5);
    public static Brick solidUnbreakable = new solidUnbreakable(0);
//    public static Brick wallUnbreakable = new wallUnbreakable(7);
    public static Brick transparentUnbreakable = new transparentUnbreakable(1);
//    public static Brick bigLeg = new bigLegBreakable(9);

    protected static Rectangle entityCollider;
    protected int x;
    protected int y;
    public static final int TILEWIDTH = 40, TILEHEIGHT = 20;

    protected BufferedImage texture;
    protected final int id;

    public Brick(BufferedImage texture, int id) {
        this.texture = texture;
        this.id = id;

        blocks[id] = this;

        entityCollider = new Rectangle((int) getX(), (int) getY(), TILEWIDTH, TILEHEIGHT);

    }

    public void tick() {
        
    }
    
        protected boolean broken;

    public void render(Graphics g, int x, int y) {
          //if the bricks are not broken, draw them
        //if (!broken) {
            g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
        //}
        
//        //if the bricks intersect pop, then they cannot be drawn
//        if (entityCollider.intersects(GameState.pop.entityCollider)) {
//            broken = true;
//            System.out.println("haha");
//        }
        
        
        
        //g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);

        //g.setColor(Color.red);
        //g.fillRect(x, y, TILEWIDTH, TILEHEIGHT);

    }

    public boolean isSolid() {
        return false;
    }

    public int getId() {
        return id;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    

    
}
