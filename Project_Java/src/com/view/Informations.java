package com.view;
import com.model.Player.Player;

import javax.swing.*;
import java.awt.*;

public class Informations {
    private JTextPane playerNumber;
    private String playerId = " ";
    private JLabel pl ;
    private JLabel tr;
    private JLabel re;
    private JLabel succAr;
    private static int turn=0;
    private JFrame frame;
    public Informations(boolean reduced)
    {
        JPanel activeArmy = new JPanel();
        activeArmy.setBackground(Color.white);
        activeArmy.setBounds(0,0,600,30);

        JPanel choosen = new JPanel();
        choosen.setBackground(Color.gray);
        choosen.setBounds(0,30,600,25);

        JLabel activeRules = new JLabel("Active Rules");
        activeRules.setFont(new Font("Arial",Font.PLAIN,24));
        activeArmy.add(activeRules);

        JCheckBox checkbox = new JCheckBox();
        checkbox.setText("Reduced army");
        if(reduced==true)
        {
            checkbox.setSelected(true);
        }
        checkbox.setBackground(Color.gray);
        checkbox.setFont(new Font("Arial",Font.PLAIN,15));
        choosen.add(checkbox);

        /*statistika */
        JPanel statistics = new JPanel();
        statistics.setBackground(Color.white);
        statistics.setBounds(0,59,600,30);
        JLabel stat = new JLabel("Statistics");
        stat.setFont(new Font("Arial",Font.PLAIN,24));
        statistics.add(stat);

        /*player _ turn*/
        JPanel player = new JPanel();
        player.setBackground(Color.gray);
        player.setBounds(0,89,600,30);
        pl = new JLabel();

        /*turn*/
        JPanel turn = new JPanel();
        turn.setBackground(Color.gray);
        turn.setBounds(0,120,600,40);
        tr = new JLabel();
        tr.setFont(new Font("Arial",Font.PLAIN,18));
        tr.setText("Turn: "+ turn);
        turn.add(tr);

        /*rescue*/
        JPanel rescue = new JPanel();
        rescue.setBackground(Color.gray);
        rescue.setBounds(0,160,600,40);
        re = new JLabel();
        re.setFont(new Font("Arial",Font.PLAIN,18));
        re.setText("Rescues: 0");
        rescue.add(re);

        /*successful attack rate*/
        JPanel sAr = new JPanel();
        sAr.setBackground(Color.gray);
        sAr.setBounds(0,200,600,40);
        succAr = new JLabel();
        succAr.setFont(new Font("Arial",Font.PLAIN,18));
        succAr.setText("Successfull attack rate: ");
        sAr.add(succAr);

        pl.setText("Player " + " turn");
        pl.setFont(new Font("Arial",Font.PLAIN,18));
        player.add(pl);

        /*captures*/
        JPanel captures = new JPanel();
        captures.setBounds(0,260,600,50);
        JLabel c= new JLabel();
        c.setFont(new Font("Arial",Font.PLAIN,20));
        c.setText("Captures");
        captures.add(c);



        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(600,900);
        frame.setVisible(true);
        frame.add(statistics);
        frame.add(activeArmy);
        frame.add(choosen);
        frame.add(player);
        frame.add(turn);
        frame.add(rescue);
        frame.add(sAr);
        frame.add(captures);
    }

    /**
     * This function changes and shows the player who plays now
     * @param playerId player who plays now
     * */
    public void setPlayerId(String playerId)
    {
        pl.setText("Player "+ playerId + " turn");
    }

    /**
     * This function counts and shows the turn
     * */
    public void setTr()
    {
        turn ++;
        tr.setText("Turn: "+ turn);
    }
    /**
     * It sets the rescues
     * @param rescues the rescues
     * */
    public void setRe(int rescues)
    {
        re.setText("Rescues: "+ rescues);
    }
    /**
     * It sets the  successfull attack rate
     * @param sAr successfull attack rate
     * */
    public void setSuccAr(float sAr)
    {
        succAr.setText("Successfull attack rate: "+ sAr*100 + " %");
    }


    /**
     * It shows the captures of a player
     * @param p the player that we want to see his captures
     * */
    public void showCaptures(Player p)
    {

        /*dragon*/
        JPanel dragon = new JPanel();
        dragon.setBounds(0,310,100,150);
        ImageIcon dr = new ImageIcon("./src/images/"+p.getName()+"/Dragon.png");
        Image img = dr.getImage();
        Image imgScale = img.getScaledInstance(100,150, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        JLabel drag = new JLabel(scaledIcon);
        dragon.add(drag);
        frame.add(dragon);
        JPanel cd = new JPanel();
        cd.setBounds(0,460,100,40);
        cd.add(new JLabel(String.valueOf(p.getCdragon())));
        frame.add(cd);
        /*mage*/
        JPanel mage = new JPanel();
        mage.setBounds(100,310,100,150);
        ImageIcon ma = new ImageIcon("./src/images/"+p.getName()+"/Mage.png");
        img = ma.getImage();
        imgScale = img.getScaledInstance(100,150, Image.SCALE_SMOOTH);
        scaledIcon = new ImageIcon(imgScale);
        JLabel mag= new JLabel(scaledIcon);
        mage.add(mag);
        frame.add(mage);
        JPanel cma = new JPanel();
        cma.setBounds(100,460,100,40);
        cma.add(new JLabel(String.valueOf(p.getCmage())));
        frame.add(cma);

        /*knight*/
        JPanel knight = new JPanel();
        knight.setBounds(200,310,100,150);
        ImageIcon kn = new ImageIcon("./src/images/"+p.getName()+"/Knight.png");
        img = kn.getImage();
        imgScale = img.getScaledInstance(100,150, Image.SCALE_SMOOTH);
        scaledIcon = new ImageIcon(imgScale);
        JLabel kni= new JLabel(scaledIcon);
        knight.add(kni);
        frame.add(knight);
        JPanel ckn = new JPanel();
        ckn.setBounds(200,460,100,40);
        ckn.add(new JLabel(String.valueOf(p.getCknight())));
        frame.add(ckn);


        /*beast rider*/
        JPanel bestRider = new JPanel();
        bestRider.setBounds(300,310,100,150);
        ImageIcon br = new ImageIcon("./src/images/"+p.getName()+"/BeastRider.png");
        img = br.getImage();
        imgScale = img.getScaledInstance(100,150, Image.SCALE_SMOOTH);
        scaledIcon = new ImageIcon(imgScale);
        JLabel best= new JLabel(scaledIcon);
        bestRider.add(best);
        frame.add(bestRider);
        JPanel cbr = new JPanel();
        cbr.setBounds(300,460,100,40);
        cbr.add(new JLabel(String.valueOf(p.getCbeastrider())));
        frame.add(cbr);

        /*sorceress*/
        JPanel sorceress = new JPanel();
        sorceress.setBounds(400,310,100,150);
        ImageIcon sor = new ImageIcon("./src/images/"+p.getName()+"/Sorceress.png");
        img = sor.getImage();
        imgScale = img.getScaledInstance(100,150, Image.SCALE_SMOOTH);
        scaledIcon = new ImageIcon(imgScale);
        JLabel sorc= new JLabel(scaledIcon);
        sorceress.add(sorc);
        frame.add(sorceress);
        JPanel csor = new JPanel();
        csor.setBounds(400,460,100,40);
        csor.add(new JLabel(String.valueOf(p.getCsorceress())));
        frame.add(csor);

        /*spec*/
        JPanel special = new JPanel();
        special.setBounds(500,310,100,150);
        ImageIcon sp = new ImageIcon("./src/images/"+p.getName()+"/DifferentName.png");
        img = sp.getImage();
        imgScale = img.getScaledInstance(100,150, Image.SCALE_SMOOTH);
        scaledIcon = new ImageIcon(imgScale);
        JLabel spec= new JLabel(scaledIcon);
        special.add(spec);
        frame.add(special);
        JPanel cdn = new JPanel();
        cdn.setBounds(500,460,100,40);
        cdn.add(new JLabel(String.valueOf(p.getCdifferentname())));
        frame.add(cdn);

        /*elf*/
        JPanel elf = new JPanel();
        elf.setBounds(0,480,100,150);
        ImageIcon el = new ImageIcon("./src/images/"+p.getName()+"/Elf.png");
        img = el.getImage();
        imgScale = img.getScaledInstance(100,150, Image.SCALE_SMOOTH);
        scaledIcon = new ImageIcon(imgScale);
        JLabel ef= new JLabel(scaledIcon);
        elf.add(ef);
        frame.add(elf);
        JPanel celf = new JPanel();
        celf.setBounds(0,630,100,40);
        celf.add(new JLabel(String.valueOf(p.getCelf())));
        frame.add(celf);

        /*dwarf*/
        JPanel dwarf = new JPanel();
        dwarf.setBounds(100,480,100,150);
        ImageIcon dw = new ImageIcon("./src/images/"+p.getName()+"/Dwarf.png");
        img = dw.getImage();
        imgScale = img.getScaledInstance(100,150, Image.SCALE_SMOOTH);
        scaledIcon = new ImageIcon(imgScale);
        JLabel dwf= new JLabel(scaledIcon);
        dwarf.add(dwf);
        frame.add(dwarf);
        JPanel cdwarf = new JPanel();
        cdwarf.setBounds(100,630,100,40);
        cdwarf.add(new JLabel(String.valueOf(p.getCdward())));
        frame.add(cdwarf);

        /*scout*/
        JPanel scout = new JPanel();
        scout.setBounds(200,480,100,150);
        ImageIcon sco = new ImageIcon("./src/images/"+p.getName()+"/Scout.png");
        img = sco.getImage();
        imgScale = img.getScaledInstance(100,150, Image.SCALE_SMOOTH);
        scaledIcon = new ImageIcon(imgScale);
        JLabel sc= new JLabel(scaledIcon);
        scout.add(sc);
        frame.add(scout);
        JPanel cscout = new JPanel();
        cscout.setBounds(200,630,100,40);
        cscout.add(new JLabel(String.valueOf(p.getCscout())));
        frame.add(cscout);


        /*slayer*/
        JPanel slayer = new JPanel();
        slayer.setBounds(300,480,100,150);
        ImageIcon sl = new ImageIcon("./src/images/"+p.getName()+"/Slayer.png");
        img = sl.getImage();
        imgScale = img.getScaledInstance(100,150, Image.SCALE_SMOOTH);
        scaledIcon = new ImageIcon(imgScale);
        JLabel sla= new JLabel(scaledIcon);
        slayer.add(sla);
        frame.add(slayer);
        JPanel cslayer = new JPanel();
        cslayer.setBounds(300,630,100,40);
        cslayer.add(new JLabel(String.valueOf(p.getCslayer())));
        frame.add(cslayer);

        /*trap*/
        JPanel trap = new JPanel();
        trap.setBounds(400,480,100,150);
        ImageIcon tr = new ImageIcon("./src/images/"+p.getName()+"/Trap.png");
        img = tr.getImage();
        imgScale = img.getScaledInstance(100,150, Image.SCALE_SMOOTH);
        scaledIcon = new ImageIcon(imgScale);
        JLabel tra= new JLabel(scaledIcon);
        trap.add(tra);
        frame.add(trap);
        JPanel ctrap = new JPanel();
        ctrap.setBounds(400,630,100,40);
        ctrap.add(new JLabel(String.valueOf(p.getCtrap())));
        frame.add(ctrap);

        /*total captures*/
        JPanel totalCaptures = new JPanel();
        totalCaptures.setBounds(0,670,600,23);
        totalCaptures.setBackground(Color.gray);

        JLabel tc = new JLabel();
        int totc = p.getCdragon() + p.getCmage() + p.getCknight()+p.getCbeastrider()+p.getCsorceress()+p.getCdifferentname()+p.getCelf()+p.getCdward()+p.getCscout()+p.getCslayer()+p.getCtrap();
        tc.setText("Total captures: "+totc);
        totalCaptures.add(tc);
        frame.add(totalCaptures);

    }

    /**
     * It shows who is the winner, when there is a winner
     * @param win : the winner as String
     * */
    public void isTheWinner(String win)
    {
        JPanel winner = new JPanel();
        winner.setBounds(0,693,600,40);
        JLabel w = new JLabel();
        winner.add(w);
        w.setText("The winner is "+win +"!");
        if(win.compareTo("Red")==0)
        {
            winner.setBackground(Color.red);
        }else
        {
            winner.setBackground(Color.blue);
        }
        frame.add(winner);
    }
}
