package com.model.Player;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void checkWinner()
    {
        Player p= new Blue(true);
        assertEquals(false,p.getTheWinner());
    }

    @Test
    void reducedArmy()
    {
        Player p= new Blue(true);
        assertEquals(true,p.getReduced());
    }

    @Test
    void isTheWinner()
    {
        Player p= new Blue(true);
        p.setTheWinner(true);
        assertEquals(true,p.getTheWinner());
    }

    @Test
    void amountOfPieces()
    {
        Player p= new Blue(true);
        assertEquals(16, p.getList().sizeOfPieces());
    }

    @Test
    void listWithPieces()
    {
        Player p= new Blue(false);
        assertEquals(true, p.getList().isFull());
    }

    @Test
    void nameOfThePlayer()
    {
        Player p= new Blue(false);
        assertEquals("Blue", p.getName());
    }

}