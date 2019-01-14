/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superRainbowReef;

import java.awt.Font;
import java.awt.Graphics;
import static superRainbowReef.Assets.pop;
import static superRainbowReef.Creature.score;


/**
 *
 * @author handa
 */
public class EndState extends State {

//    private World world2;
//
//    //player
//    protected static Katch katch;
//    protected static Pop pop;
//
//    //BigLegs 
//    protected static BigLeg bigleg;
//
//    //Walls
//    protected static purpleBreakable purpleBreakable3;

    public EndState(Handler handler) {
        super(handler);
//        world2 = new World(handler, "src/Resources/world.txt");
//        handler.setWorld(world2);
//        katch = new Katch(handler, 300, 380);
//        pop = new Pop(handler, 300, 380);
//        bigleg = new BigLeg(handler, 320, 20);
//        
//        //walls
//         purpleBreakable3 = new purpleBreakable(handler, 160, 80);
    }

    @Override
    public void tick() {
        //purpleBreakable3.tick();

    }

    @Override
    public void render(Graphics g) {
//        world2.render(g);
//        katch.render(g);
//        bigleg.render(g);
//        
//        purpleBreakable3.render(g);
//        
//        pop.render(g);
        g.drawImage(Assets.background, 0, 0, null);

        if (Pop.isLose()) {
            g.setFont(new Font("TimesRoman", Font.PLAIN, 25));
            g.drawString("SCORE: " + score, 100, 80);
           g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
           g.drawString("HAHA YOU LOSE", 100, 200);
        }
//        
//        if (Pop.isLose2()) {
//            g.setFont(new Font("TimesRoman", Font.PLAIN, 25));
//            g.drawString("SCORE: " + score, 100, 80);
//           g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
//           g.drawString("HAHA YOU LOSE AGAIN", 100, 200);
//        }

       if (Pop.isWin()) {
           g.setFont(new Font("TimesRoman", Font.PLAIN, 25));
            g.drawString("SCORE: " + score, 100, 80);
            g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
           g.drawString("WOW YOU WIN!!!!!", 100, 200);

           //State.setState(handler.getGame().gameState2);
//        }
    }

    }
}
