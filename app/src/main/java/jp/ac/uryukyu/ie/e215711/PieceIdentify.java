package jp.ac.uryukyu.ie.e215711;
import java.util.LinkedHashMap;
import java.util.List;
//ーーー恐らく完成ーーー
public class PieceIdentify {
    //LinkedHashMap<String, String> BoardMap;
    //mapにより識別子を与える
    //LinkedHash   Map<String, String> BoardMap;//HashMap or Map ?
    LinkedHashMap<String, String> Identify(){//HashMap or Map?
        ShogiBoard board = new ShogiBoard();
        List<String> Board = board.MakeShogiBoard();
        LinkedHashMap<String, String> BoardMap = new LinkedHashMap<>();
        String row = "1";
        String column = "1";
        //ShogiBoard shogiBoard = new ShogiBoard();
        //var board = shogiBoard.MakeShogiBoard();
        for(int i=0;i<Board.size();i++){
            int Column = Integer.parseInt(column);
            if(Column > 9){
                int Row = Integer.parseInt(row);
                Row++;
                row = String.valueOf(Row);
                Column = 1;
                column = "1";
            }
            BoardMap.put(row+column, Board.get(i));
            Column++;
            column = String.valueOf(Column);
        }
        return BoardMap;
    }
}