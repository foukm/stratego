package com.model.Piece.Unmoveable;

import com.model.Piece.Piece;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnmoveableTest {

    @Test
    void checkIfItIsMoveable()
    {
        Piece p = new Bomb(0,0,0,"Bomb","Blue",true);
        assertEquals(false,p.isMovable());
    }

    @Test
    void checkKatataxi()
    {
        Piece p = new Bomb(0,0,0,"Bomb","Blue",true);
        assertEquals(0,p.getKatataxi());
    }
}