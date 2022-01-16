package jp.ac.uryukyu.ie.e215711;
import java.util.LinkedHashMap;
import java.util.Scanner;
/**
 * 将棋ゲームを進行のためのmainメソッドを持ち、必要なインスタンスを作成するクラス
 */
public class GameMaster {
    /**
     * 将棋ゲームを実際操作するメソッド。while文でscannerの入力を条件が達成されるまで繰り返し受け付ける。王、玉を取ることで勝敗が決する（二歩の判定は不可）
     * @param str 移動させる駒の座標
     * @param cuttentPlace 現在地の座標
     * @param string 駒の移動先の座標
     * @param destination 目的地の座標
     * @param destinationPlacePiece 目的地の座標の駒
     * @param piecestandA プレーヤーAの持ち駒リスト
     * @param getOrderA プレーヤーAが取得した駒の取得された順番（識別子として用いる）(１番目からのスタートとする)
     * @param piecestandB プレーヤーBの持ち駒リスト
     * @param getOrderB プレーヤーBが取得した駒の取得された順番
     * @return void なし
     */
    public static void main(String[] args){
        LinkedHashMap<String, String> piecestandA = new LinkedHashMap<>();
        LinkedHashMap<String, String> piecestandB = new LinkedHashMap<>();
        GameJudge judge = new GameJudge();
        PieceIdentify identify = new PieceIdentify();
        var shogiBoard = identify.Identify();
        PieceStand pieceStand = new PieceStand();
        ShowBoard show = new ShowBoard();
        MovePiece Move = new MovePiece();
        ShowPieceStand showpiece = new ShowPieceStand();
        show.Show(shogiBoard);showpiece.Show(piecestandA,piecestandB);
        int getOrderA = 1;
        int getOrderB = 1;
        GetSomethingFromIdentifier get = new GetSomethingFromIdentifier();
        try(Scanner scan=new Scanner(System.in)){
            while(judge.gottenPieceJudge(piecestandA, piecestandB) == true){
                System.out.println("移動させる駒の座標を入力してください(行＋列)(endでゲームを終了)");
                String str=scan.next();
                if("end".equals(str)){scan.close();break;}
                String currentPlace = str;//入力された移動させる駒の座標
                
                System.out.println("移動先の座標を入力してください(行＋列)");
                String string =scan.next();
                if("end".equals(str)){scan.close();break;}
                String destination = string;//入力された駒の移動先の座標

                String destinationPlacePiece = shogiBoard.get(destination);//移動先の駒の値
                if(get.getOwner(shogiBoard.get(destination)).equals("B")){
                    piecestandA = pieceStand.obtainedPiece(destinationPlacePiece, piecestandA, getOrderA);
                    if(!(get.getPiece(destination).equals("＿"))){getOrderA++;}
                }else if(get.getOwner(shogiBoard.get(destination)).equals("A")){
                    piecestandB = pieceStand.obtainedPiece(destinationPlacePiece, piecestandB, getOrderB);
                    if(!(get.getPiece(destination).equals("＿"))){getOrderB++;}
                }

                shogiBoard = Move.movePiece(currentPlace, destination, shogiBoard, piecestandA, piecestandB);
                show.Show(shogiBoard);showpiece.Show(piecestandA,piecestandB);
                System.out.println(piecestandB);System.out.println(piecestandA);
            }
        }
    }
}