package jp.ac.uryukyu.ie.e215711;
//import jp.ac.uryukyu.ie.e215711.*;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class GameMaster {
    public static void main(String[] args){
        PieceIdentify identify = new PieceIdentify();
        var shogiBoard = identify.Identify();
        ShowBoard show = new ShowBoard();
        show.Show(shogiBoard);
        MovePiece Move = new MovePiece();
        try(Scanner scan=new Scanner(System.in)){
            //System.out.println("終了は「end」を入力");
            while(true){
                System.out.println("移動させる駒の座標を入力してください(endでゲームを終了)");
                String str=scan.next();
                if("end".equals(str)){scan.close();break;}
                String currentPlace = str;
                
                System.out.println("移動先の座標を入力してください(endでゲームを終了)");
                String string =scan.next();
                if("end".equals(str)){scan.close();break;}
                String destination = string;
                Move.movePiece(currentPlace, destination, shogiBoard);
                show.Show(shogiBoard);
            }
        }
    }
}