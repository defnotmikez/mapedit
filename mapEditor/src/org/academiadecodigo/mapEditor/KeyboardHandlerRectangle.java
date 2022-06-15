package org.academiadecodigo.mapEditor;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import javax.swing.plaf.ColorUIResource;

public class KeyboardHandlerRectangle implements KeyboardHandler {
    Rectangle cursor;
    Map map;


    public KeyboardHandlerRectangle(Rectangle cursor) {
        this.cursor = cursor;

    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_UP:

                if(cursor.getX() > map.getX()){
                    cursor.translate(0, -Map.CELL_SIZE);
                    break;
                }







            case KeyboardEvent.KEY_DOWN:

                    cursor.translate(0, Map.CELL_SIZE);


                break;
            case KeyboardEvent.KEY_LEFT:
                //caso ele chegue no limite à esquerda
                //break;
                    cursor.translate(-Map.CELL_SIZE, 0);


                break;
            case KeyboardEvent.KEY_RIGHT:

                    cursor.translate(Map.CELL_SIZE, 0);


                break;



        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
