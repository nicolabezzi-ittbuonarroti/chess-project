package com.company;


public class Bishop {
    private Position pos;

    public Bishop(Position pos){
        this.pos = pos;
    }

    public Position getPosition(){
        return this.pos;
    }

    public boolean move(int newRow, char newColumn) {
        if (isValidMove(newRow, newColumn)) {
            // Check if the new position is within the chessboard
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

        if (rowDiff == colDiff) {
            return true;
        }

        return false;
    }
}
