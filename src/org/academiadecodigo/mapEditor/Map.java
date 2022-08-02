package org.academiadecodigo.mapEditor;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.w3c.dom.css.Rect;


public class Map {
    private Cursor cursor;

    private Rectangle map;
    private int cols;
    private int rows;
    private int x;
    private int y;


    public final static int CELL_SIZE = 10;
    public final static int PADDING = 10;

    private Rectangle[][] cells;

    //constructor of the map and instance of the grid(map)
    public Map(int cols, int rows) {

        this.rows = rows;
        this.cols = cols;
        this.x = x;
        this.y = y;


        Rectangle map = new Rectangle(x + PADDING, y + PADDING, cols * CELL_SIZE, rows * CELL_SIZE);
        map.draw();
        createCells();
    }

    public Rectangle[][] getCells(){
        return cells;
    }

    public int getRows() {
        return rows * CELL_SIZE;
    }

    public int getCols() {
        return cols * CELL_SIZE;
    }

    public int getX() {
        return x;
    }

    public int getY() {

        return y;
    }


    //creation of each cell inside of the map
    public void createCells() {
        this.cells = new Rectangle[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                cells[i][j] = new Rectangle(PADDING + (i) * CELL_SIZE, PADDING + (j) * CELL_SIZE, CELL_SIZE, CELL_SIZE);
                cells[i][j].draw();
            }
        }


    }


}
