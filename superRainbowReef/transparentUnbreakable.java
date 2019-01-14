/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superRainbowReef;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import static superRainbowReef.Brick.TILEHEIGHT;
import static superRainbowReef.Brick.TILEWIDTH;
import java.awt.Rectangle;
/**
 *
 * @author handa
 */
public class transparentUnbreakable extends Brick {
    
    //public static final int TILEWIDTH = 20, TILEHEIGHT = 20;
    
    public transparentUnbreakable(int id) {
        super(Assets.transparentUnbreakable, id);
        
        //entityCollider = new Rectangle((int) getX(), (int) getY(), TILEWIDTH, TILEHEIGHT);
    }
    
    //createCollider(x, y, width, height);
    
    @Override
    public boolean isSolid() {
        return false;
    }
    
//    @Override
//    public void render(Graphics g, int x, int y) {
//        g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
//
//        g.setColor(Color.red);
//        //g.fillRect(x, y, TILEWIDTH, TILEHEIGHT);
//
//    }
}
