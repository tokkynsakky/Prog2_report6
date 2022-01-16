package jp.ac.uryukyu.ie.e215711;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ShogiBoardTest {
    @Test
    void shogiBoardTest(){
        ShogiBoard Board = new ShogiBoard();
        var shogiBoard = Board.MakeShogiBoard();
        int i = 0;
        for(String str:shogiBoard){
            assertNotNull(str);
            i++;
        }
        //将棋の駒リストには9×9=81個の要素が入っているはずなので、for文でインクリメントされたi=81を確認する
        assertEquals(i, 81);
    }
}
