package jp.ac.uryukyu.ie.e215711;
//import java.util.LinkedHashMap;
//import jp.ac.uryukyu.ie.e215711.*;
//import java.util.ArrayList;
//import java.util.List;


//!!!!keyとvalueが逆なのでは？!!!!

/**
 * 通常の将棋とは将棋盤の読み方が異なり、左上から行を読み、さらに下の行に移るように座標を扱う。
 */
public class GameMaster {
    static boolean Game = true;
    //List<String> Board;//これは、ArrayList。　あくまで表示用。　実際の処理はBoardMapで行うとする。

    public static void main(String[] args){
        MakeShogiBoard shogiBoard = new MakeShogiBoard();
        var identifiedBoard = shogiBoard.makeShogiBoard();
        PieceSelecter selecter = new PieceSelecter();
        PieceMove pieceMove = new PieceMove();
        while(Game == true){
            pieceMove.move(selecter.pieceSelecter(), identifiedBoard);
        }

        /*
        List<String> Board;
        ShogiBoard ShogiBoard = new ShogiBoard();//将棋盤の作成クラスをインスタンス化
        PieceIdentify identityBoard = new PieceIdentify();//駒に座標と持ち主の情報を追加するクラスをインスタンス化
        Board = ShogiBoard.MakeShogiBoard();//将棋盤作成　
        LinkedHashMap<String, String> identifiedBoard = new LinkedHashMap<>();
        identifiedBoard = identityBoard.Identify(Board);//将棋盤の駒に座標を追加　根底はこれ identifiedBoardをいじっていく
        */

        /*
        ShowBoard ShowBoard = new ShowBoard();//将棋盤の表示のインスタンス化 
        ShowBoard.Show(identifiedBoard);//将棋盤の表示
        */

        //プレイヤーのターン これは後で考えるとする
        //移動する駒を選択　ー＞　移動  --> 座標指定(key)  ==>  駒(value)  ==>  駒.java.move()  ==>  bttle()
        //相手のターン
        //移動する駒を選択　ー＞　移動


        //System.out.println(Board);
        //id.Identify(Board);
    }
}