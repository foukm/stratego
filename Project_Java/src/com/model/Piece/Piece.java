package com.model.Piece;

public interface Piece {

    /**
     * <pre>
     *     <b>Precondition:  </b>
     * </pre>
     * <pre>
     *     <b>Postcondition: returns the classification of the piece </b>
     * </pre>
     * @return the classification of the piece
     */
    public int getKatataxi();


    /**
     * <pre>
     *     <b>Precondition: must be in the correct bounds </b>
     * </pre>
     * <pre>
     *     <b>Postcondition: sets the x - dimension of the piece</b>
     * </pre>
     *
     * @param x is the x - dimension of the piece on the board
     */
    public void setX(int x);



    /**
     * <pre>
     *     <b>Precondition: must be in the correct bounds</b>
     * </pre>
     * <pre>
     *     <b>Postcondition: sets the y - dimension of the piece</b>
     * </pre>
     *
     * @param y  is the y - dimension of the piece on the board
     */
    public void setY(int y);


    /**
     * <pre>
     *     <b>Precondition:  must be in the correct bounds</b>
     * </pre>
     * <pre>
     *     <b>Postcondition: returns the x - demension of the piece  on the board</b>
     * </pre>
     * @return the x - demension of the piece  on the board
     */
    public int getX();


    /**
     * <pre>
     *     <b>Precondition:  must be in the correct bounds</b>
     * </pre>
     * <pre>
     *     <b>Postcondition: returns the y - demension of the piece on the board</b>
     * </pre>
     * @return the y - demension of the piece on the board
     */
    public int getY();


    /**
     *
     * It returns if this the Piece is movable
     * @return if this the Piece is movable
     */
    public boolean isMovable();



    /**
     *
     * It sets true if this Piece has survived another Piece
     * @param hasSurvive stores if this  Piece has survived another Piece
     */
    public void setHasSurvive(boolean hasSurvive);



    /**
     * It returns if this Piece has already survived a Piece
     * @return if this Piece has already survived a Piece
     */
    public boolean getHasSurvive();



    /**
     *
     *It  sets if this Piece can be survive
     * @param survive can be survive
     */
    public void setIsSurvivable(boolean survive);



    /**
     *
     * It returns if this Piecce can be survive
     * @return if this Piecce can be survive
     */
    public boolean getIsSurvivable();



    /**
     *
     *  It returns the name of the team to which the piece belongs
     * @return  the name of the team to which the piece belongs
     */
    public String getNameOfTeam();



    /**
     * <pre>
     *     <b>Precondition: it must be Blue or Red</b>
     * </pre>
     * <pre>
     *     <b>Postcondition: sets the name of the team to which the piece belongs </b>
     * </pre>
     * @param nameOfTeam stores the name of the team
     */
    public void setNameOfTeam(String nameOfTeam);




    /**
     *
     *It sets if this Piece exists or not
     * @param exists the value of this variable contains the information if this Piece exists or not on the board
     */
    public void setExists(boolean exists);




    /**
     * It returns if this Piece exists or not on the board
     * @return if this Piece exists or not on the board
     */
    public boolean getExists();



    /**
     * <pre>
     *     <b>Precondition: it must be one of them: BeastReader, Bomb, DifferentName, Dragon, Dwarf, Elf, Flag, Knight, Mage, Scout, Slayer, Sorceress </b>
     * </pre>
     * <pre>
     *     <b>Postcondition: sets the name of the Piece</b>
     * </pre>
     * @param name : it is the name of the Piece
     */
    public void setName(String name);


    /**
     * <pre>
     *     <b>Precondition:It must be one of them that mentioned in the project assignment</b>
     * </pre>
     * <pre>
     *     <b>Postcondition: returns the name of the Piece</b>
     * </pre>
     * @return the name of the Piece
     */
    public String getName();
}
