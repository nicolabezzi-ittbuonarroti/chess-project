package com.company;

public class Position {
    private int row;
    private char col;

    public Position(int row, char col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public char getCol() {
        return col;
    }

    public void setPosition(int Newrow, char Newcol) {
        row = Newrow;
        col = Newcol;
    }

    public void setPosition(Position pos) {
        row = pos.getRow();
        col = pos.getCol();
    }


    public boolean equals(Position pos) {
        boolean out = false;
        if (pos.getRow() == row && pos.getCol()==col){
            out = true;
        }
        return out;
    }
}
