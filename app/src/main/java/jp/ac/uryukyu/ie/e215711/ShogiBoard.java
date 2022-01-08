package jp.ac.uryukyu.ie.e215711;
import java.util.ArrayList;
import java.util.List;
//ーーー恐らく完成ーーー
public class ShogiBoard{
    int sum = 0;
    void AddPiece1(List<String> ShogiBoard){//同じ内容の繰り返しを避けるためにメソッド化
        if(sum == 0){
            ShogiBoard.add("䅨");
            ShogiBoard.add("圭");
            ShogiBoard.add("银");
            ShogiBoard.add("釒");
            ShogiBoard.add("玉");
            ShogiBoard.add("釒");
            ShogiBoard.add("银");
            ShogiBoard.add("圭");
            ShogiBoard.add("䅨");    
            sum ++;
        }else if (sum == 1){
            ShogiBoard.add("香");
            ShogiBoard.add("桂");
            ShogiBoard.add("銀");
            ShogiBoard.add("金");
            ShogiBoard.add("王");
            ShogiBoard.add("金");
            ShogiBoard.add("銀");
            ShogiBoard.add("桂");
            ShogiBoard.add("香");    
        }
    }
    void AddPiece2(List<String> ShogiBoard, String piece, int turn){
        for(int i = 0;i<turn;i++){
            ShogiBoard.add(piece);
        }
    }
    void AddPiece3(List<String> ShogiBoard){
        sum = 0;
        if(sum == 0){
            ShogiBoard.add("");
            ShogiBoard.add("飞");
            for(int i = 0;i<5;i++){
                ShogiBoard.add("");
            }
            ShogiBoard.add("觕");
            ShogiBoard.add("");
            sum ++;
        }else if(sum == 1){
            ShogiBoard.add("");
            ShogiBoard.add("飛");
            for(int i = 0;i<5;i++){
                ShogiBoard.add("");
            }
            ShogiBoard.add("");
            ShogiBoard.add("角");
            sum ++;
        }
    }
    /*
    このメソッドに代入されたリストに将棋盤の初期状態を作ることを想定。
    引数は中身が空のリストを想定。
    */
    List<String> MakeShogiBoard(){
        List<String> ShogiBoard = new ArrayList<>();

        AddPiece1(ShogiBoard);
        AddPiece3(ShogiBoard);
        AddPiece2(ShogiBoard, "步", 9);
        AddPiece2(ShogiBoard, "", 27);
        AddPiece2(ShogiBoard, "歩", 9);
        AddPiece3(ShogiBoard);
        AddPiece1(ShogiBoard);
        
        return ShogiBoard;
    }
}