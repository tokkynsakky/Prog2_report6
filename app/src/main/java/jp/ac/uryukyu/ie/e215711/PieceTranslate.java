package jp.ac.uryukyu.ie.e215711;
/**
 * プレーヤーによって異なる漢字の種類を読み替えるためのクラス
 */
public class PieceTranslate {
    /**
     * 漢字の種類を変更するメソッド
     * @param Piece　駒の文字種
     * @return　変更された駒を返す
     */
    String Translate(String Piece){
        if(Piece.equals("歩")){
            Piece = "步";
        }else if(Piece.equals("步")){  
            Piece = "歩";
        }else if(Piece.equals("香")){
            Piece = "䅨";
        }else if(Piece.equals("䅨")){
            Piece = "香";
        }else if(Piece.equals("桂")){
            Piece = "圭";
        }else if(Piece.equals("圭")){
            Piece = "桂";
        }else if(Piece.equals("銀")){
            Piece = "银";
        }else if(Piece.equals("银")){
            Piece = "銀";
        }else if(Piece.equals("飛")){
            Piece = "飞";
        }else if(Piece.equals("飞")){
            Piece = "飛";
        }else if(Piece.equals("角")){
            Piece = "觕";
        }else if(Piece.equals("觕")){
            Piece = "角";
        }
        return Piece;
    }
}