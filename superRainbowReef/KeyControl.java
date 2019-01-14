/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superRainbowReef;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author handa
 */
public class KeyControl implements KeyListener {

    private boolean[] keys;
    public boolean  moveLeft, moveRight;

    public KeyControl() {
        keys = new boolean[256];
    }

    public void tick() {
        
        moveLeft = keys[KeyEvent.VK_LEFT];
        moveRight = keys[KeyEvent.VK_RIGHT];
//        left = keys[KeyEvent.VK_A];
//        right = keys[KeyEvent.VK_D];
       // shoot = keys[KeyEvent.VK_V];
               

    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;

    }

}