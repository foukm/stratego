package com.model.Piece.Unmoveable;

import com.model.Piece.Piece;

public class Unmoveable implements Piece {

    private int x;
    private int y;
    private String nameOfTeam, name;
    private boolean exists,hasSurvive, survive;

    public Unmoveable(int x, int y, int times, String name, String nameOfTeam, boolean exists)
    {
        setX(x);
        setY(y);
        setName(name);
        setExists(exists);
        setNameOfTeam(nameOfTeam);

    }

    @Override
    public int getKatataxi() {
        return 0;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
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
        return false;
    }

    @Override
    public void setHasSurvive(boolean hasSurvive) {

    }

    @Override
    public boolean getHasSurvive() {
        return false;
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
        this.exists = exists;
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
    public String getName() {
        return this.name;
    }
}
