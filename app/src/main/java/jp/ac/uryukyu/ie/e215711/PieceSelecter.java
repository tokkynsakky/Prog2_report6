package jp.ac.uryukyu.ie.e215711;
import java.util.Scanner;


// catch文を後から追加する
public class PieceSelecter {
    String coordinate = "";
    int sum = 0;
    String pieceSelecter(){

        // Scannerインスタンス作成（標準入力System.inから入力）
        Scanner scanner = new Scanner(System.in);
         
        //System.out.print("小数を入力してください(0を入力すると終了)");
        System.out.println("プレイヤーを入力してください。(XorY)(0を入力すると投了)");
        //System.out.print("移動したい駒の座標を入力してください(0を入力すると投了)" + "");
         
        // 入力された内容を取得
        String d = scanner.next();
        coordinate += d;
         
        while(sum != 2) {
          if(sum == 0){
              System.out.println("横軸の座標を入力してください");
              coordinate += scanner.next();
          }else if(sum == 1){
              System.out.println("縦軸の座標を入力してください");
              coordinate += scanner.next();
          }
          sum ++;
        }
        // 入力された内容を画面表示
        System.out.println("入力値" + coordinate);
         
        // Scannerインスタンスをクローズ
        scanner.close();

        return coordinate;
    }
}
