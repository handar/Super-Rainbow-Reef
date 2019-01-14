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
public class BigLeg2 extends Creature {
    

    
    protected boolean broken;

    public BigLeg2(Handler handler, float x, float y) {
        super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
        width = 40;
        height = 40;

        entityCollider = new Rectangle((int) x, (int) y, width, height);

    }

    @Override
    public void tick() {
        //entityCollider.setLocation((int) getX(), (int) getY());
        
        //level 2
        if (entityCollider.intersects(GameState2.pop2.entityCollider)) {
            broken = true;
            GameState2.pop2.yMove = GameState2.pop2.baseMovement;
            // resize the rectangle to not show up anymore
            entityCollider.width = 0;
            entityCollider.height = 0;
            score++;
            bigLegCount2++;

        }
        
//         //level 2
//        if (entityCollider.intersects(GameState2.pop2.entityCollider)) {
//            broken = true;
//            GameState2.pop2.yMove = GameState2.pop2.baseMovement;
//            // resize the rectangle to not show up anymore
//            entityCollider.width = 0;
//            entityCollider.height = 0;
//            score++;
//            bigLegCount2++;
//
//        }
        
      //totalScore = score;  

    }

    @Override
    public void render(Graphics g) {

        if (!broken) {
            g.drawImage(Assets.bigLeg, (int) getX(), (int) getY(), null);
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
