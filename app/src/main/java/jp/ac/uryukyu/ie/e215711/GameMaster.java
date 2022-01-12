package jp.ac.uryukyu.ie.e215711;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class GameMaster {
    public static void main(String[] args){
        LinkedHashMap<String, String> piecestandA = new LinkedHashMap<>();
        LinkedHashMap<String, String> piecestandB = new LinkedHashMap<>();
        PieceIdentify identify = new PieceIdentify();
        var shogiBoard = identify.Identify();
        PieceStand pieceStand = new PieceStand();
        ShowBoard show = new ShowBoard();
        MovePiece Move = new MovePiece();
        ShowPieceStand showpiece = new ShowPieceStand();
        show.Show(shogiBoard);showpiece.Show(piecestandA,piecestandB);
        int getOrderA = 1;
        int getOrderB = 1;//追加
        GetSomethingFromIdentifier get = new GetSomethingFromIdentifier();
        try(Scanner scan=new Scanner(System.in)){
            //System.out.println("終了は「end」を入力");
            while(true){
                System.out.println("移動させる駒の座標を入力してください(行＋列)(endでゲームを終了)");
                String str=scan.next();
                if("end".equals(str)){scan.close();break;}
                String currentPlace = str;//入力された移動させる駒の座標
                
                System.out.println("移動先の座標を入力してください(行＋列)");
                String string =scan.next();
                if("end".equals(str)){scan.close();break;}
                String destination = string;//入力された駒の移動先の座標

                //String currentPlacePiece = shogiBoard.get(currentPlace);//移動させる駒の値
                String destinationPlacePiece = shogiBoard.get(destination);//移動先の駒の値
                if(get.getOwner(shogiBoard.get(destination)).equals("B")){
                    piecestandA = pieceStand.obtainedPiece(destinationPlacePiece, piecestandA, getOrderA);
                    if(!(get.getPiece(destination).equals("＿"))){getOrderA++;}
                }else if(get.getOwner(shogiBoard.get(destination)).equals("A")){
                    piecestandB = pieceStand.obtainedPiece(destinationPlacePiece, piecestandB, getOrderB);
                    if(!(get.getPiece(destination).equals("＿"))){getOrderB++;}
                }

                //ここでevo(destination)? evoに位置判定もつけてしまおうと思う
                
                shogiBoard = Move.movePiece(currentPlace, destination, shogiBoard);
                show.Show(shogiBoard);showpiece.Show(piecestandA,piecestandB);
                
            }
        }
    }
}