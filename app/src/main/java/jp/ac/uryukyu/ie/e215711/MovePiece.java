package jp.ac.uryukyu.ie.e215711;
import java.util.LinkedHashMap;
import java.util.Arrays;
import java.util.List;
public class MovePiece {
    LinkedHashMap<String, String>  movePiece(String currentPlace, String destination, LinkedHashMap<String,String> shogiBoard, LinkedHashMap<String, String> piecestandA, LinkedHashMap<String, String> piecestandB){
        GetSomethingFromIdentifier get = new GetSomethingFromIdentifier();
        var Board = shogiBoard;
        List<String> separateCurrentPlace = Arrays.asList(currentPlace.split(""));
        //String currentPlacePiece;
        String row = "";// String row = "";
        String currentPlacePiece = "";
        //List<String> separateDestination; //ーーーーーーーーーーーーーー　<ーこれが原因ーーーーーーーーーーーーーーー
        if(!(separateCurrentPlace.get(0).equals("A")) && !(separateCurrentPlace.get(0).equals("B"))){//そもそもこれは判定でseparatecurrentPlaceに識別子が入っていない
            currentPlacePiece = shogiBoard.get(currentPlace);
            Board.put(currentPlace, "＿NNNN");
        }else if(separateCurrentPlace.get(0).equals("A")){
            currentPlacePiece = piecestandA.get(currentPlace);
            piecestandA.remove(currentPlace);
        }else if(separateCurrentPlace.get(0).equals("B")){
            currentPlacePiece = piecestandB.get(currentPlace);
            piecestandB.remove(currentPlace);
        }
        
        row = get.getRow(destination);
        /*
        int sum = 0;
        for(String str: separateDestination){  << これで悩んでた
            if(sum == 0){
                row = str;
            }
        }
        int sum = 0;
        */
        Evolution evo = new Evolution();
        if(get.getOwner(currentPlacePiece).equals("A")){
            if(Integer.parseInt(row)<4){
                String evolutionedPiece = evo.evolution(get.getPiece(currentPlacePiece));
                currentPlacePiece = evolutionedPiece + get.getOwner(currentPlacePiece) + get.getEvolutionCapability(currentPlacePiece) + get.getEvolutionStatus(currentPlacePiece) + get.getKingidengifier(currentPlacePiece);
            }
        }else if(get.getOwner(currentPlacePiece).equals("B")){
            if(Integer.parseInt(row)>6){
                String evolutionedPiece = evo.evolution(get.getPiece(currentPlacePiece));
                currentPlacePiece = evolutionedPiece + get.getOwner(currentPlacePiece) + get.getEvolutionCapability(currentPlacePiece) + get.getEvolutionStatus(currentPlacePiece) + get.getKingidengifier(currentPlacePiece);
            }
        }else if(get.getOwner(currentPlacePiece).equals("N")){
        }
        
        
        row = "";
        Board.put(destination, currentPlacePiece);
        return Board;
    }
}