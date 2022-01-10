package jp.ac.uryukyu.ie.e215711;

public class Evolution {
    String piece = "";
    String evolution(String Piece){
        if(Piece.equals("歩")){
            piece = "と";
        }else if(Piece.equals("步")){
            piece = "ト";
        }else if(Piece.equals("香")){
            piece = "き";
        }else if(Piece.equals("䅨")){
            piece = "キ";
        }else if(Piece.equals("桂")){
            piece = "け";
        }else if(Piece.equals("圭")){
            piece = "ケ";
        }else if(Piece.equals("銀")){
            piece = "ぎ";
        }else if(Piece.equals("银")){
            piece = "ギ";
        }else if(Piece.equals("飛")){
            piece = "竜";
        }else if(Piece.equals("飞")){
            piece = "龍";
        }else if(Piece.equals("角")){
            piece = "馬";
        }else if(Piece.equals("觕")){
            piece = "马";
        }else{
            piece = Piece;
        }
        return piece;
    }
}