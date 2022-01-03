package jp.ac.uryukyu.ie.e215711;
import java.util.ArrayList;
import java.util.List;

public class ShogiBoard{
    /*
    このメソッドに代入されたリストに将棋盤の初期状態を作ることを想定。
    引数は中身が空のリストを想定。
    */
    List<String> MakeShogiBoard(){
        List<String> ShogiBoard = new ArrayList<>();
        

        ShogiBoard.add("香");
        ShogiBoard.add("桂");
        ShogiBoard.add("銀");
        ShogiBoard.add("金");
        ShogiBoard.add("王");
        ShogiBoard.add("金");
        ShogiBoard.add("銀");
        ShogiBoard.add("桂");
        ShogiBoard.add("香");


        ShogiBoard.add("");
        ShogiBoard.add("飛");
        ShogiBoard.add("");
        ShogiBoard.add("");
        ShogiBoard.add("");
        ShogiBoard.add("");
        ShogiBoard.add("");
        ShogiBoard.add("角");
        ShogiBoard.add("");

        ShogiBoard.add("歩");
        ShogiBoard.add("歩");
        ShogiBoard.add("歩");
        ShogiBoard.add("歩");
        ShogiBoard.add("歩");
        ShogiBoard.add("歩");
        ShogiBoard.add("歩");
        ShogiBoard.add("歩");
        ShogiBoard.add("歩");


        ShogiBoard.add("");
        ShogiBoard.add("");
        ShogiBoard.add("");
        ShogiBoard.add("");
        ShogiBoard.add("");
        ShogiBoard.add("");
        ShogiBoard.add("");
        ShogiBoard.add("");
        ShogiBoard.add("");


        ShogiBoard.add("");
        ShogiBoard.add("");
        ShogiBoard.add("");
        ShogiBoard.add("");
        ShogiBoard.add("");
        ShogiBoard.add("");
        ShogiBoard.add("");
        ShogiBoard.add("");
        ShogiBoard.add("");


        ShogiBoard.add("");
        ShogiBoard.add("");
        ShogiBoard.add("");
        ShogiBoard.add("");
        ShogiBoard.add("");
        ShogiBoard.add("");
        ShogiBoard.add("");
        ShogiBoard.add("");
        ShogiBoard.add("");


        ShogiBoard.add("歩");
        ShogiBoard.add("歩");
        ShogiBoard.add("歩");
        ShogiBoard.add("歩");
        ShogiBoard.add("歩");
        ShogiBoard.add("歩");
        ShogiBoard.add("歩");
        ShogiBoard.add("歩");
        ShogiBoard.add("歩");


        ShogiBoard.add("");
        ShogiBoard.add("角");
        ShogiBoard.add("");
        ShogiBoard.add("");
        ShogiBoard.add("");
        ShogiBoard.add("");
        ShogiBoard.add("");
        ShogiBoard.add("飛");
        ShogiBoard.add("");


        ShogiBoard.add("香");
        ShogiBoard.add("桂");
        ShogiBoard.add("銀");
        ShogiBoard.add("金");
        ShogiBoard.add("王");
        ShogiBoard.add("金");
        ShogiBoard.add("銀");
        ShogiBoard.add("桂");
        ShogiBoard.add("香");
        

        return ShogiBoard;


    }
    
}