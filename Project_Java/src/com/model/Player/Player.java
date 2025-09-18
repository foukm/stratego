package com.model.Player;

import com.model.AllPiecesForAPlayer.AllPiecesForAPlayer;
import com.model.Piece.Piece;

abstract public class Player {

    private String name;
    private boolean playsNow;
    private boolean isTheWinner;
    private int survives;
    private int maxSurvives;
    private boolean reduced;
    private AllPiecesForAPlayer list ;
    private int successfulAttack;
    private int numberOfAttack;
    private int cdragon=0,cmage=0,cknight=0,cbeastrider=0,csorceress=0,cdifferentname=0,celf=0,cdwarf=0,cscout=0,cslayer=0,ctrap=0;


    public  Player(String name, boolean playsNow, boolean isTheWinner , boolean reduced)
    {
        setPlaysNow(playsNow);
        setTheWinner(isTheWinner);
        setName(name);
        setReduced(reduced);
        setMaxSurvives(2);
        setSurvives(0);
        setSuccessfulAttack();
        setNumberOfAttack();
        list = new AllPiecesForAPlayer(name, reduced);
    }
    /**
     * It adds dragon capture
     * */
    public void addAcDragon()
    {
        this.cdragon = this.cdragon+1;
    }
    /**
     * It adds dmage capture
     * */
    public void addAcMage()
    {
        this.cmage = this.cmage+1;
    }
    /**
     * It adds Knight capture
     * */
    public void addAcKnight()
    {
        this.cknight = this.cknight +1;
    }
    /**
     * It adds beast rider capture
     * */
    public void addAcBeastRider()
    {
        this.cbeastrider = this.cbeastrider+1;
    }
    /**
     * It adds sorceress capture
     * */
    public void addAcSrceress()
    {
        this.csorceress=this.csorceress+1;
    }
    /**
     * It adds lava beast/yeti capture
     * */
    public void addAcDifferentname()
    {
        this.cdifferentname=this.cdifferentname+1;
    }
    /**
     * It adds elf capture
     * */
    public void addAcElf()
    {
        this.celf=this.celf+1;
    }
    /**
     * It adds Dwarf capture
     * */
    public void addAcDwarf()
    {
        this.cdwarf=this.cdwarf+1;
    }
    /**
     * It adds scout capture
     * */
    public void addAcScout()
    {
        this.cscout=this.cscout+1;
    }
    /**
     * It adds slayer capture
     * */
    public void addAcSlayer()
    {
        this.cslayer=this.cslayer+1;
    }
    /**
     * It adds trap capture
     * */
    public void addAcTrap()
    {
        this.ctrap=this.ctrap+1;
    }
    /**
     * @return how many beast riders have been captured
     * */
    public int getCbeastrider() {
        return cbeastrider;
    }
    /**
     * @return how many lava beasts/yeti have been captured
     * */
    public int getCdifferentname() {
        return cdifferentname;
    }
    /**
     * @return how many dragons have been captured
     * */
    public int getCdragon() {
        return cdragon;
    }
    /**
     * @return how many dwarf have been captured
     * */
    public int getCdward() {
        return cdwarf;
    }
    /**
     * @return how many elfs have been captured
     * */
    public int getCelf() {
        return celf;
    }
    /**
     * @return how many knights have been captured
     * */
    public int getCknight() {
        return cknight;
    }
    /**
     * @return how many mages have been captured
     * */
    public int getCmage() {
        return cmage;
    }
    /**
     * @return how many sorcresses have been captured
     * */
    public int getCsorceress() {
        return csorceress;
    }
    /**
     * @return how many scouts  have been captured
     * */
    public int getCscout() {
        return cscout;
    }
    /**
     * @return how many slayers have been captured
     * */
    public int getCslayer() {
        return cslayer;
    }
    /**
     * @return how many traps have been captured
     * */
    public int getCtrap() {
        return ctrap;
    }

    /**
     * sets the successful attacks
     * */
    private void setSuccessfulAttack()
    {
        this.successfulAttack=0;
    }
    /**
     * adds a successful attack
     * */
    public void addAsuccessfulAttack()
    {
        this.successfulAttack = this.successfulAttack +1;
    }
    /**
     * @return the successful attacks
     * */
    public int getSuccessfulAttack()
    {
        return this.successfulAttack;
    }

    /**
     * sets the amount of attacks
     * */
    private void setNumberOfAttack()
    {
        this.numberOfAttack=0;
    }
    /**
     * adds an attack
     * */
    public void addAnumberOfAttach()
    {
        this.numberOfAttack = this.numberOfAttack+1;
    }
    /**
     * @return the amount of attacks
     * */
    public int getNumberOfAttack()
    {
        return this.numberOfAttack;
    }

    /**
     * It sets if the army is reduced
     * @param reduced stores if the army is reduced
     * */
    private void setReduced(boolean reduced)
    {
        this.reduced = reduced;
    }

    /**
     *It returns if the army is reduced
     * @return if the army is reduced
     **/
    public boolean getReduced()
    {
        return this.reduced;
    }


    /**
     * This function returns the list of the Pieces which belong to the player
     * @return the list of the Pieces which belong to the player
     * */
    public AllPiecesForAPlayer getList()
    {
        return this.list;
    }


    /**
     *
     *This function sets how many times the player can survive a Piece
     * @param maxSurvives stores how many times the player can survive a Piece
     */
    private void setMaxSurvives(int maxSurvives)
    {
        this.maxSurvives=maxSurvives;
    }


    /**
     * It returns how many times the player can survive a Piece
     * @return  how many times the player can survive a Piece
     */
    public int getMaxSurvives()
    {
        return this.maxSurvives;
    }


    /**
     *It sets haw many times the player has already survive a piece
     * @param survives times that the player has already survive a piece
     */
    private void setSurvives(int survives)
    {
        this.survives = survives;
    }


    /**
     * It returns  haw many times the player has already survive a piece
     * @return haw many times the player has already survive a piece
     */
    public int getSurvives()
    {
        return this.survives;
    }



    /**
     * This function adds another one survive
     *
     */
    public void addASurvive(){
        this.survives = this.survives + 1;
    }


    /**
     *
     * This function  sets if this player is the winner
     * @param isTheWinner this param stores if this Player is the winner
     */
    public void setTheWinner(boolean isTheWinner)
    {
        this.isTheWinner =  isTheWinner;
    }


    /**
     * It returns if this player is the winner
     * @return if this player is the winner
     */
    public boolean getTheWinner()
    {
        return this.isTheWinner;
    }


    /**
     * <pre>
     *     <b>Precondition: Name must be Blue or Red</b>
     * </pre>
     * <pre>
     *     <b>Postcondition: sets the name of the player</b>
     * </pre>
     *
     * @param name this is the name of the player
     */
    private void setName(String name)
    {
        this.name = name;
    }


    /**
     * <pre>
     *     <b>Precondition: Name must be Blue or Red</b>
     * </pre>
     * <pre>
     *     <b>Postcondition:returns the name of the player</b>
     * </pre>
     * @return the name of the Player
     */
    public String getName()
    {
        return  this.name;
    }


    /**
     *
     * It sets if this is the player  who plays now
     * @param playsNow this variable stores if this player is playing now or not
     */
    public void setPlaysNow(boolean playsNow)
    {
        this.playsNow = playsNow;
    }


    /**
     * It returns if this player is playing now
     * @return if this player must play now
     */
    public boolean getPlaysNow()
    {
        return this.playsNow;
    }


    /**
     * <pre>
     *     <b>Precondition: the piece must be one of the allowed ones</b>
     * </pre>
     * <pre>
     *     <b>Postcondition: player chooces a Piece </b>
     * </pre>
     *
     * @param piece this is the piece that player has choosen
     */
    public void chooseApiece(Piece piece)
    {

    }


    /**
     * <pre>
     *     <b>Precondition: the piece must be one of the allowed ones</b>
     * </pre>
     * <pre>
     *     <b>Postcondition: this function move a piece which belongs to this player </b>
     * </pre>
     *
     * @param piece the piece that we want to move
     */
    public void MoveApiece(Piece piece)
    {

    }
}
