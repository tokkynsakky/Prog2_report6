package jp.ac.uryukyu.ie.e215711;

public class Devolution {
    String piece = "";
    String devolution(String Piece){
        GetSomethingFromIdentifier get = new GetSomethingFromIdentifier();
        Piece = get.getPiece(Piece);
        if(Piece.equals("と")){
            piece = "歩";
        }else if(Piece.equals("ト")){
            piece = "步";
        }else if(Piece.equals("き")){
            piece = "香";
        }else if(Piece.equals("キ")){
            piece = "䅨";
        }else if(Piece.equals("け")){
            piece = "桂";
        }else if(Piece.equals("ケ")){
            piece = "圭";
        }else if(Piece.equals("ぎ")){
            piece = "銀";
        }else if(Piece.equals("ギ")){
            piece = "银";
        }else if(Piece.equals("竜")){
            piece = "飛";
        }else if(Piece.equals("龍")){
            piece = "飞";
        }else if(Piece.equals("馬")){
            piece = "角";
        }else if(Piece.equals("马")){
            piece = "觕";
        }else{
            piece = Piece;
        }
        return piece;
    }
    
}