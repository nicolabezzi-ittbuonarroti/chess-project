package com.company;

import java.util.ArrayList;

public class Knight {
    private Position pos;

    public Knight(Position pos){
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
        
        if ((rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2)) {
            return true;
        }
        return false;
    }
}
