/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superRainbowReef;

import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author handa
 */
public class yellowBreakable extends Creature {

    protected boolean broken;

    public yellowBreakable(Handler handler, float x, float y) {
        super(handler, x, y, 40, 20);
        width = 40;
        height = 20;

        entityCollider = new Rectangle((int) x, (int) y, width, height);

    }

    @Override
    public void tick() {
        //entityCollider.setLocation((int) getX(), (int) getY());
        
        //level 1
        if (entityCollider.intersects(GameState.pop.entityCollider)) {
            broken = true;
            GameState.pop.yMove = GameState.pop.baseMovement;
            // resize the rectangle to not show up anymore
            entityCollider.width = 0;
            entityCollider.height = 0;
            score++;
        }
        
         //level 2
        if (entityCollider.intersects(GameState2.pop2.entityCollider)) {
            broken = true;
            GameState2.pop2.yMove = GameState2.pop2.baseMovement;
            // resize the rectangle to not show up anymore
            entityCollider.width = 0;
            entityCollider.height = 0;
            score++;
        }

    }

    @Override
    public void render(Graphics g) {

        if (!broken) {
            g.drawImage(Assets.yellowBreakable, (int) getX(), (int) getY(), null);
        }

//        if (entityCollider.intersects(GameState.pop.entityCollider)) {
////            GameState.pop.xMove = (float) (baseMovement * Math.cos(Math.toRadians(GameState.pop.angle)));
////            GameState.pop.yMove = (float) -(baseMovement * Math.sin(Math.toRadians(GameState.pop.angle)));
////            GameState.pop.xMove = -baseMovement;
////            GameState.pop.yMove = -baseMovement;
//            broken = true;
//            entityCollider = new Rectangle((int) x, (int) y, 0, 0);
//            score++;
//            //System.out.println(score);
//            //GameState.pop.changeVelocity(1, -1);
//        }
    }
}
