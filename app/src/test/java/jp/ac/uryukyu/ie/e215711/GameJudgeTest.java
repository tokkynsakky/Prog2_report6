package jp.ac.uryukyu.ie.e215711;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class GameJudgeTest {
    @Test
    void gameJudgeTest(){
        GameJudge GameJudge = new GameJudge();
        assertEquals(GameJudge.judge("王"), false);
        assertEquals(GameJudge.judge("玉"), false);
    }
}
