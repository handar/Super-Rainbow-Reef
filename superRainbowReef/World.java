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
public class World {

    private Handler handler;
    private int width, height;
    private int spawnX, spawnY;
    private int[][] brickArray;


    public World(Handler handler, String path) {
        this.handler = handler;
        loadWorld(path);
    }

    public void tick() {

    }

    public void render(Graphics g) {
//        int xStart = (int) Math.max(0, handler.getGameCamera().getxOffset() / Tile.TILEWIDTH);
//        int xEnd = (int) Math.min(width, (handler.getGameCamera().getxOffset() + handler.getWidth()) / Tile.TILEWIDTH + 1);
//        int yStart = (int) Math.max(0, handler.getGameCamera().getyOffset() / Tile.TILEHEIGHT);
//        int yEnd = (int) Math.min(height, (handler.getGameCamera().getyOffset() + handler.getHeight()) / Tile.TILEHEIGHT + 1);

//        for (int y = yStart; y < yEnd; y++) {
//            for (int x = xStart; x < xEnd; x++) {
//                getTile(x, y).render(g, (int) (x * Tile.TILEWIDTH - handler.getGameCamera().getxOffset()), (int) (y * Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()));
//            }
//        }
        g.drawImage(Assets.background, 0, 0, null);
        
        
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
//                if (getTile(x,y)==Blocks.wallUnbreakable){
//                   getTile(x, y).render(g, x * Blocks.TILEWIDTH/2, y * Blocks.TILEHEIGHT/2); 
//                }
               
                getBrick(x, y).render(g, x * Brick.TILEWIDTH, y * Brick.TILEHEIGHT);
//                singleBrick = brickArray[x][y];
//                
//                if (singleBrick == 0){
//                   g.drawImage(Assets.purpleBreakable, y*30,x*30, null);
//                   //Rectangle rect = new Rectangle ((int)x, (int)y, width, height);
//                }
            }
            
            
        }
        
       
        
    }

    public Brick getBrick(int x, int y) {
//        if (x < 0 || y < 0 || x >= width || y >= height) {
//            return Brick.purpleBreakable;
//        }
        Brick t = Brick.blocks[brickArray[x][y]];
//        if (t == null) {
//            return Brick.redBreakable;
//        }
        return t;
    }

    private void loadWorld(String path) {
        String file = Utils.loadFileAsString(path);
        String[] tokens = file.split("\\s+");
        width = Utils.parseInt(tokens[0]);
        height = Utils.parseInt(tokens[1]);

        spawnX = Utils.parseInt(tokens[2]);
        spawnY = Utils.parseInt(tokens[3]);

        brickArray = new int[width][height];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                brickArray[x][y] = Utils.parseInt(tokens[(x + y * width) + 4]);
            }
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
