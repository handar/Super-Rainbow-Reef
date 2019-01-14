/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superRainbowReef;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author handa
 */
public class Assets {

    public static BufferedImage katch, purpleBreakable, yellowBreakable, redBreakable,
            greenBreakable, lightblueBreakable, lifeBreakable,
            solidUnbreakable, wallUnbreakable, transparentUnbreakable, background, pop, bigLeg;

    public static void init() {
//        try {
//            tank1 = ImageIO.read(ImageLoader("/Resources/Tank1.png"));
//            tank2 = ImageIO.read(ImageLoader.class.getResource("/Resources/Tank2.png"));
//            grass = ImageIO.read(ImageLoader.class.getResource("/Resources/grass.jpeg"));
//            unbreakableWall = ImageIO.read(ImageLoader.class.getResource("/Resources/Wall1.gif"));
//            breakableWall = ImageIO.read(ImageLoader.class.getResource("/Resources/Wall2.gif"));
//            bullet = ImageIO.read(ImageLoader.class.getResource("/Resources/Rocket.gif"));
//            bullet2 = ImageIO.read(ImageLoader.class.getResource("/Resources/Shell.gif"));
//        } catch (IOException ex) {
//            Logger.getLogger(Assets.class.getName()).log(Level.SEVERE, null, ex);
//        }

        katch = ImageLoader.loadImage("/Resources/Katch.gif");
        pop = ImageLoader.loadImage("/Resources/Pop.gif");
        bigLeg = ImageLoader.loadImage("/Resources/Bigleg_small.png");

        purpleBreakable = ImageLoader.loadImage("/Resources/Block1.gif");
        yellowBreakable = ImageLoader.loadImage("/Resources/Block2.gif");
        redBreakable = ImageLoader.loadImage("/Resources/Block3.gif");
        greenBreakable = ImageLoader.loadImage("/Resources/Block4.gif");
        lightblueBreakable = ImageLoader.loadImage("/Resources/Block5.gif");
        lifeBreakable = ImageLoader.loadImage("/Resources/Block_life.gif");

        background = ImageLoader.loadImage("/Resources/Background2.bmp");
//        
        solidUnbreakable = ImageLoader.loadImage("/Resources/Block_solid.gif");
        wallUnbreakable = ImageLoader.loadImage("/Resources/Wall.gif");
        transparentUnbreakable = ImageLoader.loadImage("/Resources/transparentBrick.png");

//        bullet = ImageLoader.loadImage("/Resources/Rocket.gif");
//        bullet2 = ImageLoader.loadImage("/Resources/Shell.gif");
    }
}
