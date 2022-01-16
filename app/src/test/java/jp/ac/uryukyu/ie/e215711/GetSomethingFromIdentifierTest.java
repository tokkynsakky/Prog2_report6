package jp.ac.uryukyu.ie.e215711;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GetSomethingFromIdentifierTest {
    GetSomethingFromIdentifier get = new GetSomethingFromIdentifier();
    @Test
    void getSomethingFromIdentifierTest(){
        String Piece = "飞B可非臣";
        String currentPlace = "33";
        assertEquals(get.getPiece(Piece), "飞");
        assertEquals(get.getOwner(Piece), "B");
        assertEquals(get.getEvolutionCapability(Piece), "可");
        assertEquals(get.getEvolutionStatus(Piece), "非");
        assertEquals(get.getKingIdentifier(Piece), "臣");
        assertEquals(get.getRow(currentPlace), "3");
    }
}
