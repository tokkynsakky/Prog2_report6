package jp.ac.uryukyu.ie.e215711;
import java.util.LinkedHashMap;
import java.util.Arrays;
import java.util.List;
public class MovePiece {
    LinkedHashMap<String, String>  movePiece(String currentPlace, String destination, LinkedHashMap<String,String> shogiBoard){
        GetSomethingFromIdentifier get = new GetSomethingFromIdentifier();
        var Board = shogiBoard;
        String currentPlacePiece = shogiBoard.get(currentPlace);
        Board.put(currentPlace, "＿NNNN");
        
        String row = "";
        List<String> separateDestination = Arrays.asList(destination.split(""));
        System.out.println("separateDestination = "+separateDestination);
        row = separateDestination.get(0);
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
        }
        
        row = "";
        Board.put(destination, currentPlacePiece);
        return Board;
    }
}
