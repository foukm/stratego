package com.model.Piece.Moveable;

import com.model.Piece.Piece;

public class Moveable implements Piece {

    private int x,mx;
    private int y,my;
    private String nameOfTeam, name;
    private int katataxi;
    private int validPositions;
    private boolean exists;
    private boolean hasSurvuive;

    public Moveable(int x, int y, int times, String name,String nameOfTeam, boolean extsts, int katataxi,int validPositions)
    {
        setX(x);
        setY(y);
        setExists(extsts);
        setName(name);
        setNameOfTeam(nameOfTeam);
        setKatataxi(katataxi);
        setValidPositions(validPositions);
        setHasSurvive(false);
    }

    /**
     * It set how much the allowable movement can be
     * @param validPositions how much the allowable movement can be
     */
    private void setValidPositions(int validPositions)
    {

    }
    /**
     * It returns how much the allowable movement can be
     * @return how much the allowable movement can be
     */
    public int getValidPositions()
    {
        return this.validPositions;
    }

    /**
     * <pre>
     *     <b>Precondition: mx,my must be in the Board bounds</b>
     * </pre>
     * <pre>
     *     <b>Postcondition: Sets the new position</b>
     * </pre>
     *
     * @param mx  new position on the x-axis
     * @param my new position on the y-axis
     */
    public void setMove(int mx,int my)
    {

    }
    /**
     * It returns the new position on the x-axis
     * @return the new position on the x-axis
     */
    public int getMx()
    {
        return this.mx;
    }
    /**
     * It returns the new position on the y-axis
     * @return  the new position on the y-axis
     */
    public int getMy()
    {
        return this.my;
    }

    /**
     * It sets the classification of the Piece
     * @param katataxi is  the classification of the Piece
     */
    private void setKatataxi(int katataxi)
    {
        this.katataxi = katataxi;
    }
    /**
     * Function returns the classification of the Piece
     * @return the classification of the Piece
     */
    public int getKatataxi()
    {
        return this.katataxi;
    }


    @Override
    public void setX(int x) {
        this.x = x ;
    }

    @Override
    public void setY(int y) {
        this.y =y;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public boolean isMovable() {
        return true;
    }

    @Override
    public void setHasSurvive(boolean hasSurvive) {
        this.hasSurvuive = hasSurvive;
    }

    @Override
    public boolean getHasSurvive() {
        return this.hasSurvuive;
    }

    @Override
    public void setIsSurvivable(boolean survive) {

    }

    @Override
    public boolean getIsSurvivable() {
        return false;
    }

    @Override
    public String getNameOfTeam() {
        return this.nameOfTeam;
    }

    @Override
    public void setNameOfTeam(String nameOfTeam) {
        this.nameOfTeam = nameOfTeam;
    }

    @Override
    public void setExists(boolean exists) {
        this.exists=exists;
    }

    @Override
    public boolean getExists() {
        return this.exists;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return this.name;
    }
}
