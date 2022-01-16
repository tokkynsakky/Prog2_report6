package jp.ac.uryukyu.ie.e215711;
import java.util.LinkedHashMap;
import java.util.Arrays;
import java.util.List;
/**
 * 将棋盤にある駒を動かすために必要な要素をまとめたクラス
 */
public class MovePiece {
    /**
     * このメソッドは、将棋盤における駒の移動や成り状態、識別子の更新に加え、将棋盤を更新する
     * @param currentPlace　移動させる駒の座標
     * @param destination　駒の移動先の座標
     * @param shogiBoard　現在の将棋盤
     * @param piecestandA　プレーヤーAの持ち駒リスト
     * @param piecestandB　プレーヤーBの持ち駒リスト
     * @param currentPlacePiece 現在地に存在する駒を保存する変数
     * @param row 目的地の座標の「行」の情報
     * @param evolutionedPiece 成り状態になった駒を保存するための変数
     * @return　更新された将棋盤を返す
     */
    LinkedHashMap<String, String>  movePiece(String currentPlace, String destination, LinkedHashMap<String,String> shogiBoard, LinkedHashMap<String, String> piecestandA, LinkedHashMap<String, String> piecestandB){
        GetSomethingFromIdentifier get = new GetSomethingFromIdentifier();
        var Board = shogiBoard;
        List<String> separateCurrentPlace = Arrays.asList(currentPlace.split(""));
        String row = "";
        String currentPlacePiece = "";
        if(!(separateCurrentPlace.get(0).equals("A")) && !(separateCurrentPlace.get(0).equals("B"))){
            currentPlacePiece = shogiBoard.get(currentPlace);
            Board.put(currentPlace, "＿NNNN");
        }else if(separateCurrentPlace.get(0).equals("A")){
            currentPlacePiece = piecestandA.get(currentPlace);
            piecestandA.remove(currentPlace);
        }else if(separateCurrentPlace.get(0).equals("B")){
            currentPlacePiece = piecestandB.get(currentPlace);
            piecestandB.remove(currentPlace);
        }
        
        row = get.getRow(destination);
        Evolution evo = new Evolution();
        if(get.getOwner(currentPlacePiece).equals("A")){
            if(Integer.parseInt(row)<4){
                String evolutionedPiece = evo.evolution(get.getPiece(currentPlacePiece));
                currentPlacePiece = evolutionedPiece + get.getOwner(currentPlacePiece) + get.getEvolutionCapability(currentPlacePiece) + get.getEvolutionStatus(currentPlacePiece) + get.getKingIdentifier(currentPlacePiece);
            }
        }else if(get.getOwner(currentPlacePiece).equals("B")){
            if(Integer.parseInt(row)>6){
                String evolutionedPiece = evo.evolution(get.getPiece(currentPlacePiece));
                currentPlacePiece = evolutionedPiece + get.getOwner(currentPlacePiece) + get.getEvolutionCapability(currentPlacePiece) + get.getEvolutionStatus(currentPlacePiece) + get.getKingIdentifier(currentPlacePiece);
            }
        }else if(get.getOwner(currentPlacePiece).equals("N")){
        }
        
        row = "";
        Board.put(destination, currentPlacePiece);
        return Board;
    }
}