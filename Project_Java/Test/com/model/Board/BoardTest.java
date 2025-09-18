package com.model.Board;

import com.model.Piece.Moveable.Dragon;
import com.model.Piece.Piece;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    Board p=new Board();
    Piece piece ;
    @Test
    /*check if the position 2,2 is a unacceptable space, yellow place*/
    void validPisition()
    {
        boolean us;
        us = p.isUnacceptableSpace(2,2);
        assertEquals(false, us);
    }

    @Test
        /*check if the position 2,2 is an acceptable space,not yellow place*/
    void UnValidPisition()
    {
        boolean us;
        us = p.isUnacceptableSpace(3,3);
        assertEquals(true, us);
    }

    @Test
    void thereIsNoPiece()
    {
        piece = p.returnApiece(0,0);
        assertEquals(null,piece);
    }

    @Test
    void thereIsAdragon()
    {
        piece = new Dragon(0,0,0,"Dragon","Blue",true,10,1);
        p.setAPiece(0,0,piece);
        piece = p.returnApiece(0,0);
        assertEquals("Dragon",p.returnApiece(0,0).getName());
    }

    @Test
    void checkTheNameOfTeam()
    {
        piece = new Dragon(0,0,0,"Dragon","Blue",true,10,1);
        p.setAPiece(0,0,piece);
        piece = p.returnApiece(0,0);
        assertEquals("Blue",p.returnApiece(0,0).getNameOfTeam());
    }

    @Test
    void thereIsPiece()
    {
        piece = new Dragon(0,0,0,"Dragon","Blue",true,10,1);
        p.setAPiece(0,0,piece);
        piece = p.returnApiece(0,0);
        assertEquals(piece,p.returnApiece(0,0));
    }
}