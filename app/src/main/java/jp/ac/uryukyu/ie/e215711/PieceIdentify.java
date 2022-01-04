package jp.ac.uryukyu.ie.e215711;
import java.util.List;
import java.util.LinkedHashMap;
//ーーー恐らく完成ーーー
public class PieceIdentify {
    //LinkedHashMap<String, String> BoardMap;
    //mapにより識別子を与える
    //LinkedHashMap<String, String> BoardMap;//HashMap or Map ?
    LinkedHashMap<String, String> BoardMap = new LinkedHashMap<>();
    String Player = "Y";//空白にはNを使用
    int row = 1;
    int column = 1;
    LinkedHashMap<String, String> Identify(List<String> Board){//HashMap or Map?
        //相手をXとし、自らをYとする　。空白はNとする
        for(int i=0;i<Board.size();i++){
            //String Evolution;　追加する可能性あり
            String j = Board.get(i);
            if(!(j.equals(""))){//!(j.equals("")) || !(j.equals("__"))
                if(i<27){//27は上から三行の駒の密集地帯
                    Player = "X";
                    BoardMap.put(Player + row + column,j);//key"駒"とvalue"座標"が一番初めに行ったが、入れ替えた
                }else if(54<=i){//54は下から三行の密集地帯
                    Player = "Y";
                    BoardMap.put(Player + row + column,j);//key"駒"とvalue"座標"が一番初めに行ったが、入れ替えた
                }
            }else if(j.equals("")){//j.equals("") || j.equals("__")
                BoardMap.put("N" + row + column,"");//key""とvalue"座標"が一番初めに行ったが、入れ替えた
            }
            row += 1;
            if(row > 9){
                column += 1;
                row =1;
            }
        }
    return BoardMap;
    }
}
