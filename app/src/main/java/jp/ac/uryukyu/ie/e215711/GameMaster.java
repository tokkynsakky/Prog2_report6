package jp.ac.uryukyu.ie.e215711;
//import jp.ac.uryukyu.ie.e215711.*;
import java.util.ArrayList;
import java.util.List;

public class GameMaster {
    static List<String> Board;
    public static void main(String[] args){
        ShogiBoard ShogiBoard = new ShogiBoard();
        Board = ShogiBoard.MakeShogiBoard();
        //System.out.println(Board);
        int i,j;
        for(i=0;i<Board.size();i++){
            j=i+1;
            if(Board.get(i) == ""){
                System.out.printf("[]");
            }else{
            System.out.printf(Board.get(i));
            }
            if(j%9==0){
                System.out.println("\n");
            }
        }
    }
}