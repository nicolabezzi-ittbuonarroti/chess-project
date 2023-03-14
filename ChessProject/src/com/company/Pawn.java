package com.company;

import java.util.ArrayList;

public class Pawn {
    private Position pos;

    public Pawn(Position pos){
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
        if (newRow != pos.getRow() + 1) {
            return false;
        }

        if (newColumn != pos.getCol() && Math.abs(newColumn - pos.getCol()) != 1) {
            return false;
        }

        return true;
    }
}

