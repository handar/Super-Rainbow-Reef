/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superRainbowReef;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.ImageIcon;   
import javax.swing.JLabel;
import static superRainbowReef.BigLeg.livesCount;

/**
 *
 * @author handa
 */
public class GameState extends State {

    //world for level 1
    private World world;

    //player
    protected static Katch katch;
    protected static Pop pop;

    //BigLegs 
    protected static BigLeg bigleg;
    //protected static BigLeg bigleg2;

    //WALLS
    protected static purpleBreakable purpleBreakable1;
    protected static purpleBreakable purpleBreakable2;
 
    protected static yellowBreakable yellowBreakable1;
    protected static yellowBreakable yellowBreakable2;
    protected static yellowBreakable yellowBreakable3;
    protected static yellowBreakable yellowBreakable4;
    protected static yellowBreakable yellowBreakable5;
    protected static yellowBreakable yellowBreakable6;
    protected static yellowBreakable yellowBreakable7;
    protected static yellowBreakable yellowBreakable8;
    protected static yellowBreakable yellowBreakable9;
    protected static yellowBreakable yellowBreakable10;
    protected static yellowBreakable yellowBreakable11;
    protected static yellowBreakable yellowBreakable12;
    protected static yellowBreakable yellowBreakable13;
    protected static yellowBreakable yellowBreakable14;
    protected static yellowBreakable yellowBreakable15;
    protected static yellowBreakable yellowBreakable16;
    protected static yellowBreakable yellowBreakable17;

    protected static redBreakable redBreakable1;
    protected static redBreakable redBreakable2;
    protected static redBreakable redBreakable3;
    protected static redBreakable redBreakable4;
    protected static redBreakable redBreakable5;

    protected static greenBreakable greenBreakable1;
    protected static greenBreakable greenBreakable2;
    protected static greenBreakable greenBreakable3;
    protected static greenBreakable greenBreakable4;

    protected static lightblueBreakable lightblueBreakable1;
    protected static lightblueBreakable lightblueBreakable2;
    protected static lightblueBreakable lightblueBreakable3;

    protected static lifeBreakable lifeBreakable1;
    protected static lifeBreakable lifeBreakable2;
    
    protected static boolean gameState;

//    protected static solidUnbreakable solidUnbreakable2;
//    protected static solidUnbreakable solidUnbreakable3;
//    protected static solidUnbreakable solidUnbreakable4;
//    protected static solidUnbreakable solidUnbreakable5;
    public GameState(Handler handler) {
        super(handler);
        world = new World(handler, "src/Resources/world.txt");
        handler.setWorld(world);
        katch = new Katch(handler, 300, 380);
        pop = new Pop(handler, 300, 380);
        bigleg = new BigLeg(handler, 320, 20);
        //bigleg2 = new BigLeg(handler, 560, 100);

        //WALLS 
        yellowBreakable6 = new yellowBreakable(handler, 120, 60);
        yellowBreakable5 = new yellowBreakable(handler, 160, 60);
        purpleBreakable1 = new purpleBreakable(handler, 200, 60);
        yellowBreakable1 = new yellowBreakable(handler, 240, 60);
        redBreakable1 = new redBreakable(handler, 280, 60);
        greenBreakable1 = new greenBreakable(handler, 320, 60);
        lifeBreakable1 = new lifeBreakable(handler, 360, 60);
        lightblueBreakable1 = new lightblueBreakable(handler, 400, 60);
        yellowBreakable3 = new yellowBreakable(handler, 440, 60);
        yellowBreakable4 = new yellowBreakable(handler, 480, 60);
        redBreakable3 = new redBreakable(handler, 520, 60);

        redBreakable4 = new redBreakable(handler, 120, 80);
        purpleBreakable2 = new purpleBreakable(handler, 160, 80);
        yellowBreakable2 = new yellowBreakable(handler, 200, 80);
        redBreakable2 = new redBreakable(handler, 240, 80);
        greenBreakable2 = new greenBreakable(handler, 280, 80);
        lightblueBreakable2 = new lightblueBreakable(handler, 320, 80);
        lifeBreakable2 = new lifeBreakable(handler, 360, 80);
        greenBreakable3 = new greenBreakable(handler, 400, 80);
        greenBreakable4 = new greenBreakable(handler, 440, 80);
        lightblueBreakable3 = new lightblueBreakable(handler, 480, 80);
        redBreakable5 = new redBreakable(handler, 520, 80);

        yellowBreakable7 = new yellowBreakable(handler, 120, 100);
        yellowBreakable8 = new yellowBreakable(handler, 160, 100);
        yellowBreakable9 = new yellowBreakable(handler, 200, 100);
        yellowBreakable10 = new yellowBreakable(handler, 240, 100);
        yellowBreakable11 = new yellowBreakable(handler, 280, 100);
        yellowBreakable12 = new yellowBreakable(handler, 320, 100);
        yellowBreakable13 = new yellowBreakable(handler, 360, 100);
        yellowBreakable14 = new yellowBreakable(handler, 400, 100);
        yellowBreakable15 = new yellowBreakable(handler, 440, 100);
        yellowBreakable16 = new yellowBreakable(handler, 480, 100);
        yellowBreakable17 = new yellowBreakable(handler, 520, 100);
        
//        if (Pop.isWin()){
//            purpleBreakable3 = new purpleBreakable(handler, 200, 60); 
//        }

    }

    @Override
    public void tick() {
        world.tick();
        katch.tick();
        pop.tick();
        bigleg.tick();
        //bigleg2.tick();

        //WALLS
        purpleBreakable1.tick();
        purpleBreakable2.tick();
        
        //purpleBreakable3.collide();

        yellowBreakable1.tick();
        yellowBreakable2.tick();
        yellowBreakable3.tick();
        yellowBreakable4.tick();
        yellowBreakable5.tick();
        yellowBreakable6.tick();
        yellowBreakable7.tick();
        yellowBreakable8.tick();
        yellowBreakable9.tick();
        yellowBreakable10.tick();
        yellowBreakable11.tick();
        yellowBreakable12.tick();
        yellowBreakable13.tick();
        yellowBreakable14.tick();
        yellowBreakable15.tick();
        yellowBreakable16.tick();
        yellowBreakable17.tick();

        redBreakable1.tick();
        redBreakable2.tick();
        redBreakable3.tick();
        redBreakable4.tick();
        redBreakable5.tick();

        greenBreakable1.tick();
        greenBreakable2.tick();
        greenBreakable3.tick();
        greenBreakable4.tick();

        lightblueBreakable1.tick();
        lightblueBreakable2.tick();
        lightblueBreakable3.tick();

        lifeBreakable1.tick();
        lifeBreakable2.tick();

    }

    @Override
    public void render(Graphics g) {
        world.render(g);
        katch.render(g);
        bigleg.render(g);
        //bigleg2.render(g);

        //WALLS
        purpleBreakable1.render(g);
        purpleBreakable2.render(g);
        
        //purpleBreakable3.render(g);

        yellowBreakable1.render(g);
        yellowBreakable2.render(g);
        yellowBreakable3.render(g);
        yellowBreakable4.render(g);
        yellowBreakable5.render(g);
        yellowBreakable6.render(g);
        yellowBreakable7.render(g);
        yellowBreakable8.render(g);
        yellowBreakable9.render(g);
        yellowBreakable10.render(g);
        yellowBreakable11.render(g);
        yellowBreakable12.render(g);
        yellowBreakable13.render(g);
        yellowBreakable14.render(g);
        yellowBreakable15.render(g);
        yellowBreakable16.render(g);
        yellowBreakable17.render(g);

        redBreakable1.render(g);
        redBreakable2.render(g);
        redBreakable3.render(g);
        redBreakable4.render(g);
        redBreakable5.render(g);

        greenBreakable1.render(g);
        greenBreakable2.render(g);
        greenBreakable3.render(g);
        greenBreakable4.render(g);

        lightblueBreakable1.render(g);
        lightblueBreakable2.render(g);
        lightblueBreakable3.render(g);

        lifeBreakable1.render(g);
        lifeBreakable2.render(g);

        pop.render(g);
        
        g.drawString("Lives: " + livesCount, 100,450); 

    }

}
