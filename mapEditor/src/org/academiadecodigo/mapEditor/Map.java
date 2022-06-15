package org.academiadecodigo.mapEditor;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.w3c.dom.css.Rect;


public class Map {

    private Rectangle map;
   private int cols;
   private int rows;
   private int x;
   private int y;
   public int height;
   public int width;

    public final static int CELL_SIZE =10;
    public final static int PADDING = 10;

    private Rectangle[][] cells;


    public Map(int cols, int rows){
        this.x=x;
        this.y = y;
        this.height = height;
        this.width = width;
      this.rows = rows;
      this.cols = cols;
      /*createCells();*/

        Rectangle map = new Rectangle(x+PADDING,y+PADDING,cols * CELL_SIZE,rows*CELL_SIZE);
        map.draw();

    }

    public int getCols(){
        return cols;
    }
    public int getRows(){
        return rows;
    }

    public int getX(){
        return x + PADDING;
    }
    public int getY(){
        return  y + PADDING;
    }
    public int getHeight(){
        return cols * CELL_SIZE;
    }
    public int getWidth(){
        return cols * CELL_SIZE;
    }







    public void createCells(){
        this.cells = new Rectangle[cols][rows];
    for(int j = 0; j < cols;j++) {
        for (int i = 0; i < rows; i++) {
            cells[j][i] = new Rectangle(PADDING + (j) * CELL_SIZE, PADDING+(i)*CELL_SIZE, CELL_SIZE, CELL_SIZE);
            cells[j][i].draw();
        }
    }


    }

}
