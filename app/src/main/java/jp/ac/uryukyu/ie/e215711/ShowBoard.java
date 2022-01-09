package jp.ac.uryukyu.ie.e215711;
import java.util.List;
import java.util.LinkedHashMap;
public class ShowBoard {
    /**
     * 将棋盤を表示するためのメソッド
     */
    static List<String> Board;//これは、ArrayList。　あくまで表示用。　実際の処理はBoardMapで行うとする。
    //将棋盤の表示
    void Show(LinkedHashMap<String, String> Board){
        System.out.printf("\n");
        int sum = 0;
        for (String x: Board.values()) {
            GetSomethingFromIdentifier get = new GetSomethingFromIdentifier();
            System.out.printf(get.getPiece(x));
            sum ++;
            if(sum%9==0){
                System.out.printf("\n");
            }
        }
        System.out.printf("\n");
    }
}