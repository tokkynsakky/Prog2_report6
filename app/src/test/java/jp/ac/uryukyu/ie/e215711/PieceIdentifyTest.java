package jp.ac.uryukyu.ie.e215711;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PieceIdentifyTest {
    @Test
    void pieceIdentifyTest(){
        PieceIdentify identify = new PieceIdentify();
        var shogiBoard = identify.Identify();
        GetSomethingFromIdentifier get = new GetSomethingFromIdentifier();
        //将棋盤の座標にはIdentify()のおかげでKeyである座標が設定された。”飞B可非臣”のような識別子が入っているはずなので、それを取り出せるか確認
        assertNotNull(get.getPiece(shogiBoard.get("11")));
        assertNotNull(get.getOwner(shogiBoard.get("11")));
        assertNotNull(get.getEvolutionCapability(shogiBoard.get("11")));
        assertNotNull(get.getEvolutionStatus(shogiBoard.get("11")));
        assertNotNull(get.getKingIdentifier(shogiBoard.get("11")));
    }
}
