/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superRainbowReef;

import java.awt.image.BufferedImage;
import java.awt.Rectangle;
/**
 *
 * @author handa
 */
public class solidUnbreakable extends Brick {
    
    public solidUnbreakable(int id) {
        super(Assets.solidUnbreakable, id);
        
        entityCollider = new Rectangle((int) getX(), (int) getY(), TILEWIDTH, TILEHEIGHT);
    }
    
    //createCollider(x, y, width, height);
    
    @Override
    public boolean isSolid() {
        return true;
    }
}