package com.model.Piece.Moveable;

import com.model.Piece.Piece;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveableTest {
    @Test
    void checkIfItIsMoveable()
    {
        Piece p = new Dragon(0,0,0,"Dragon","Blue",true,10,0);
        assertEquals(true,p.isMovable());
    }
    @Test
    void checkKatataxi()
    {
        Piece p = new Dragon(0,0,0,"Dragon","Blue",true,10,0);
        assertEquals(10,p.getKatataxi());
    }

}