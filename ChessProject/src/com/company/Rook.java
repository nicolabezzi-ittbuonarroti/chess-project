package com.company;


public class Rook {
    private Position pos;

    public Rook(Position pos){
        this.pos = pos;
    }

    public Position getPosition(){
        return this.pos;
    }

    public boolean move(int newRow, char newColumn) {
        if (isValidMove(newRow, newColumn)) {
            if (newRow >= 1 && newRow <= 8 && newColumn >= 'a' && newColumn <= 'h') {
                pos.setPosition(newRow, newColumn);
                return true;
            }
        }
        return false;
    }
    private boolean isValidMove(int newRow, char newColumn) {
        int rowDiff = Math.abs(newRow - pos.getRow());
        int colDiff = Math.abs(newColumn - pos.getCol());

        if ((rowDiff == 0 && colDiff > 0) || (rowDiff > 0 && colDiff == 0)) {
            return true;
        }

        return false;
    }
}
