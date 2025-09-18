package com.model.Board;

import com.model.Piece.Piece;

public class Board {
    private Piece[][] board;

    public Board()
    {
        board = new Piece[8][10];
        for(int i=0; i<8; i++)
        {
            for(int j=0; j<10; j++)
            {
                board[i][j]= null;
            }
        }
    }

    /**
     * Returns if nameOfTeam has pieces that are moveable
     * @param nameOfTeam the player
     * @return if the player has moveable pieces
     * */
    public boolean hasMoveablePieces(String nameOfTeam)
    {
        Piece p;
        for(int i=0; i<8; i++)
        {
            for(int j=0; j<10; j++)
            {
                p=returnApiece(i,j);
                if(p!=null && p.isMovable()==true && p.getNameOfTeam().equals(nameOfTeam)==true)
                {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * It returns the piece whick is in x,y position on the board. If there is not a piece , it returns null
     * @param x dimension value - x
     * @param y dimension value - y
     * @return a piece else null
     * */
    public Piece returnApiece(int x, int y)
    {
        if(board[x][y]==null)
        {
            return null;
        }
        return board[x][y];
    }


    /**
     *
     * set a Piece in row x and col y (dimensions)
     * @param x dimension value - x
     * @param y dimension value - y
     * @param p  the Piece in [x,y] seat/position
     */
    public void setAPiece(int x,  int y, Piece p)
    {
        if(board[x][y]==null && isUnacceptableSpace(x,y)==false)
        {
            board[x][y]= p ;
            p.setX(x);
            p.setY(y);
        }
    }

    /**
     * <pre>
     *     <b>Precondition: x,y must be in the bounds of the array  </b>
     * </pre>
     * <pre>
     *     <b>Postcondition: remove a Piece in row x and col y (dimensions)</b>
     * </pre>
     *
     * @param x dimension value - x
     * @param y dimension value - y
     */
    public void removeApiece(int x, int y)
    {
        board[x][y] = null;
    }

    /**
     * <pre>
     *     <b>Precondition: x,y must be in the bounds of the array</b>
     * </pre>
     * <pre>
     *     <b>Postcondition: returns if this position is in the yellow space and it is inaccessible</b>
     * </pre>
     * @return if this position is in the yellow space and it is inaccessible
     * @param x dimension value - x
     * @param y dimension value - y
     */
    public boolean isUnacceptableSpace(int x, int y)
    {
        if(x==3 && (y==2|| y==3 || y==6 || y==7))
        {
            return true;
        }else if(x==4 && ((y==2|| y==3 || y==6 || y==7)))
        {
            return true;
        }
        return false;
    }

    /**
     * <pre>
     *     <b>Precondition: x,y must be in the bounds of the array</b>
     * </pre>
     * <pre>
     *     <b>Postcondition: checks if the position to right the Piece with x,y dimensions is empty</b>
     * </pre>
     * @return  if the position to right the Piece with x,y dimensions is empty
     * @param x dimension value - x
     * @param y dimension value - y
     */
    public boolean isEmptyRigth(int x, int y)
    {
        if(isEmptyCell(x,y+1) == true)
        {
            return true;
        }
        return false;
    }

    /**
     * <pre>
     *     <b>Precondition: x,y must be in the bounds of the array</b>
     * </pre>
     * <pre>
     *     <b>Postcondition:checks if the position left to the Piece with x,y dimensions is empty</b>
     * </pre>
     * @return if the position left to the Piece with x,y dimensions is empty
     * @param x dimension value - x
     * @param y dimension value - y
     */
    public boolean isEmptyLeft(int x, int y)
    {
        if(isEmptyCell(x,y-1) == true)
        {
            return true;
        }
        return false;
    }

    /**
     * <pre>
     *     <b>Precondition: x,y must be in the bounds of the array</b>
     * </pre>
     * <pre>
     *     <b>Postcondition:checks if the position back to the Piece with x,y dimensions is empty</b>
     * </pre>
     * @return  if the position back to the Piece with x,y dimensions is empty
     * @param x dimension value - x
     * @param y  dimension value - y
     */
    public boolean isEmptyBack(int x, int y)
    {

        if(isEmptyCell(x-1,y) == true)
        {
            return true;
        }
        return false;
    }

    /**
     * <pre>
     *     <b>Precondition x,y must be in the bounds of the array:</b>
     * </pre>
     * <pre>
     *     <b>Postcondition: checks if the position forward to the Piece with x,y dimensions is empty</b>
     * </pre>
     * @return if the position forward to the Piece with x,y dimensions is empty
     * @param x dimension value - x
     * @param y dimension value - y
     */
    public boolean isEmptyForward(int x, int y)
    {

        if(isEmptyCell(x+1,y) == true)
        {
            return true;
        }
        return false;
    }

    /**
     * <pre>
     *     <b>Precondition: x,y must be in the bounds of the array</b>
     * </pre>
     * <pre>
     *     <b>Postcondition: checks  the Piece with x,y dimensions is empty</b>
     * </pre>
     * @return if this Cell is empty, there is no Piece
     * @param x dimension value - x
     * @param y  dimension value - y
     */
    public boolean isEmptyCell(int x,int y)
    {
        if(board[x][y]==null && isUnacceptableSpace(x,y)==false)
        {
            return true;
        }
        return false;
    }

    public boolean validPosition(Piece p, int x1,int y1, int x2, int y2)
    {
        if(!p.getName().equals("Scout"))
        {
            if(x1==x2 && Math.abs(y1-y2)==1){
                return true;
            }else if(y1==y2 && Math.abs(x1-x2)==1)
            {
                return true;
            }else
            {
                return false;
            }
        }else{
            if(x1==x2)
            {
                if(y2>y1)
                {
                    for(int i=y1; i<y2; i++)
                    {
                        if(i==y1)
                        {
                            continue;
                        }
                        if(returnApiece(x1,i)!=null || isUnacceptableSpace(x1,i)==true)
                        {
                            return false;
                        }
                    }
                    return true;
                }else if(y2<y1)
                {
                    for(int i=y1; i>y2; i--)
                    {
                        if(i==y1)
                        {
                            continue;
                        }
                        if(returnApiece(x1,i)!=null || isUnacceptableSpace(x2,i)==true)
                        {
                            return false;
                        }
                    }
                    return true;
                }

            }else if(y1==y2)
            {
                if(x1<x2)
                {
                    for(int i=x1; i<x2; i++)
                    {
                        if(i==x1)
                        {
                            continue;
                        }
                        if(returnApiece(i,y1)!=null || isUnacceptableSpace(i,y1)==true)
                        {
                            return false;
                        }
                    }
                    return true;
                }else if(x1>x2)
                {
                    for(int i=x1; i>x2;i--)
                    {
                        if(i==x1)
                        {
                            continue;
                        }
                        if(returnApiece(i,y1)!=null || isUnacceptableSpace(i,y1)==true)
                        {
                            return false;
                        }
                    }
                    return true;
                }
            }else
            {
                return false;
            }
        }
        return false;
    }
}
