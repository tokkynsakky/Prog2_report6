package jp.ac.uryukyu.ie.e215711;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PieceTranslateTest {
    @Test
    void pieceTranslateTest(){
        PieceTranslate translate = new PieceTranslate();
        //全て同じ構造のメソッドが文字ごとに設定されているので、一つだけ確認する
        assertEquals(translate.Translate("步"),"歩");
        
    }
}
