package jp.ac.uryukyu.ie.e215711;   import java.util.List;   import java.util.Arrays;
/**
 * 駒に含まれる識別子から、特定の情報のみを取り出すメソッドをまとめたクラス
 */
public class GetSomethingFromIdentifier {
    /**
     * 駒の座標を受け取り、「行」のみ取り出すメソッド。
     * @param destination　駒の移動先
     * @param sum ループ文を回した回数
     * @param num 「行」を保存するための変数
     * @return　移動先の座標の「行」を返す
     */
    String getRow(String destination){int sum = 0;   String num = "";
        List<String> rowNColumn = Arrays.asList(destination.split(""));
        for(String str: rowNColumn){
            if(sum == 0){num = str;}
            sum++;}
        return num;
    }
    /**
     * 駒の識別子を受け取り、駒の文字を返すメソッド
     * @param Piece　駒の識別子
     * @param piece 駒の文字を保存するための変数
     * @param sum ループ文を回した回数
     * @return 駒の文字を返す
     */
    String getPiece(String Piece){int sum = 0;   String piece = "";
        List<String> separateIdentifier = Arrays.asList(Piece.split(""));
        for(String str: separateIdentifier){if(sum == 0){piece = str;}
        sum++;}
        return piece;
    }
    /**
     * 駒の識別子を受け取り、駒の所有者を返すメソッド
     * @param Piece　駒の識別子
     * @param owner 駒の持ち主を保存するための変数
     * @param sum ループ文を回した回数
     * @return　駒の所有者を返す
     */
    String getOwner(String Piece){int sum = 0;   String owner = "";
        List<String> separateIdentifier = Arrays.asList(Piece.split(""));
        for(String str: separateIdentifier){if(sum == 1){owner = str;}
        sum++;}
        return owner;
    }
    /**
     * 駒の識別子を受け取り、、駒の成りの可能性を示す識別子を返すメソッド
     * @param Piece　駒の識別子
     * @param evolutionCpability 駒の成りの可能性を示す識別子を保存するための変数
     * @param sum ループ文を回した回数
     * @return 駒の成りの可能性を示す識別子を返す
     */
    String getEvolutionCapability(String Piece){int sum = 0;   String evolutionCapability = "";
        List<String> separateIdentifier = Arrays.asList(Piece.split(""));
        for(String str: separateIdentifier){
            if(sum == 2){evolutionCapability = str;}
            sum++;
        }
        return evolutionCapability;
    }
    /**
     * 駒の識別子を受け取り、駒の成り状態を示す識別子を返すメソッド
     * @param Piece　駒の識別子
     * @param evolutionStatus 駒の成り状態を示す識別子を保存するための変数
     * @param sum ループ文を回した回数
     * @return　駒の成り状態を示す識別子を返す
     */
    String getEvolutionStatus(String Piece){int sum = 0;   String evolutionStatus = "";
        List<String> separateIdentifier = Arrays.asList(Piece.split(""));
        for(String str: separateIdentifier){
            if(sum == 3){evolutionStatus = str;}
            sum++;
        }
        return evolutionStatus;
    }
    /**
     * 駒の識別子を受け取り、駒が王または玉か否かを示す識別子を返すメソッド
     * @param Piece　駒の識別子
     * @param kingIdentifier　駒が王または玉か否かを示す識別子を保存するメソッド
     * @param sum ループを回した回数
     * @return　駒が王または玉であるかどうかを判定する識別子を返す
     */
    String getKingIdentifier(String Piece){int sum = 0;   String kingIdenfifier = "";
        List<String> separateIdentifier = Arrays.asList(Piece.split(""));
        for(String str: separateIdentifier){
            if(sum == 4){kingIdenfifier = str;}
            sum++;
        }  
        return kingIdenfifier;
    }  
}