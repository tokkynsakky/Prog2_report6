package jp.ac.uryukyu.ie.e215711;
import java.util.LinkedHashMap;
/**
 * プレーヤーの手持ちの駒リストを表示するためのクラス
 */
public class ShowPieceStand {
    /**
     * 手持ちの駒リストを表示するためのリスト
     * @param StandA プレーヤーAの持ち駒リスト
     * @param StandB プレーヤーBの持ち駒リスト
     */
    void Show(LinkedHashMap<String, String> StandA, LinkedHashMap<String, String> StandB){
        System.out.println("---------------------------------");
        System.out.printf("Bの持ち駒 ");
        for(String pieceB: StandB.values()){
            GetSomethingFromIdentifier get = new GetSomethingFromIdentifier();
            System.out.printf(" "+get.getPiece(pieceB));
        }
        System.out.println("");
        System.out.printf("Aの持ち駒 ");
        for(String pieceA: StandA.values()){
            GetSomethingFromIdentifier get = new GetSomethingFromIdentifier();
            System.out.printf(" "+get.getPiece(pieceA));
        }
        System.out.println("");
        System.out.println("---------------------------------");
    }
}