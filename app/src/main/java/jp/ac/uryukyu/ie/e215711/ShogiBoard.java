package jp.ac.uryukyu.ie.e215711;
import java.util.ArrayList;
import java.util.List;
//ーーー恐らく完成ーーー
public class ShogiBoard{
    void AddPiece2(List<String> ShogiBoard, String piece, int turn){
        for(int i = 0;i<turn;i++){
            ShogiBoard.add(piece);
        }
    }
    int Sum = 0;
    void AddPiece3(List<String> ShogiBoard){
        if(Sum == 0){
            ShogiBoard.add("＿NNNN");
            ShogiBoard.add("飞B可非臣");
            for(int i = 0;i<5;i++){
                ShogiBoard.add("＿NNNN");
            }
            ShogiBoard.add("觕B可非臣");
            ShogiBoard.add("＿NNNN");
            Sum ++;
        }else if(Sum == 1){
            ShogiBoard.add("＿NNNN");
            ShogiBoard.add("角A可非臣");
            for(int i = 0;i<5;i++){
                ShogiBoard.add("＿NNNN");
            }
            ShogiBoard.add("飛A可非臣");
            ShogiBoard.add("＿NNNN");
        }
    }
    /*
    このメソッドに代入されたリストに将棋盤の初期状態を作ることを想定。
    引数は中身が空のリストを想定。
    */
    List<String> ShogiBoard = new ArrayList<>();
    List<String> MakeShogiBoard(){
        
        ShogiBoard.add("䅨B可非臣");
        ShogiBoard.add("圭B可非臣");
        ShogiBoard.add("银B可非臣");
        ShogiBoard.add("釒B不非臣");
        ShogiBoard.add("玉B不非王");
        ShogiBoard.add("釒B不非臣");
        ShogiBoard.add("银B可非臣");
        ShogiBoard.add("圭B可非臣");
        ShogiBoard.add("䅨B可非臣");    
        AddPiece3(ShogiBoard);
        AddPiece2(ShogiBoard, "步B可非臣", 9);
        AddPiece2(ShogiBoard, "＿NNNN", 27);
        AddPiece2(ShogiBoard, "歩A可非臣", 9);
        AddPiece3(ShogiBoard);
        ShogiBoard.add("香A可非臣");
        ShogiBoard.add("桂A可非臣");
        ShogiBoard.add("銀A可非臣");
        ShogiBoard.add("金A不非臣");
        ShogiBoard.add("王A不非王");
        ShogiBoard.add("金A不非臣");
        ShogiBoard.add("銀A可非臣");
        ShogiBoard.add("桂A可非臣");
        ShogiBoard.add("香A可非臣");    
        //System.out.println(ShogiBoard);
        return ShogiBoard;
    }
}