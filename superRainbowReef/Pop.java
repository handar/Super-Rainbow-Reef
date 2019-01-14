/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superRainbowReef;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;

import static superRainbowReef.GameState.katch;
import static superRainbowReef.GameState.pop;
import static superRainbowReef.GameState.bigleg;
import static superRainbowReef.GameState2.bigleg2;
import static superRainbowReef.GameState2.katch2;
import static superRainbowReef.GameState2.pop2;

/**
 *
 * @author handa
 */
public class Pop extends Creature {

    protected static boolean lose;
    protected static boolean lose2;

    protected static boolean win;
    //protected static boolean win2;

    protected float angle;
    //protected float x;
    //protected float y;
    protected float r = 6;

    AffineTransform transform;

    public Pop(Handler handler, float x, float y) {
        super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);

        width = 35;
        height = 35;

        baseMovement = 3; //-3 to change direction for later
        x = baseMovement;
        y = baseMovement;

        yMove = -2;
        xMove = 2;

        entityCollider = new Rectangle((int) x, (int) y, width, height);

    }

    @Override
    public void tick() {

        //checkBorder();
        setX(x + xMove);
        setY(y + yMove);

        //level 1
        if (entityCollider.intersects(GameState.katch.entityCollider)) {
            yMove = -baseMovement;
//            xMove = (float) -(baseMovement * Math.cos(Math.toRadians(angle)));
//            yMove = (float) -(baseMovement * Math.sin(Math.toRadians(angle)));

        }

        //level 2     
        if (entityCollider.intersects(GameState2.katch2.entityCollider)) {
            yMove = -baseMovement;
//            xMove = (float) -(baseMovement * Math.cos(Math.toRadians(angle)));
//            yMove = (float) -(baseMovement * Math.sin(Math.toRadians(angle)));

        }

        if (y <= height - 20) { //height
            //this.moveBackwards();
            yMove = baseMovement;

        }

        if (y >= handler.getGame().getHeight()) {
            yMove = -baseMovement;

            pop = new Pop(handler, 300, 380);
            katch = new Katch(handler, 300, 380);
            
            //livesCount--;

            pop2 = new Pop(handler, 300, 380);
            katch2 = new Katch(handler, 300, 380);

            livesCount--;

        }

        if (livesCount == 0) {
            System.out.println("Live 0 lose");
            lose = true;
            State.setState(handler.getGame().endState);

        }

//        if (livesCount2 == 0) {
//            System.out.println("OMG TRUE 2 go to endstate2");
//            
//           // lose = true;
//            State.setState(handler.getGame().endState2);
//            livesCount2 = 0;
//
//        }

//        if (y >= handler.getGame().getHeight()) {
//            yMove = -baseMovement;
//
//            GameState2.pop2 = new Pop(handler, 300, 380);
//            GameState2.katch2 = new Katch(handler, 300, 380);
//
//            livesCount2--;
//
//            if (livesCount2 == 0) {
//                lose2 = true;
//                State.setState(handler.getGame().endState);
//
//            }
//        }
        if (x <= width) { //width
            //this.moveForwards();
            xMove = baseMovement;
            //changeVelocity(-1,1);

        }

        if (x + width >= handler.getGame().getWidth() - width) {
            //this.moveForwards();
            xMove = -baseMovement;

        }

        if (bigLegCount == 1) {
            //win = true;
            //bigLegCount = 0;
            State.setState(handler.getGame().gameState2);
            katch.entityCollider.width = 0;
            katch.entityCollider.height = 0;

            bigleg.entityCollider.width = 0;
            bigleg.entityCollider.height = 0;

        }

        if (bigLegCount2 == 1) {
            win = true;
            //bigLegCount2 = 0;
            State.setState(handler.getGame().endState);

        }

        entityCollider.setLocation((int) getX(), (int) getY());

    }
//        private void moveBackwards() {
//        vx = (int) Math.round(r * Math.cos(Math.toRadians(angle)));
//        vy = (int) Math.round(r * Math.sin(Math.toRadians(angle)));
//        x -= vx;
//        y -= vy;
//
//        //moveY(); //moves to left
//    }

//    private void moveForwards() {
//        vx = (int) Math.round(r * Math.cos(Math.toRadians(angle)));
//        vy = (int) Math.round(r * Math.sin(Math.toRadians(angle)));
//        x += vx;
//        y += vy;
//
//        //moveX(); //moves to right
//
//    }
    private void checkBorder() {
        if (x < 45) {
            x = 45;
        }
        if (x > 560) {
            x = 560;
        }
        if (y < 0) {
            y = 0;
        }
        if (y >= 560) {
            y = 560;

        }
    }

    public void changeVelocity(int x, int y) {
        xMove *= x;
        yMove *= y;
    }

    private void rotate() {
        this.angle += 3;
    }

    @Override
    public void render(Graphics g) {
        rotate();

        transform = AffineTransform.getTranslateInstance(x, y);
        transform.rotate(Math.toRadians(angle), Assets.pop.getWidth() / 2, Assets.pop.getHeight() / 2);

        Graphics2D graphic2D = (Graphics2D) g;

        //if (handler.getKeyControl().shoot) {
        graphic2D.drawImage(Assets.pop, transform, null);

        //moveForwards();
        //}
    }

    //g.fillRect((int) (x + bull.x), (int) (y + bull.y), bull.width, bull.height);
    //graphic2D.drawImage(Assets.bullet, rotation2, null);
    public int getPopWidth() {
        return Assets.pop.getWidth();
    }

    public int getPopHeight() {
        return Assets.pop.getHeight();
    }

    /**
     * @return the x
     */
    public float getX() {
        return x;
    }

    /**
     * @return the y
     */
    public float getY() {
        return y;
    }

    /**
     * @param x the x to set
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * @param y the y to set
     */
    public void setY(float y) {
        this.y = y;
    }

    //allows us to flip the ball 
    /**
     * @return the lose
     */
    public static boolean isLose() {
        return lose;
    }

//    public static boolean isLose2() {
//        return lose2;
//    }
    public static boolean isWin() {
        return win;
    }
}
