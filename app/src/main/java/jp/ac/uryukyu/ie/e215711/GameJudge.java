package jp.ac.uryukyu.ie.e215711;

import java.util.LinkedHashMap;

public class GameJudge {
    boolean judge(String Piece){
        boolean decision = true;
        if(Piece.equals("王") || Piece.equals("玉")){
            decision = false;
        }
        return decision;
    }
    boolean gottenPieceJudge(LinkedHashMap<String, String> pieceStandA, LinkedHashMap<String, String> pieceStandB){
        GetSomethingFromIdentifier get = new GetSomethingFromIdentifier();
        boolean decision = true;
        String winner = "";
        for(String str: pieceStandA.values()){
            decision = judge(get.getKingidengifier(str));
            if(decision == false){
                winner = "A";
            }
        }
        for(String str: pieceStandB.values()){
            decision = judge(get.getKingidengifier(str));
            if(decision == false){
                winner = "B";
            }
        }
        if(decision == false){
            System.out.println("-----" + winner + "の勝利" + "-----");
        }
        return decision;
    }
}