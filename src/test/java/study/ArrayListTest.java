package study;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

    @Test
    public void study() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");

        assertEquals(2, list.size()); // list 의 크기가 2인지 확인

        assertEquals("first", list.get(0)); // 첫 번째 값 first 인지 확인
        assertTrue(list.contains("first")); // "first" 값이 포함되어 있는지를 확인

        assertEquals("first", list.remove(0)); // 첫 번째 값을 삭제, 삭제된 값 확인
        assertFalse(list.contains("first")); // "first" 값이 포함되어 있지 않음을 확인
    }
}
