package jp.ac.uryukyu.ie.e215711;
import java.util.List;
import java.util.Arrays;

public class GetSomethingFromIdentifier {
    int sum = 0;
    String owner = "";
    String evolutionCapability = "";
    String evolutionStatus = "";
    String kingIdenfifier = "";
    String piece = "";
    String getPiece(String Piece){
        List<String> separateIdentifier = Arrays.asList(Piece.split(""));
        for(String str: separateIdentifier){
            if(sum == 0){
                piece += str;
            }
            sum++;
        }
        return piece;
    }
    String getOwner(String Piece){
        List<String> separateIdentifier = Arrays.asList(Piece.split(""));
        for(String str: separateIdentifier){
            if(sum == 1){
                owner += str;
            }
            sum++;
        }
        return owner;
    }
    String getEvolutionCapability(String Piece){
        List<String> separateIdentifier = Arrays.asList(Piece.split(""));
        for(String str: separateIdentifier){
            if(sum == 2){
                evolutionCapability += str;
            }
            sum++;
        }
        return evolutionCapability;
    }
    String getEvolutionStatus(String Piece){
        List<String> separateIdentifier = Arrays.asList(Piece.split(""));
        for(String str: separateIdentifier){
            if(sum == 3){
                evolutionStatus += str;
            }
            sum++;
        }
        return evolutionStatus;
    }
    String getKingidengifier(String Piece){
        List<String> separateIdentifier = Arrays.asList(Piece.split(""));
        for(String str: separateIdentifier){
            if(sum == 4){
                kingIdenfifier += str;
            }
            sum++;
        }  
        return kingIdenfifier;
    }  
}