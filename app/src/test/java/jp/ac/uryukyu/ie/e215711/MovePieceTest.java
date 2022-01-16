package jp.ac.uryukyu.ie.e215711;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedHashMap;
public class MovePieceTest {
    @Test
    void movePieceTest(){
        LinkedHashMap<String, String> piecestandA = new LinkedHashMap<>();
        LinkedHashMap<String, String> piecestandB = new LinkedHashMap<>();
        PieceIdentify identify = new PieceIdentify();
        var shogiBoard = identify.Identify();
        String currentPlace = "33";
        String destination = "43";
        GetSomethingFromIdentifier get = new GetSomethingFromIdentifier();
        MovePiece movePiece = new MovePiece();
        shogiBoard = movePiece.movePiece(currentPlace, destination, shogiBoard, piecestandA, piecestandB);
        assertEquals(get.getPiece(shogiBoard.get("33")), "＿");//移動が正常に完了した時、元いた場所が"＿"となっているはず
    }
}
