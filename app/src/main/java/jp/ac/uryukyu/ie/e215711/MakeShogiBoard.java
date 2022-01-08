package jp.ac.uryukyu.ie.e215711;
import java.util.List;
import java.util.LinkedHashMap;
public class MakeShogiBoard {
    public LinkedHashMap<String, String> makeShogiBoard(){
        List<String> Board;
        ShogiBoard ShogiBoard = new ShogiBoard();//将棋盤の作成クラスをインスタンス化
        PieceIdentify identityBoard = new PieceIdentify();//駒に座標と持ち主の情報を追加するクラスをインスタンス化
        Board = ShogiBoard.MakeShogiBoard();//将棋盤作成　
        LinkedHashMap<String, String> identifiedBoard = new LinkedHashMap<>();
        identifiedBoard = identityBoard.Identify(Board);//将棋盤の駒に座標を追加　根底はこれ identifiedBoardをいじっていく
        ShowBoard ShowBoard = new ShowBoard();//将棋盤の表示のインスタンス化 
        ShowBoard.Show(identifiedBoard);//将棋盤の表示
        return identifiedBoard;
    }
    
}
