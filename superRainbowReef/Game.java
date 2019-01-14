/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superRainbowReef;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author handa
 */
public class Game implements Runnable {

    private Display display;
    private int width, height;
    public String title;

    public String score;

    private boolean running = false;
    private Thread thread;

    private BufferStrategy bs;
    private Graphics g;

    //States
    protected State gameState;
    protected State endState;
     protected State endState2;
    protected State gameState2;

    //Input
    private KeyControl keyManager1;

    //Camera
    //private GameCamera gameCamera;
    //Handler
    private Handler handler;

    static String backgroundMusic = "/Resources/Music.mid";

    public Game(String title, int width, int height) {
        this.width = width;
        this.height = height;
        this.title = title;
        keyManager1 = new KeyControl();

    }

    private void init() {
        display = new Display(title, width, height);
        display.getFrame().addKeyListener(keyManager1);

        Assets.init();

        handler = new Handler(this);
        
              //end level
        endState2 = new EndState(handler);
        State.setState(endState2);

        //end level
        endState = new EndState(handler);
        State.setState(endState);
        
        //second level
        gameState2 = new GameState2(handler);
        State.setState(gameState2);

//        //first level
        gameState = new GameState(handler);
        State.setState(gameState);
//

    }

    private void tick() { //can name it update
        keyManager1.tick();

        if (State.getState() != null) {
            State.getState().tick();
        }
    }

    private void render() {
        bs = display.getCanvas().getBufferStrategy();
        if (bs == null) {
            display.getCanvas().createBufferStrategy(3);
            return;
        }

        g = bs.getDrawGraphics();

        //Clear screen
        g.clearRect(0, 0, width, height);
        //Draw here!  
        if (State.getState() != null) {
            State.getState().render(g);
        }

        //End drawing!
        bs.show();
        g.dispose();
    }

    public void run() {
        init();

        int fps = 60;
        double timePerTick = 1000000000 / fps;
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();
        long timer = 0;
        int ticks = 0;

        while (running) {
            now = System.nanoTime();
            delta += (now - lastTime) / timePerTick;
            timer += now - lastTime;
            lastTime = now;

            if (delta >= 1) {
                tick();
                render();
                ticks++;
                delta--;
            }

            if (timer >= 1000000000) {
                //System.out.println("Ticks and Frames: " + ticks);
                ticks = 0;
                timer = 0;
            }
        }

        stop();
    }

    public KeyControl getKeyManager() {
        return keyManager1;
    }

//    public GameCamera getGameCamera() {
//        return gameCamera;
//    }
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public synchronized void start() {
        if (running) {
            return;
        }

        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public synchronized void stop() {
        if (!running) {
            return;
        }
        running = false;
        try {
            thread.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the endState
     */
   

}
