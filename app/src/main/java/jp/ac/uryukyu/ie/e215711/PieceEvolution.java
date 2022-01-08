package jp.ac.uryukyu.ie.e215711;
public class PieceEvolution {
    String evoPiece;
    String Evolution(String piece, String coordinate, String destination){
        GetSomethingFromCoordinate get = new GetSomethingFromCoordinate();
        if(get.getOwner(coordinate).equals("X")){
            if(get.getColumn(destination)>6){
                switch(piece){
                    case "歩":
                    evoPiece = "と";
                    case "香":
                    evoPiece = "き";
                    case "桂":
                    evoPiece = "け";
                    case "銀":
                    evoPiece = "ぎ";
                    case "步":
                    evoPiece = "ト";
                    case "䅨":
                    evoPiece = "キ";
                    case "圭":
                    evoPiece = "ケ";
                    case "银":
                    evoPiece = "ギ";
                    case "飞":
                    evoPiece = "龍";
                    case "觕":
                    evoPiece = "马";
                    case "飛":
                    evoPiece = "竜";
                    case "角":
                    evoPiece = "馬";
                }        
            }
        }else if(get.getOwner(coordinate).equals("Y")){
            if(get.getColumn(destination)<4){
                switch(piece){
                    case "歩":
                    evoPiece = "と";
                    case "香":
                    evoPiece = "き";
                    case "桂":
                    evoPiece = "け";
                    case "銀":
                    evoPiece = "ぎ";
                    case "步":
                    evoPiece = "ト";
                    case "䅨":
                    evoPiece = "キ";
                    case "圭":
                    evoPiece = "ケ";
                    case "银":
                    evoPiece = "ギ";
                }
        
            }
        }
    return evoPiece;    
    }
}
