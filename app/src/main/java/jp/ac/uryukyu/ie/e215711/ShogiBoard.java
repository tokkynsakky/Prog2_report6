package jp.ac.uryukyu.ie.e215711;
import java.util.ArrayList;
import java.util.List;
/**
 * 将棋盤を作成するためのクラス
 */
public class ShogiBoard{
    /**
     * 指定されたリストに、指定された駒の識別子を、指定された回数追加するメソッド
     * @param ShogiBoard　将棋盤のリスト
     * @param piece　駒の識別子
     * @param turn　駒の識別子が追加された将棋盤のリストを返す
     */
    void AddPiece2(List<String> ShogiBoard, String piece, int turn){
        for(int i = 0;i<turn;i++){ShogiBoard.add(piece);}
    }
    int Sum = 0;
    /**
     * 決まりきった識別子のリストへの追加パターンの分量を減らすためのメソッド
     * @param ShogiBoard　将棋盤のリスト
     */
    void AddPiece3(List<String> ShogiBoard){
        if(Sum == 0){
            ShogiBoard.add("＿NNNN");
            ShogiBoard.add("飞B可非臣");
            for(int i = 0;i<5;i++){ShogiBoard.add("＿NNNN");}
            ShogiBoard.add("觕B可非臣");
            ShogiBoard.add("＿NNNN");
            Sum ++;
        }else if(Sum == 1){
            ShogiBoard.add("＿NNNN");
            ShogiBoard.add("角A可非臣");
            for(int i = 0;i<5;i++){ShogiBoard.add("＿NNNN");}
            ShogiBoard.add("飛A可非臣");
            ShogiBoard.add("＿NNNN");
        }
    }
    /*
    このメソッドに代入されたリストに将棋盤の初期状態を作ることを想定。
    引数は中身が空のリストを想定。
    */
    List<String> ShogiBoard = new ArrayList<>();
    /**
     * このメソッドに代入されたリストに将棋盤の初期状態を作ることを想定。実際に渡されたリストのKeyに対して、駒の識別子を追加する
     * A　or B プレイヤー識別
     * 可 or 不 成りの識別　　　
     * 成 or 非　　成り状態の識別
     * 王 or 臣　　王将か否かの識別
     * @return　完成した将棋盤のリストを返す
     */
    List<String> MakeShogiBoard(){
        ShogiBoard.add("䅨B可非臣");ShogiBoard.add("圭B可非臣");ShogiBoard.add("银B可非臣");
        ShogiBoard.add("釒B不非臣");ShogiBoard.add("玉B不非王");ShogiBoard.add("釒B不非臣");
        ShogiBoard.add("银B可非臣");ShogiBoard.add("圭B可非臣");ShogiBoard.add("䅨B可非臣");    
        AddPiece3(ShogiBoard);
        AddPiece2(ShogiBoard, "步B可非臣", 9);
        AddPiece2(ShogiBoard, "＿NNNN", 27);
        AddPiece2(ShogiBoard, "歩A可非臣", 9);
        AddPiece3(ShogiBoard);
        ShogiBoard.add("香A可非臣");ShogiBoard.add("桂A可非臣");ShogiBoard.add("銀A可非臣");
        ShogiBoard.add("金A不非臣");ShogiBoard.add("王A不非王");ShogiBoard.add("金A不非臣");
        ShogiBoard.add("銀A可非臣");ShogiBoard.add("桂A可非臣");ShogiBoard.add("香A可非臣");    
        return ShogiBoard;
    }
}