package jp.ac.uryukyu.ie.e215711;
import java.util.LinkedHashMap;

public class MovePiece {
    LinkedHashMap<String, String>  movePiece(String currentPlace, String destination, LinkedHashMap<String,String> shogiBoard){
        var Board = shogiBoard;
        String currentPlacePiece = shogiBoard.get(currentPlace);
        //String destinationPiece = shogiBoard.get(destination);
        Board.put(currentPlace, "＿");
        Board.put(destination, currentPlacePiece);
        return Board;
    }
}