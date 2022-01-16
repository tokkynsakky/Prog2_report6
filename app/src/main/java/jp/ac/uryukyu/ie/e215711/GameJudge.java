package jp.ac.uryukyu.ie.e215711;

import java.util.LinkedHashMap;
/**
 * ゲームの終了判定を行うクラス
 */
public class GameJudge {
    /**
     * 駒を受け取り、プレーヤーの手持ちに王、玉が含まれているか判定するメソッド
     * @param Piece 駒を受け取る
     * @param decision 真偽値を保存。true(ゲーム継続可能)、false(ゲーム継続不可)を意味する
     * @return 終了判定の真偽値　
     */
    boolean judge(String Piece){
        boolean decision = true;
        if(Piece.equals("王") || Piece.equals("玉")){
            decision = false;
        }
        return decision;
    }
    /**
     * 二人のプレーヤーの手持ちの駒リストを受け取り、勝者が存在するかの判定を行い、勝者を定める
     * @param pieceStandA　プレーヤーAの手持ちの駒リスト
     * @param pieceStandB　プレーヤーBの手持ちの駒リスト
     * @param decision 真偽値を保存。true(ゲーム継続可能)、false(ゲーム継続不可)を意味する
     * @param winner　勝者が存在する時、勝利したプレーヤーのアルファベットAorBが代入されるための変数
     * @return　ゲームの終了判定の真偽値を返す
     */
    boolean gottenPieceJudge(LinkedHashMap<String, String> pieceStandA, LinkedHashMap<String, String> pieceStandB){
        GetSomethingFromIdentifier get = new GetSomethingFromIdentifier();
        boolean decision = true;
        String winner = "";
        for(String str: pieceStandA.values()){
            decision = judge(get.getKingIdentifier(str));
            if(decision == false){
                winner = "A";
            }
        }
        for(String str: pieceStandB.values()){
            decision = judge(get.getKingIdentifier(str));
            if(decision == false){
                winner = "B";
            }
        }
        if(decision == false){
            System.out.println("-----" + winner + "の勝利" + "-----");
        }
        return decision;
    }
}