package org.academiadecodigo.mapEditor;


import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import sun.security.krb5.internal.PAData;

public class Cursor {
    Map map;
    Rectangle cursor;


    //constructor of cursor and instance of it
    public Cursor(Map map) {
        this.map = map;
        cursor = new Rectangle(Map.PADDING, Map.PADDING, Map.CELL_SIZE, Map.CELL_SIZE);
        cursor.setColor(Color.GREEN);
        cursor.fill();
        listener();


    }


    //Keyboard listener for each key
    public void listener() {


        KeyboardHandlerRectangle kbhr = new KeyboardHandlerRectangle(cursor, map);

        Keyboard keyboard = new Keyboard(kbhr);

        KeyboardEvent moveRight = new KeyboardEvent();
        moveRight.setKey(KeyboardEvent.KEY_RIGHT);
        moveRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveRight);


        KeyboardEvent moveLeft = new KeyboardEvent();
        moveLeft.setKey(KeyboardEvent.KEY_LEFT);
        moveLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveLeft);

        KeyboardEvent moveUp = new KeyboardEvent();
        moveUp.setKey(KeyboardEvent.KEY_UP);
        moveUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveUp);

        KeyboardEvent moveDown = new KeyboardEvent();
        moveDown.setKey(KeyboardEvent.KEY_DOWN);
        moveDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveDown);

        KeyboardEvent space= new KeyboardEvent();
        moveDown.setKey(KeyboardEvent.KEY_SPACE);
        moveDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(space);

       /* KeyboardEvent clear= new KeyboardEvent();
        moveDown.setKey(KeyboardEvent.KEY_C);
        moveDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(clear);*/

    }

  /*  public void mapLimiter(){
        if()
    }*/


}
