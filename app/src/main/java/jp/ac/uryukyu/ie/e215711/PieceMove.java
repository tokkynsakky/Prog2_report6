package jp.ac.uryukyu.ie.e215711;
//import java.util.List;
//import java.util.Arrays;
import java.util.LinkedHashMap;

public class PieceMove {
    String defaultPiece = "";
    String destinationPiece = "";
    LinkedHashMap<String, String> move(String coordinate, LinkedHashMap<String, String> Board){
        //GetSomethingFromCoordinate get = new GetSomethingFromCoordinate();
        PieceSelecter selecter = new PieceSelecter();
        PieceEvolution evo = new PieceEvolution();
        String defaultPiece = Board.get(coordinate);
        String destination = selecter.pieceSelecter();
        Board.put(defaultPiece,"");//もといた場所に空白を追加
        destinationPiece = evo.Evolution(defaultPiece, coordinate, destination);
        Board.put(destination,destinationPiece);//移動先に駒を移動
        return Board;
    }
}
