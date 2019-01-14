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
import static superRainbowReef.Creature.livesCount;
import static superRainbowReef.Pop.lose;

/**
 *
 * @author handa
 */
public class GameState2 extends State {

    //world for level 2
    private World world2;

    //player
    protected static Katch katch2;
    protected static Pop pop2;

    //BigLegs 
    protected static BigLeg2 bigleg2;

    //WALLS
    protected static purpleBreakable purpleBreakable122;
    protected static purpleBreakable purpleBreakable222;

    protected static yellowBreakable yellowBreakable122;
    protected static yellowBreakable yellowBreakable222;
    protected static yellowBreakable yellowBreakable322;
    protected static yellowBreakable yellowBreakable422;
    protected static yellowBreakable yellowBreakable522;
    protected static yellowBreakable yellowBreakable622;
    protected static yellowBreakable yellowBreakable722;
    protected static yellowBreakable yellowBreakable822;
    protected static yellowBreakable yellowBreakable922;
    protected static yellowBreakable yellowBreakable1022;
    protected static yellowBreakable yellowBreakable1122;
    protected static yellowBreakable yellowBreakable1222;
    protected static yellowBreakable yellowBreakable1322;
    protected static yellowBreakable yellowBreakable1422;
    protected static yellowBreakable yellowBreakable1522;
    protected static yellowBreakable yellowBreakable1622;
    protected static yellowBreakable yellowBreakable1722;

    protected static redBreakable redBreakable122;
    protected static redBreakable redBreakable222;
    protected static redBreakable redBreakable322;
    protected static redBreakable redBreakable422;
    protected static redBreakable redBreakable522;

    protected static greenBreakable greenBreakable122;
    protected static greenBreakable greenBreakable222;
    protected static greenBreakable greenBreakable322;
    protected static greenBreakable greenBreakable422;

    protected static lightblueBreakable lightblueBreakable122;
    protected static lightblueBreakable lightblueBreakable222;
    protected static lightblueBreakable lightblueBreakable322;

    protected static lightblueBreakable lightblueBreakable422;
    protected static lightblueBreakable lightblueBreakable522;
    protected static lightblueBreakable lightblueBreakable622;
    protected static lightblueBreakable lightblueBreakable722;
    protected static lightblueBreakable lightblueBreakable822;
    protected static lightblueBreakable lightblueBreakable922;
    protected static lightblueBreakable lightblueBreakable1022;
    protected static lightblueBreakable lightblueBreakable1122;
    protected static lightblueBreakable lightblueBreakable1222;
    protected static lightblueBreakable lightblueBreakable1322;
    protected static lightblueBreakable lightblueBreakable1422;

    protected static lifeBreakable lifeBreakable122;
    protected static lifeBreakable lifeBreakable222;

    public GameState2(Handler handler) {
        super(handler);
        world2 = new World(handler, "src/Resources/world.txt");
        handler.setWorld(world2);
        katch2 = new Katch(handler, 300, 380);
        pop2 = new Pop(handler, 300, 380);
        bigleg2 = new BigLeg2(handler, 200, 20);

        //WALLS 
        yellowBreakable622 = new yellowBreakable(handler, 120, 60);
        yellowBreakable522 = new yellowBreakable(handler, 160, 60);
        purpleBreakable122 = new purpleBreakable(handler, 200, 60);
        yellowBreakable122 = new yellowBreakable(handler, 240, 60);
        redBreakable122 = new redBreakable(handler, 280, 60);
        greenBreakable122 = new greenBreakable(handler, 320, 60);
        lifeBreakable122 = new lifeBreakable(handler, 360, 60);
        lightblueBreakable122 = new lightblueBreakable(handler, 400, 60);
        yellowBreakable322 = new yellowBreakable(handler, 440, 60);
        yellowBreakable422 = new yellowBreakable(handler, 480, 60);
        redBreakable322 = new redBreakable(handler, 520, 60);

        redBreakable422 = new redBreakable(handler, 120, 80);
        purpleBreakable222 = new purpleBreakable(handler, 160, 80);
        yellowBreakable222 = new yellowBreakable(handler, 200, 80);
        redBreakable222 = new redBreakable(handler, 240, 80);
        greenBreakable222 = new greenBreakable(handler, 280, 80);
        lightblueBreakable222 = new lightblueBreakable(handler, 320, 80);
        lifeBreakable222 = new lifeBreakable(handler, 360, 80);
        greenBreakable322 = new greenBreakable(handler, 400, 80);
        greenBreakable422 = new greenBreakable(handler, 440, 80);
        lightblueBreakable322 = new lightblueBreakable(handler, 480, 80);
        redBreakable522 = new redBreakable(handler, 520, 80);

        yellowBreakable722 = new yellowBreakable(handler, 120, 100);
        yellowBreakable822 = new yellowBreakable(handler, 160, 100);
        yellowBreakable922 = new yellowBreakable(handler, 200, 100);
        yellowBreakable1022 = new yellowBreakable(handler, 240, 100);
        yellowBreakable1122 = new yellowBreakable(handler, 280, 100);
        yellowBreakable1222 = new yellowBreakable(handler, 320, 100);
        yellowBreakable1322 = new yellowBreakable(handler, 360, 100);
        yellowBreakable1422 = new yellowBreakable(handler, 400, 100);
        yellowBreakable1522 = new yellowBreakable(handler, 440, 100);
        yellowBreakable1622 = new yellowBreakable(handler, 480, 100);
        yellowBreakable1722 = new yellowBreakable(handler, 520, 100);

        lightblueBreakable422 = new lightblueBreakable(handler, 120, 120);
        lightblueBreakable522 = new lightblueBreakable(handler, 160, 120);
        lightblueBreakable622 = new lightblueBreakable(handler, 200, 120);
        lightblueBreakable722 = new lightblueBreakable(handler, 240, 120);
        lightblueBreakable822 = new lightblueBreakable(handler, 280, 120);
        lightblueBreakable922 = new lightblueBreakable(handler, 320, 120);
        lightblueBreakable1022 = new lightblueBreakable(handler, 360, 120);
        lightblueBreakable1122 = new lightblueBreakable(handler, 400, 120);
        lightblueBreakable1222 = new lightblueBreakable(handler, 440, 120);
        lightblueBreakable1322 = new lightblueBreakable(handler, 480, 120);
        lightblueBreakable1422 = new lightblueBreakable(handler, 520, 120);

    }

    @Override
    public void tick() {
        world2.tick();
        katch2.tick();
        pop2.tick();
        bigleg2.tick();
        

        //WALLS
        purpleBreakable122.tick();
        purpleBreakable222.tick();

        //purpleBreakable3.collide();
        yellowBreakable122.tick();
        yellowBreakable222.tick();
        yellowBreakable322.tick();
        yellowBreakable422.tick();
        yellowBreakable522.tick();
        yellowBreakable622.tick();
        yellowBreakable722.tick();
        yellowBreakable822.tick();
        yellowBreakable922.tick();
        yellowBreakable1022.tick();
        yellowBreakable1122.tick();
        yellowBreakable1222.tick();
        yellowBreakable1322.tick();
        yellowBreakable1422.tick();
        yellowBreakable1522.tick();
        yellowBreakable1622.tick();
        yellowBreakable1722.tick();

        redBreakable122.tick();
        redBreakable222.tick();
        redBreakable322.tick();
        redBreakable422.tick();
        redBreakable522.tick();

        greenBreakable122.tick();
        greenBreakable222.tick();
        greenBreakable322.tick();
        greenBreakable422.tick();

        lightblueBreakable122.tick();
        lightblueBreakable222.tick();
        lightblueBreakable322.tick();

        lightblueBreakable422.tick();
        lightblueBreakable522.tick();
        lightblueBreakable622.tick();
        lightblueBreakable722.tick();
        lightblueBreakable822.tick();
        lightblueBreakable922.tick();
        lightblueBreakable1022.tick();
        lightblueBreakable1122.tick();
        lightblueBreakable1222.tick();
        lightblueBreakable1322.tick();
        lightblueBreakable1422.tick();

        lifeBreakable122.tick();
        lifeBreakable222.tick();
        
        if (livesCount == 0) {
            System.out.println("Live 0 lose");
            lose = true;
            State.setState(handler.getGame().endState);

        }

    }

    @Override
    public void render(Graphics g) {
        world2.render(g);
        katch2.render(g);
        bigleg2.render(g);
       
        //WALLS
        purpleBreakable122.render(g);
        purpleBreakable222.render(g);

        //purpleBreakable3.render(g);
        yellowBreakable122.render(g);
        yellowBreakable222.render(g);
        yellowBreakable322.render(g);
        yellowBreakable422.render(g);
        yellowBreakable522.render(g);
        yellowBreakable622.render(g);
        yellowBreakable722.render(g);
        yellowBreakable822.render(g);
        yellowBreakable922.render(g);
        yellowBreakable1022.render(g);
        yellowBreakable1122.render(g);
        yellowBreakable1222.render(g);
        yellowBreakable1322.render(g);
        yellowBreakable1422.render(g);
        yellowBreakable1522.render(g);
        yellowBreakable1622.render(g);
        yellowBreakable1722.render(g);

        redBreakable122.render(g);
        redBreakable222.render(g);
        redBreakable322.render(g);
        redBreakable422.render(g);
        redBreakable522.render(g);

        greenBreakable122.render(g);
        greenBreakable222.render(g);
        greenBreakable322.render(g);
        greenBreakable422.render(g);

        lightblueBreakable122.render(g);
        lightblueBreakable222.render(g);
        lightblueBreakable322.render(g);

        lightblueBreakable422.render(g);
        lightblueBreakable522.render(g);
        lightblueBreakable622.render(g);
        lightblueBreakable722.render(g);
        lightblueBreakable822.render(g);
        lightblueBreakable922.render(g);
        lightblueBreakable1022.render(g);
        lightblueBreakable1122.render(g);
        lightblueBreakable1222.render(g);
        lightblueBreakable1322.render(g);
        lightblueBreakable1422.render(g);

        lifeBreakable122.render(g);
        lifeBreakable222.render(g);

        pop2.render(g);

        g.drawString("Lives 2: " + livesCount, 100, 450);

    }

}
