package jp.ac.uryukyu.ie.e215711;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DevolutionTest{
    @Test 
    void devolutionTest() {
        Devolution Devolution = new Devolution();
        //全て同じ構造のメソッドが文字ごとに設定されているので、一つだけ確認する
        assertEquals(Devolution.devolution("と"), "歩");
    }
}