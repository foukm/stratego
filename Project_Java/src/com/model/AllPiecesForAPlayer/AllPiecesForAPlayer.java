package com.model.AllPiecesForAPlayer;

import com.model.Piece.*;
import com.model.Piece.Unmoveable.Bomb;
import com.model.Piece.Unmoveable.Flag;
import com.model.Piece.Moveable.*;

import java.util.ArrayList;

public class AllPiecesForAPlayer
{
    private String nameOfTeam;
    private boolean reduced;

    private ArrayList<Piece> list;
    public AllPiecesForAPlayer(String nameOfTeam, boolean reduced)
    {
        setNameOfTeam(nameOfTeam);
        list = new ArrayList<Piece>();
        list.add(new Dragon(1,1,0,"Dragon",nameOfTeam,true,10,1));
        list.add(new Mage(1,1,0,"Mage",nameOfTeam,true,9,1));
        list.add(new Knight(1,1,0,"Knight",nameOfTeam,true,8,1));
        list.add(new BeastReader(1,1,0,"BeastRider",nameOfTeam,true,7,1));
        list.add(new Sorceress(1,1,0,"Sorceress",nameOfTeam,true,6,1));
        list.add(new DifferentName(1,1,0,"DifferentName",nameOfTeam,true,5,1));
        list.add(new Elf(1,1,0,"Elf",nameOfTeam,true,4,1));
        list.add(new Dwarf(1,1,0,"Dwarf",nameOfTeam,true,3,1));
        list.add(new Dwarf(1,1,0,"Dwarf",nameOfTeam,true,3,1));
        list.add(new Scout(1,1,0,"Scout",nameOfTeam,true,2,1));
        list.add(new Scout(1,1,0,"Scout",nameOfTeam,true,2,1));
        list.add(new Slayer(1,1,0,"Slayer",nameOfTeam,true,1,1));
        list.add(new Bomb(1,1,0,"Trap",nameOfTeam,true));
        list.add(new Bomb(1,1,0,"Trap",nameOfTeam,true));
        list.add(new Bomb(1,1,0,"Trap",nameOfTeam,true));
        list.add(new Flag(1,1,0,"Flag",nameOfTeam,true));
        if(reduced==false)
        {
            list.add(new Knight(1,1,0,"Knight",nameOfTeam,true,8,1));
            list.add(new BeastReader(1,1,0,"BeastRider",nameOfTeam,true,7,1));
            list.add(new BeastReader(1,1,0,"BeastRider",nameOfTeam,true,7,1));
            list.add(new Sorceress(1,1,0,"Sorceress",nameOfTeam,true,6,1));
            list.add(new DifferentName(1,1,0,"DifferentName",nameOfTeam,true,5,1));
            list.add(new Elf(1,1,0,"Elf",nameOfTeam,true,4,1));
            list.add(new Dwarf(1,1,0,"Dwarf",nameOfTeam,true,3,1));
            list.add(new Dwarf(1,1,0,"Dwarf",nameOfTeam,true,3,1));
            list.add(new Dwarf(1,1,0,"Dwarf",nameOfTeam,true,3,1));
            list.add(new Scout(1,1,0,"Scout",nameOfTeam,true,2,1));
            list.add(new Scout(1,1,0,"Scout",nameOfTeam,true,2,1));
            list.add(new Bomb(1,1,0,"Trap",nameOfTeam,true));
            list.add(new Bomb(1,1,0,"Trap",nameOfTeam,true));
            list.add(new Bomb(1,1,0,"Trap",nameOfTeam,true));
        }

    }

    /**
     * @return the first Piece from the list
     * */
   public Piece getTheFirstPiece()
   {
       if(list.isEmpty()==false)
       {
           return list.get(0);
       }
      return null;
   }

    /**
     * sets if the army is reduced
     * @param reduced if  the army is reduced
     * */
    private void setReduced(boolean reduced)
    {
        this.reduced = reduced;
    }

    /**
     *
     * @return if the army is reduced
     * */
    public boolean getReduced()
    {
        return this.reduced;
    }


    /**
     * sets the name of the Team
     * @param nameOfTeam stores the name of Team
     */
    private void setNameOfTeam(String nameOfTeam)
    {
        this.nameOfTeam = nameOfTeam;
    }


    /**
     *@return returns the name of team that the AllPiecesForAPlay belong to
     *
     */
    public String getNameOfTeam()
    {
        return this.nameOfTeam;
    }


    /**
     *
     * @return if it is full or not
     */
    public boolean isFull()
    {
        if(list.size()==30 && getReduced()==false)
        {
            return true;
        }else if(list.size()== 16 && getReduced()==true) //CHECK AN EINAI CORRECT TO 15
        {
            return true;
        }
        return false;
    }


    /**
     *
     * @return  if it is empty
     */
    public boolean isEmpty()
    {
        return list.isEmpty();
    }


    /**
     *
     * @return the amount of Pieces which are in the list
     */
    public int sizeOfPieces()
    {
        return  list.size();
    }



    /**
     *
     * @return if the Piece p is in the list
     * @param p this is the Piece that we want to learn if it is in the list
     */
    public boolean PieceIsContained(Piece p)
    {
        if(list.contains(p)){
            return true;
        }
        return false;
    }



    /**
     * adds a Piece in the list of Pieces
     * @param p we want to add this Piece p in the list with the available Pieces
     */
    public void addApiece(Piece p)
    {
        list.add(p);
    }


    /**
     *
     *  removes the Piece p from the list with the available Pieces
     * @param p is the Piece that we want to remove from the list with the available Pieces
     */
    public void removeApiece(Piece p)
    {
        list.remove(p);
    }


    /**
     *
     * @return an empty list that the player can add Pieces in it
     */
    public ArrayList<Piece> returnAnEmptyListOfPieces()
    {
        ArrayList<Piece> empty = new ArrayList<>();
        return empty;
    }
}
