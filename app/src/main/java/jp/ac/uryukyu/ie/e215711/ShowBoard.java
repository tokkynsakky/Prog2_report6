package jp.ac.uryukyu.ie.e215711;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.ArrayList;
public class ShowBoard {
    /**
     * 将棋盤を表示するためのメソッド
     */
    static List<String> Board;//これは、ArrayList。　あくまで表示用。　実際の処理はBoardMapで行うとする。
    //将棋盤の表示
    void Show(LinkedHashMap<String, String> Board){
        System.out.printf("\n");
        int i;
        int j;
        //List<String> list = new ArrayList<>(Board.keyset());
        List<String> list = new ArrayList<>(Board.values());//!!!!showboardの復活から作業開始
        for(i=0;i<Board.size();i++){
            j=i+1;
            if(list.get(i) == ""){
                System.out.printf("＿");
            }else{
                System.out.printf(list.get(i));
            }
            if(j%9==0){
                System.out.printf("\n");
            }
        }
        System.out.printf("\n");
    }
}
