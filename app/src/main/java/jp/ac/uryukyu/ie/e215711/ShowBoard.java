package jp.ac.uryukyu.ie.e215711;
import java.util.List;
public class ShowBoard {
    /**
     * 将棋盤を表示するためのメソッド
     */
    static List<String> Board;//これは、ArrayList。　あくまで表示用。　実際の処理はBoardMapで行うとする。
    //将棋盤の表示
    List<String> Show(){
        System.out.printf("\n");
        ShogiBoard ShogiBoard = new ShogiBoard();
        Board = ShogiBoard.MakeShogiBoard();
        int i,j;
        for(i=0;i<Board.size();i++){
            j=i+1;
            if(Board.get(i) == ""){
                System.out.printf("＿");
            }else{
                System.out.printf(Board.get(i));
            }
            if(j%9==0){
                System.out.printf("\n");
            }
        }
        System.out.printf("\n");
        return Board;
    }

}
