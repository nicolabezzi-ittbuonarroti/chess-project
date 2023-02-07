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

    public int getCol() {
        return col;
    }

    public boolean setPosition(int Newrow, int Newcol) {
        row = Newrow;
        col = Newcol;
    }

    public boolean setPosition(Position pos) {
        row = pos.getRow();
        col = pos.getCol();
    }

    public boolean isValid() {
        boolean out = true;
        if (row > 8 && col > 'H'){
            out = false;
        }
        return true;
    }

    public boolean equals(Position pos) {
        boolean out = false;
        if (pos.getRow() == row && pos.getCol()==col){
            out = true;
        }
        return out;
    }
}
