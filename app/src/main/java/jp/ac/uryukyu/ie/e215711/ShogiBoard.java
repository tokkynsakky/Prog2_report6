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
            ShogiBoard.add("＿");
            ShogiBoard.add("飞");
            for(int i = 0;i<5;i++){
                ShogiBoard.add("＿");
            }
            ShogiBoard.add("觕");
            ShogiBoard.add("＿");
            Sum ++;
        }else if(Sum == 1){
            ShogiBoard.add("＿");
            ShogiBoard.add("角");
            for(int i = 0;i<5;i++){
                ShogiBoard.add("＿");
            }
            ShogiBoard.add("飛");
            ShogiBoard.add("＿");
        }
    }
    /*
    このメソッドに代入されたリストに将棋盤の初期状態を作ることを想定。
    引数は中身が空のリストを想定。
    */
    List<String> ShogiBoard = new ArrayList<>();
    List<String> MakeShogiBoard(){
        
        ShogiBoard.add("䅨");
        ShogiBoard.add("圭");
        ShogiBoard.add("银");
        ShogiBoard.add("釒");
        ShogiBoard.add("玉");
        ShogiBoard.add("釒");
        ShogiBoard.add("银");
        ShogiBoard.add("圭");
        ShogiBoard.add("䅨");    
        AddPiece3(ShogiBoard);
        AddPiece2(ShogiBoard, "步", 9);
        AddPiece2(ShogiBoard, "＿", 27);
        AddPiece2(ShogiBoard, "歩", 9);
        AddPiece3(ShogiBoard);
        ShogiBoard.add("香");
        ShogiBoard.add("桂");
        ShogiBoard.add("銀");
        ShogiBoard.add("金");
        ShogiBoard.add("王");
        ShogiBoard.add("金");
        ShogiBoard.add("銀");
        ShogiBoard.add("桂");
        ShogiBoard.add("香");    
        //System.out.println(ShogiBoard);
        return ShogiBoard;
    }
}