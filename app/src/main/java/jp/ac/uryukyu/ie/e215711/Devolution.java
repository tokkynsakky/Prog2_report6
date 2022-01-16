package jp.ac.uryukyu.ie.e215711;
/**
 * 成り(Evolution)をした後に、元に戻すことを目的としたメソッドを内包するクラス
 * @param piece メソッドにより変化された駒を保存する変数。大文字から始まるPieceとは異なる
 */
public class Devolution {
    String piece = "";
    /**
     * 成り状態を戻し、通常の駒に変化させるメソッド
     * @param Piece メソッドに渡された駒を保存する変数
     * @return 変化した駒を返す
     */
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