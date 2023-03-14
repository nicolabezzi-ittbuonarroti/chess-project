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

    public boolean moveTo(Position pos){
        boolean moved=false;
        if(this.validMoves().contains(pos)){
            this.pos = pos;
            moved = true;
        }
        return moved;
    }

    public ArrayList<Position> validMoves(){
        ArrayList<Position> validMoves = new ArrayList<Position>();
        for(int i = 0; i<8; i++){
            for(int j = 'a'; j<'h'; j++){       //non so come fare
                if(new Position(i,j).isValid()){
                    validMoves.add(new Position(i,j));
                }
            }
        }
        return validMoves;
    }
}
