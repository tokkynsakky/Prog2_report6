package jp.ac.uryukyu.ie.e215711;
import java.util.List;
import java.util.Arrays;

public class GetSomethingFromIdentifier {
    String getRow(String destination){
        int sum = 0;
        String num = "";
        List<String> rowNColumn = Arrays.asList(destination.split(""));
        for(String str: rowNColumn){
            if(sum == 0){
                num = str;
            }
            sum++;
        }
        return num;
    }
    String getPiece(String Piece){
        int sum = 0;
        String piece = "";
        List<String> separateIdentifier = Arrays.asList(Piece.split(""));
        for(String str: separateIdentifier){
            if(sum == 0){
                piece = str;
            }
            sum++;
        }
        return piece;
    }
    String getOwner(String Piece){
        int sum = 0;
        String owner = "";
        List<String> separateIdentifier = Arrays.asList(Piece.split(""));
        for(String str: separateIdentifier){
            if(sum == 1){
                owner = str;
            }
            sum++;
        }
        return owner;
    }
    String getEvolutionCapability(String Piece){
        int sum = 0;
        String evolutionCapability = "";
        List<String> separateIdentifier = Arrays.asList(Piece.split(""));
        for(String str: separateIdentifier){
            if(sum == 2){
                evolutionCapability = str;
            }
            sum++;
        }
        return evolutionCapability;
    }
    String getEvolutionStatus(String Piece){
        int sum = 0;
        String evolutionStatus = "";
        List<String> separateIdentifier = Arrays.asList(Piece.split(""));
        for(String str: separateIdentifier){
            if(sum == 3){
                evolutionStatus = str;
            }
            sum++;
        }
        return evolutionStatus;
    }
    String getKingidengifier(String Piece){
        int sum = 0;
        String kingIdenfifier = "";
        List<String> separateIdentifier = Arrays.asList(Piece.split(""));
        for(String str: separateIdentifier){
            if(sum == 4){
                kingIdenfifier = str;
            }
            sum++;
        }  
        return kingIdenfifier;
    }  
}