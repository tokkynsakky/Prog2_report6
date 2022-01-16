package jp.ac.uryukyu.ie.e215711;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class EvolutionTest {
    @Test
    void evolutionTest(){
        Evolution Evolution = new Evolution();
        //全て同じ構造のメソッドが文字ごとに設定されているので、一つだけ確認する
        assertEquals(Evolution.evolution("歩"), "と");
    }
}