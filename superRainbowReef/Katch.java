/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superRainbowReef;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

/**
 *
 * @author handa
 */
public class Katch extends Creature {

    private int angle, angle2, vx, vy;
    private float r = 6;
    private Rectangle health1, health2;
    AffineTransform rotation;

    public Katch(Handler handler, float x, float y) {
        super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);

        width = 80;
        height = 30;
        baseMovement = 3;
        entityCollider = new Rectangle((int) x, (int) y, width, height);

        //p1 = new Rectangle((int) x, (int) y, Assets.tank1.getWidth(), Assets.tank1.getHeight());
    }

    @Override
    public void tick() {

        getInputP1();
        // move();

        //handler.getGameCamera().centerOnEntity(this);
    }

    private void getInputP1() {

        xMove = 0;
        yMove = 0;

        if (handler.getKeyControl().moveRight) {
            this.moveForwards();
            x += baseMovement;
        }
        if (handler.getKeyControl().moveLeft) {
            this.moveBackwards();
            x -= baseMovement;
        }
        entityCollider.setLocation((int) x, (int) y);

    }
//        if (handler.getKeyControl().shoot) {
//            this.fire();
//        }
   

    //private void rotateLeft() {
    // this.angle -= 3;
    //}
    //private void rotateRight() {
    //this.angle += 3;
    // }
    private void moveBackwards() {
        vx = (int) Math.round(r * Math.cos(Math.toRadians(angle)));
        vy = (int) Math.round(r * Math.sin(Math.toRadians(angle)));
        x -= vx;
        y -= vy;

        //moveY(); //moves to left
        checkBorder();
    }

    private void moveForwards() {
        vx = (int) Math.round(r * Math.cos(Math.toRadians(angle)));
        vy = (int) Math.round(r * Math.sin(Math.toRadians(angle)));
        x += vx;
        y += vy;

        //moveX(); //moves to right
        checkBorder();

    }

    private void checkBorder() {
        if (x < 45) {
            x = 45;
        }
        if (x > 515) {
            x = 515;
        }
        if (y < 0) {
            y = 0;
        }
        if (y >= 460) {
            y = 460;

        }
    }

    public void rotate() {
        rotation = AffineTransform.getTranslateInstance(x, y);
        rotation.rotate(Math.toRadians(angle), Assets.katch.getWidth() / 2, Assets.katch.getHeight() / 2);

    }

    @Override
    public void render(Graphics g) {
        //g.drawImage(Assets.tank1, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);

        rotate();
        Graphics2D graphic2D = (Graphics2D) g;
        graphic2D.drawImage(Assets.katch, rotation, null);
        //Graphics2D graphic2D = (Graphics2D) g;

        //drawing of health bars
        //g.fillRect((int) (x + p1.x), (int) (y + p1.y), p1.width, p1.height);
        //g.fillRect((int) (x2 + p2.x), (int) (y2 + p2.y), p2.width, p2.height);
        //g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),
        //(int) (y + bounds.y - handler.getGameCamera().getyOffset()),
        //bounds.width, bounds.height);
        //g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        g.setColor(Color.WHITE);
        g.drawString("SCORE: " + score, 100,40); 
        
        
    }

}
