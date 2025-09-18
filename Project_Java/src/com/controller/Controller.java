package com.controller;

import com.model.Board.Board;
import com.model.Piece.Piece;
import com.model.Player.Blue;
import com.model.Player.Player;
import com.model.Player.Red;
import com.view.GraphicUI;
import com.view.Informations;
import com.view.Menu;
import java.util.Random;

public class Controller {
    private GraphicUI game;
    private Board board;
    private Blue blue;
    private Red red;
    private Player[] players;
    private int first_x;
    private int first_y;
    private Informations informations;


    /**
     * The constructor prepairs the graphics , the players and the board
     * @param reduced is the army reduced or not
     * */
    public Controller(boolean reduced)
    {
        game = new GraphicUI();
        board = new Board();
        blue = new Blue(reduced);
        red = new Red(reduced);
        informations=new Informations(reduced);
        players = new Player[2];
        players[0] = blue;
        players[1] = red;

    }
    /**
     * This function increases the number of captures for this piece for that particular player
     * @param c the piece which is captured
     * */
    void captureCount(Piece c)
    {
        if(c.getNameOfTeam()=="Red")
        {
            if(c.getName()=="Dragon")
            {
                red.addAcDragon();
            }else if(c.getName()=="Mage")
            {
                red.addAcMage();
            }else if(c.getName()=="Knight")
            {
                red.addAcKnight();
            }else if(c.getName()=="BeastRider")
            {
                red.addAcBeastRider();
            }else if(c.getName()=="Sorceress")
            {
                red.addAcSrceress();
            }else if(c.getName()=="DifferentName")
            {
                red.addAcDifferentname();
            }else if(c.getName()=="Elf")
            {
                red.addAcElf();
            }else if(c.getName()=="Dwarf")
            {
                red.addAcDwarf();
            }else if(c.getName()=="Scout")
            {
                red.addAcScout();
            }else if(c.getName()=="Slayer")
            {
                red.addAcSlayer();
            }else if(c.getName()=="Trap")
            {
                red.addAcTrap();
            }
        }else
        {
            if(c.getName()=="Dragon")
            {
                blue.addAcDragon();
            }else if(c.getName()=="Mage")
            {
                blue.addAcMage();
            }else if(c.getName()=="Knight")
            {
                blue.addAcKnight();
            }else if(c.getName()=="BeastRider")
            {
                blue.addAcBeastRider();
            }else if(c.getName()=="Sorceress")
            {
                blue.addAcSrceress();
            }else if(c.getName()=="DifferentName")
            {
                blue.addAcDifferentname();
            }else if(c.getName()=="Elf")
            {
                blue.addAcElf();
            }else if(c.getName()=="Dwarf")
            {
                blue.addAcDwarf();
            }else if(c.getName()=="Scout")
            {
                blue.addAcScout();
            }else if(c.getName()=="Slayer")
            {
                blue.addAcSlayer();
            }else if(c.getName()=="Trap")
            {
                blue.addAcTrap();
            }
        }
    }

    /**
     * It chooses and returns  the final piece that the player has lost and brings it back into play.
     * This piece could not be a trap.
     * If there is not a valid piece which could be returnable, function returns null
     * @param pl player
     * @return the piece that it will be survuve
     * */
    Piece survivablePiece(Player pl)
    {
        if(pl.getList().isEmpty()==false)
        {
            while(pl.getList().getTheFirstPiece().getName()=="Trap")
            {
                pl.getList().removeApiece(pl.getList().getTheFirstPiece());
            }
            if(pl.getList().isEmpty()==false)
            {
                return pl.getList().getTheFirstPiece();
            }
        }
        return null;
    }

    /**
     * This function shows the hidden pieces
     * @param nameOfTeam the team
     * */
    void shownHiddenPieces(String nameOfTeam)
    {
        for(int i=0; i<8; i++)
        {
            for(int j=0; j<10; j++)
            {
                if(board.isEmptyCell(i,j)==false && board.isUnacceptableSpace(i,j)==false && board.returnApiece(i,j).getNameOfTeam().compareTo(nameOfTeam)==0)
                {
                    game.setAnImage(i,j,"./src/images/"+nameOfTeam+"/Hidden.png");
                }
            }
        }
    }

    /**
     * This function shown the Normal Pieces, not the hidden
     * @param nameOfTeam the team
     * */
    void shownNormalPieces(String nameOfTeam)
    {
        for(int i=0; i<8; i++)
        {
            for(int j=0; j<10; j++)
            {
                if(board.isEmptyCell(i,j)==false && board.isUnacceptableSpace(i,j)==false  && board.returnApiece(i,j).getNameOfTeam().compareTo(nameOfTeam)==0)
                {
                    game.setAnImage(i,j,"./src/images/"+nameOfTeam+"/"+board.returnApiece(i,j).getName()+".png");
                }
            }
        }
    }

    /**
     * This function prepaires the Red player.
     */
    private void prepairRed()
    {
        int i,j;
        /*ftiaxnoume tin fwtos, ta position twn pieces kai arxikopoioume to paixnidi gia ton mple kai red paikti*/
        while(!red.getList().isEmpty())
        {
            if(red.getReduced()==false)
            {
                i=getRandomVal(0,2);
                j=getRandomVal(0,9);
            }else
            {
                i=getRandomVal(0,1);
                j=getRandomVal(0,9);
            }
            if(board.isEmptyCell(i,j)==true)
            {
                board.setAPiece(i,j,red.getList().getTheFirstPiece());
                red.getList().getTheFirstPiece().setX(i);
                red.getList().getTheFirstPiece().setY(j);
                game.setAnImage(i,j,"./src/images/Red/"+red.getList().getTheFirstPiece().getName()+".png");
                red.getList().removeApiece(red.getList().getTheFirstPiece());
            }
        }
    }

    /**
     * This function prepaires the Blue player.
     */
    private void prepareBlue()
    {
        int i,j;
        while(!blue.getList().isEmpty())
        {
            if(blue.getReduced()==false)
            {
                i=getRandomVal(5,7);
                j=getRandomVal(0,9);
            }else
            {
                i=getRandomVal(6,7);
                j=getRandomVal(0,9);
            }
            if(board.isEmptyCell(i,j)==true)
            {
                board.setAPiece(i,j,blue.getList().getTheFirstPiece());
                blue.getList().getTheFirstPiece().setX(i);
                blue.getList().getTheFirstPiece().setY(j);
                game.setAnImage(i,j,"./src/images/Blue/"+blue.getList().getTheFirstPiece().getName()+".png");
                blue.getList().removeApiece(blue.getList().getTheFirstPiece());
            }
        }

    }

    /**
     * this function makes all the changes depending on which player has a "better" piece
     * @param a the one of the two Pieces in the fight
     * @param b the other one Piece in the fight
     * */
    void fight(Piece a, Piece b)
    {
        int x,y,x1,y1;
        if(a.getNameOfTeam()=="Red")
        {
            red.addAnumberOfAttach();
        }else
        {
            blue.addAnumberOfAttach();
        }
        if(b.getName()=="Flag")
        {
            if(a.getNameOfTeam()=="Blue")
            {
                blue.setTheWinner(true);
            }else
            {
                red.setTheWinner(true);
            }
        }
        if(a.getName()=="Slayer" && b.getName()=="Dragon")
        {
            x=b.getX();
            y=b.getY();
            x1=a.getX();
            y1=a.getY();
            game.removeAnImage(x,y);
            if(board.returnApiece(x,y).getNameOfTeam()=="Red")
            {
                red.getList().addApiece(board.returnApiece(x,y));
            }else
            {
                blue.getList().addApiece(board.returnApiece(x,y));
            }
            board.removeApiece(x,y);
            captureCount(b);
            b.setExists(false);
            board.setAPiece(x,y,a);
            game.setAnImage(x,y,"./src/images/"+board.returnApiece(x,y).getNameOfTeam()+"/"+board.returnApiece(x,y).getName()+".png");
            game.removeAnImage(x1,y1);
            board.removeApiece(x1,y1);
            if(a.getNameOfTeam()=="Red")
            {
                red.addAsuccessfulAttack();
            }else {
                blue.addAsuccessfulAttack();
            }
            return;
        }
        if(a.getName()=="Dwarf" && b.getName()=="Trap")
        {
            x=b.getX();
            y=b.getY();
            x1=a.getX();
            y1=a.getY();
            game.removeAnImage(x,y);
            if(board.returnApiece(x,y).getNameOfTeam()=="Red")
            {
                red.getList().addApiece(board.returnApiece(x,y));
            }else
            {
                blue.getList().addApiece(board.returnApiece(x,y));
            }
            board.removeApiece(x,y);
            captureCount(b);
            b.setExists(false);
            board.setAPiece(x,y,a);
            game.setAnImage(x,y,"./src/images/"+board.returnApiece(x,y).getNameOfTeam()+"/"+board.returnApiece(x,y).getName()+".png");
            game.removeAnImage(x1,y1);
            board.removeApiece(x1,y1);
            if(a.getNameOfTeam()=="Red")
            {
                red.addAsuccessfulAttack();
            }else {
                blue.addAsuccessfulAttack();
            }
            return;
        }
        if(b.getName()=="Trap")
        {
            game.removeAnImage(a.getX(),a.getY());
            if(board.returnApiece(a.getX(),a.getY()).getNameOfTeam()=="Red")
            {
                red.getList().addApiece(board.returnApiece(game.getRow(),game.getCol()));
            }else
            {
                blue.getList().addApiece(board.returnApiece(game.getRow(),game.getCol()));
            }
            board.removeApiece(a.getX(),a.getY());
            captureCount(a);
            a.setExists(false);
            return;
        }
        if(a.getKatataxi()<b.getKatataxi())
        {
            game.removeAnImage(a.getX(),a.getY());
            if(board.returnApiece(a.getX(),a.getY()).getNameOfTeam()=="Red")
            {
                red.getList().addApiece(board.returnApiece(a.getX(),a.getY()));
            }else
            {
                blue.getList().addApiece(board.returnApiece(a.getX(),a.getY()));
            }
            board.removeApiece(a.getX(),a.getY());
            captureCount(a);
            a.setExists(false);

        }else if(a.getKatataxi()>b.getKatataxi())
        {
            x=b.getX();
            y=b.getY();
            x1=a.getX();
            y1=a.getY();
            game.removeAnImage(x,y);
            if(board.returnApiece(x,y).getNameOfTeam()=="Red")
            {
                red.getList().addApiece(board.returnApiece(x,y));
            }else
            {
                blue.getList().addApiece(board.returnApiece(x,y));
            }
            board.removeApiece(x,y);
            captureCount(b);
            b.setExists(false);
            board.setAPiece(x,y,a);
            game.setAnImage(x,y,"./src/images/"+board.returnApiece(x,y).getNameOfTeam()+"/"+board.returnApiece(x,y).getName()+".png");
            game.removeAnImage(x1,y1);
            board.removeApiece(x1,y1);
            if(a.getNameOfTeam()=="Red")
            {
                red.addAsuccessfulAttack();
            }else {
                blue.addAsuccessfulAttack();
            }
        }else if(a.getKatataxi()==b.getKatataxi()){
            captureCount(a);
            captureCount(b);
            game.removeAnImage(a.getX(),a.getY());
            if(a.getNameOfTeam()=="Red")
            {
                red.getList().addApiece(board.returnApiece(a.getX(),a.getY()));
            }else
            {
                blue.getList().addApiece(board.returnApiece(a.getX(),a.getY()));
            }
            board.removeApiece(a.getX(),a.getY());
            if(b.getNameOfTeam()=="Blue")
            {
                blue.getList().addApiece(board.returnApiece(b.getX(),b.getY()));
            }else
            {
                red.getList().addApiece(board.returnApiece(b.getX(),b.getY()));
            }
            game.removeAnImage(b.getX(),b.getY());
            board.removeApiece(b.getX(),b.getY());
        }
    }

    /**
     * It starts the game!
     * <pre>
     *      *     <b>Precondition: when a player select a piece , he can not change his decision   </b>
     *      * </pre>
     *      * <pre>
     *      *     <b> </b>
     *      * </pre>
     * @throws InterruptedException throws exception
     * */
    public void getStarted() throws InterruptedException {
        Piece survPiece;
        int playerWhoStarts = getRandomVal(0,1);;
        prepairRed();
        prepareBlue();
        //System.out.println("The "+playerWhoStarts+ " starts");
        if(playerWhoStarts==0)
        {
            shownNormalPieces("Blue");
            shownHiddenPieces("Red");
            players[0].setPlaysNow(true);
            players[1].setPlaysNow(false);
            informations.setPlayerId("Blue");
            informations.setRe(blue.getSurvives());
            informations.showCaptures(red);
        }else
        {
            players[1].setPlaysNow(true);
            players[0].setPlaysNow(false);
            shownNormalPieces("Red");
            shownHiddenPieces("Blue");
            informations.setPlayerId("Red");
            informations.setRe(red.getSurvives());
            informations.showCaptures(blue);
        }


        while(red.getTheWinner()==false && blue.getTheWinner()==false)
        {
            informations.setTr();
            informations.setRe(players[playerWhoStarts].getSurvives());
            if(players[playerWhoStarts].getNumberOfAttack()!=0)
            {
                informations.setSuccAr((float)(players[playerWhoStarts].getSuccessfulAttack())/players[playerWhoStarts].getNumberOfAttack());
            }
            /*System.out.println("before waitForAction in Controller");*/
            System.out.println(players[playerWhoStarts].getName());
            /*mexri o player na epileksei ena pioni p tou aneikei*/
            game.waitForAction();
            if( board.isUnacceptableSpace(game.getRow(),game.getCol())==true || board.isEmptyCell(game.getRow(),game.getCol())==true || board.returnApiece(game.getRow(),game.getCol()).getNameOfTeam()!=players[playerWhoStarts].getName() || board.isEmptyCell(game.getRow(),game.getCol())==true || board.returnApiece(game.getRow(),game.getCol()).isMovable()==false)
            {
                game.waitForAction();
                while( board.isUnacceptableSpace(game.getRow(),game.getCol())==true ||  board.isEmptyCell(game.getRow(),game.getCol())==true || board.returnApiece(game.getRow(),game.getCol()).getNameOfTeam()!=players[playerWhoStarts].getName() || board.returnApiece(game.getRow(),game.getCol()).isMovable()==false)
                {
                    game.waitForAction();
                }
            }

            System.out.println(board.returnApiece(game.getRow(),game.getCol()).getName());
            System.out.println(board.returnApiece(game.getRow(),game.getCol()).getNameOfTeam());
            first_x = game.getRow();
            first_y = game.getCol();
            /*mexri na epileksei kati p den einai apagoreumeni perioxi kai den einai pioni tou  */
            game.waitForAction();
            if(board.isUnacceptableSpace(game.getRow(),game.getCol())==true || (board.isEmptyCell(game.getRow(),game.getCol())==false && board.returnApiece(game.getRow(),game.getCol()).getNameOfTeam().compareTo(players[playerWhoStarts].getName())==0) || board.validPosition(board.returnApiece(first_x,first_y),first_x,first_y,game.getRow(),game.getCol())==false)
            {
                //System.out.println("Un");
                game.waitForAction();
                while((board.isUnacceptableSpace(game.getRow(),game.getCol())==true) || (board.isEmptyCell(game.getRow(),game.getCol())==false && board.returnApiece(game.getRow(),game.getCol()).getNameOfTeam().compareTo(players[playerWhoStarts].getName())==0) || board.validPosition(board.returnApiece(first_x,first_y),first_x,first_y,game.getRow(),game.getCol())==false)
                {
                    //System.out.println("UN in");
                    game.waitForAction();
                }
            }
            /*se periptwsi pou einai adeio to board ekei apla metakinw to pioni */
            if(board.isEmptyCell(game.getRow(),game.getCol())==true)
            {

                if(board.returnApiece(first_x,first_y).isMovable()==true)
                {
                    board.setAPiece(game.getRow(),game.getCol(),board.returnApiece(first_x,first_y));
                    game.setAnImage(game.getRow(),game.getCol(),"./src/images/"+board.returnApiece(first_x,first_y).getNameOfTeam()+"/"+board.returnApiece(first_x,first_y).getName()+".png");
                    game.removeAnImage(first_x,first_y);
                    board.removeApiece(first_x,first_y);
                }

            }else
            {
                //System.out.println("antipalou");
                fight(board.returnApiece(first_x,first_y),board.returnApiece(game.getRow(),game.getCol()));
                if(players[playerWhoStarts].getNumberOfAttack()!=0)
                {
                    informations.setSuccAr((float)(players[playerWhoStarts].getSuccessfulAttack())/players[playerWhoStarts].getNumberOfAttack());
                }
            }

            /*ean exoume diaswsi kai o player mporei na kanei +1 diaswsi*/
            if(playerWhoStarts==0 && game.getRow()==0 && blue.getSurvives()+1<=blue.getMaxSurvives() && board.returnApiece(game.getRow(),game.getCol()).getName()!="Scout")
            {
                /*ean to Piece auto den exei ksanadiaswsei*/
                if(board.returnApiece(game.getRow(),game.getCol()).getHasSurvive()==false) {
                    /*tha epileksoume ena i,j sto board */
                    survPiece = survivablePiece(blue);
                    if (survPiece != null) {
                        /*auksanontai oi fores p o Player exei diaswsei*/
                        blue.addASurvive();
                        /*to Piece auto tha diaaswsei */
                        board.returnApiece(game.getRow(),game.getCol()).setHasSurvive(true);
                        /*epilegw ti thesi pou tha mpei to piece pou tha epanelthei sto paixnidi */
                        game.waitForAction();
                        /*h thesi prepei na vrisketai se grammi >=5 , to board ekei na min exei allo Piece*/
                        while (game.getRow() < 5 || board.isEmptyCell(game.getRow(), game.getCol()) == false) {
                            game.waitForAction();
                        }
                        board.setAPiece(game.getRow(), game.getCol(), survPiece);
                        game.setAnImage(game.getRow(), game.getCol(), "./src/images/" + board.returnApiece(game.getRow(), game.getCol()).getNameOfTeam() + "/" + board.returnApiece(game.getRow(), game.getCol()).getName() + ".png");
                        blue.getList().removeApiece(blue.getList().getTheFirstPiece());
                    }
                }
            }else if(playerWhoStarts==1 && game.getRow()==7 && red.getSurvives()+1 <= red.getMaxSurvives() && board.returnApiece(game.getRow(),game.getCol()).getName()!="Scout")
            {
                if(board.returnApiece(game.getRow(),game.getCol()).getHasSurvive()==false) {
                    survPiece = survivablePiece(red);
                    if (survPiece != null) {
                        red.addASurvive();
                        board.returnApiece(game.getRow(),game.getCol()).setHasSurvive(true);
                        game.waitForAction();
                        while (game.getRow() > 2 || board.isEmptyCell(game.getRow(), game.getCol()) == false) {
                            game.waitForAction();
                        }
                        board.setAPiece(game.getRow(), game.getCol(), survPiece);
                        game.setAnImage(game.getRow(), game.getCol(), "./src/images/" + board.returnApiece(game.getRow(), game.getCol()).getNameOfTeam() + "/" + board.returnApiece(game.getRow(), game.getCol()).getName() + ".png");
                        red.getList().removeApiece(blue.getList().getTheFirstPiece());
                    }
                }
            }
            if(playerWhoStarts==0)
            {
                if(board.hasMoveablePieces("Red")==false)
                {
                    blue.setTheWinner(true);
                }
                playerWhoStarts=1;
                players[0].setPlaysNow(false);
                shownNormalPieces("Red");
                informations.setPlayerId("Red");
                informations.showCaptures(blue);
                shownHiddenPieces("Blue");
            }else
            {
                playerWhoStarts=0;
                if(board.hasMoveablePieces("Blue")==false)
                {
                    red.setTheWinner(true);
                }
                players[0].setPlaysNow(false);
                shownNormalPieces("Blue");
                informations.setPlayerId("Blue");
                informations.showCaptures(red);
                shownHiddenPieces("Red");
            }
            players[playerWhoStarts].setPlaysNow(true);

        }
        if(blue.getTheWinner()==true)
        {
            System.out.println("The winner is blue");
            informations.isTheWinner("Blue");
        }else
        {
            System.out.println("The winner is red");
            informations.isTheWinner("Red");
        }
        game.setButtonDisable();
    }


    /**
     * It is a functions that returns an integer from min to max
     * @param min the minimum integer
     * @param max the maximum integer
     * @return a random indeger from min to mux
     */
    public static int getRandomVal(int min, int max) {
        Random rand = new Random();
        int n = rand.nextInt(max - min + 1) + min;
        return n;
    }






















    public static void main(String[] args) throws InterruptedException {
        Menu menu = new Menu();
        synchronized (menu)
        {
            menu.wait();
        }
        Controller game = new Controller(menu.getArmyCrowd());
        game.getStarted();

    }
}
