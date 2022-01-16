package jp.ac.uryukyu.ie.e215711;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedHashMap;
public class PieceStandTest {
    @Test
    void pieceStandTest(){
        LinkedHashMap<String, String> piecestandA = new LinkedHashMap<>();
        PieceIdentify identify = new PieceIdentify();
        var shogiBoard = identify.Identify();
        PieceStand pieceStand = new PieceStand();
        int getOrderA = 1;
        piecestandA = pieceStand.obtainedPiece(shogiBoard.get("22"), piecestandA, getOrderA);
        //shogiBoard.get("22") = "飞A可非臣" がpiecestandAの中で"飛B可非臣"となっているはずである
        //文字種と所有者が更新されていることが期待される
        assertEquals(piecestandA.get("A1"), "飛A可非臣");
        
    }
}
