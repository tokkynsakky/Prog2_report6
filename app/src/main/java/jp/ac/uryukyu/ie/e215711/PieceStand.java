package jp.ac.uryukyu.ie.e215711;
import java.util.LinkedHashMap;
/**
 * プレーヤーの手持ちの駒リストを作成するクラス
 */
public class PieceStand {
    /**
     * 手持ちの駒リストを作成するメソッドで、受け取った駒に固有のKeyを作成する。加えて、プレーヤーの持ち駒は互いに漢字の種類が異なるので、漢字の種類の変換を行う
     * @param destinationPlacePiece　プレーヤーが取得した駒
     * @param pieceStand　手持ちの駒リスト
     * @param getOrder　現在の駒取得の回数
     * @param pieceidentifier 変更された駒の識別子を保存するための変数
     * @return　更新された駒リストを返す
     */
    LinkedHashMap<String, String> obtainedPiece(String destinationPlacePiece, LinkedHashMap<String, String> pieceStand, int getOrder){
        //LinkedHashMap<String, String> pieceStand = new LinkedHashMap<>();
        String pieceidentifier = "";
        GetSomethingFromIdentifier get = new GetSomethingFromIdentifier();
        PieceTranslate translate = new PieceTranslate();
        if(!(destinationPlacePiece.equals("＿"))){
            if(get.getOwner(destinationPlacePiece).equals("A")){
                Devolution devo = new Devolution();
                pieceidentifier = translate.Translate(devo.devolution(get.getPiece(destinationPlacePiece))) + "B" + get.getEvolutionCapability(destinationPlacePiece) + "非" + get.getKingIdentifier(destinationPlacePiece);

                pieceStand.put(get.getOwner(pieceidentifier)+getOrder, pieceidentifier);
            }else if(get.getOwner(destinationPlacePiece).equals("B")){
                Devolution devo = new Devolution();
                pieceidentifier = translate.Translate(devo.devolution(get.getPiece(destinationPlacePiece))) + "A" + get.getEvolutionCapability(destinationPlacePiece) + "非" + get.getKingIdentifier(destinationPlacePiece);

                pieceStand.put(get.getOwner(pieceidentifier)+getOrder, pieceidentifier);
            }else{
            }
        }
        return pieceStand;
    }
}