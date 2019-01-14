/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superRainbowReef;

import java.awt.Rectangle;
import java.util.ArrayList;

/**
 *
 * @author handa
 */
public abstract class Creature extends Entity {

    public static final int DEFAULT_HEALTH = 10;
    public static final float DEFAULT_SPEED = 3.0f;
    public static final int DEFAULT_CREATURE_WIDTH = 25,
            DEFAULT_CREATURE_HEIGHT = 25;

    protected int health;
    protected float speed;
    protected float xMove;
    protected float yMove;
    protected float baseMovement;

    protected static int score = 0;

    
      protected static int livesCount = 3;
      //protected static int livesCount2 = 3;

    protected static int bigLegCount;
    protected static int bigLegCount2;

    //-----------------------------------
//    
//    protected static int score2 = 0;
//    protected static int totalScore2 = 0;
//    
//    protected static int livesCount2 = 3;
//    protected static int totalLives2 = 0;
//    
//    protected static int bigLegCount2 = 0;
    public Creature(Handler handler, float x, float y, int width, int height) {
        super(handler, x, y, width, height);
        health = DEFAULT_HEALTH;
        speed = DEFAULT_SPEED;
        xMove = 0;
        yMove = 0;
        baseMovement = 0;

    }

    public void move() {
        //moveX();
        // moveY();
    }

    public void moveX() {

    }

    public void moveY() {

    }

//    protected boolean collisionWithTile(int x, int y) {
//        return handler.getWorld().getBrick(x, y).isSolid();
//    }
//    public int getHealth() {
//        return health;
//    }
    public float getSpeed() {
        return speed;
    }

//    /**
//     * @param health the health to set
//     */
//    public void setHealth(int health) {
//        this.health = health;
//    }
    /**
     * @param speed the speed to set
     */
    public void setSpeed(float speed) {
        this.speed = speed;
    }

    /**
     * @return the xMove
     */
    public float getxMove() {
        return xMove;
    }

    /**
     * @param xMove the xMove to set
     */
    public void setxMove(int xMove) {
        this.xMove = xMove;
    }

    /**
     * @return the yMove
     */
    public float getyMove() {
        return yMove;
    }

    /**
     * @param yMove the yMove to set
     */
    public void setyMove(int yMove) {
        this.yMove = yMove;
    }

    /**
     * @return the lose
     */
}
