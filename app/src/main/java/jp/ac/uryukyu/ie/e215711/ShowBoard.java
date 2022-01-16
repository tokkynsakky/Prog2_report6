package jp.ac.uryukyu.ie.e215711;
import java.util.List;
import java.util.LinkedHashMap;
/**
 * 将棋盤を表示するメソッドを内包するクラス
 */
public class ShowBoard {
    /**
     * 将棋盤を表示するためのメソッド
     */
    static List<String> Board;//これは、ArrayList。　あくまで表示用。　実際の処理はBoardMapで行うとする。
    //将棋盤の表示
    /**
     * 将棋盤を表示するためのリスト
     * @param Board　将棋盤のリスト
     */
    void Show(LinkedHashMap<String, String> Board){
        System.out.printf("\n");
        int sum = 0;
        for(String x: Board.values()) {
            GetSomethingFromIdentifier get = new GetSomethingFromIdentifier();//移動後
            //System.out.println(x);
            System.out.printf(get.getPiece(x));
            sum ++;
            if(sum%9==0){
                System.out.printf("\n");
            }
        }
        System.out.printf("\n");
    }
}