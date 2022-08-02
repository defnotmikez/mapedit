package org.academiadecodigo.mapEditor;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import javax.swing.plaf.ColorUIResource;

public class KeyboardHandlerRectangle implements KeyboardHandler {
    Rectangle cursor;
    Map map;
    private boolean isPainted;


    public KeyboardHandlerRectangle(Rectangle cursor, Map map) {
        this.cursor = cursor;
        this.map = map;

    }

    public boolean isPainted() {
        return false;
    }

    //Keyboardhandler for each key of the cursor
    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            //cursor goes up and if it hits the limit of the map, doesnt let it go outside of the limit
            case KeyboardEvent.KEY_UP:

                if (cursor.getY() <= Map.PADDING) {

                    break;
                } else {
                    cursor.translate(0, -Map.CELL_SIZE);
                    break;
                }


                //cursor goes down and if it hits the limit of the map, doesnt let it go outside of the limit
            case KeyboardEvent.KEY_DOWN:

                if (cursor.getY() >= map.getRows()) {

                    break;
                } else {
                    cursor.translate(0, Map.CELL_SIZE);


                    break;
                }

                //cursor goes left and if it hits the limit of the map, doesnt let it go outside of the limit
            case KeyboardEvent.KEY_LEFT:
                if (cursor.getX() <= Map.PADDING) {
                    break;
                } else {
                    cursor.translate(-Map.CELL_SIZE, 0);


                    break;
                }
                //cursor goes right and if it hits the limit of the map, doesnt let it go outside of the limit
            case KeyboardEvent.KEY_RIGHT:
                if (cursor.getX() >= map.getCols()) {
                    break;
                } else {
                    cursor.translate(Map.CELL_SIZE, 0);


                    break;
                }

            case KeyboardEvent.KEY_SPACE:





            /*case KeyboardEvent.KEY_C:
                cursor.delete();
                break;*/
        }


    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
