package jp.ac.uryukyu.ie.e215711;
import java.util.LinkedHashMap;
import java.util.List;
/**
 * 将棋盤を作成し、将棋盤の駒に識別子を追加するためのクラス
 */
public class PieceIdentify {
    /**
     * 将棋盤の駒に識別子を追加するメソッド。同時に将棋盤を作成している
     * @param row String型の行
     * @param Row　int型の行
     * @param column String型の列
     * @param Column int型の列
     * @return　駒に識別子を追加された将棋盤を返す
     */
    LinkedHashMap<String, String> Identify(){
        ShogiBoard board = new ShogiBoard();
        List<String> Board = board.MakeShogiBoard();
        LinkedHashMap<String, String> BoardMap = new LinkedHashMap<>();
        String row = "1";
        String column = "1";
        
        for(int i=0;i<Board.size();i++){
            int Column = Integer.parseInt(column);
            if(Column > 9){
                int Row = Integer.parseInt(row);
                Row++;
                row = String.valueOf(Row);
                Column = 1;
                column = "1";
            }
            BoardMap.put(row+column, Board.get(i));
            Column++;
            column = String.valueOf(Column);
        }
        return BoardMap;
    }
}