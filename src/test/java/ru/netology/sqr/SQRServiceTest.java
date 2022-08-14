package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    void shouldEnumerateRootsFrom100to200() {
        SQRService service = new SQRService();
        int min = 100;
        int max = 200;
        int expected = 5;
        int actual = service.rootEnumerate(min, max);

        assertEquals(expected, actual);
    }
    @Test
    void shouldEnumerateRootsFrom500to1500() {
        SQRService service = new SQRService();
        int min = 500;
        int max = 1500;
        int expected = 29;
        int actual = service.rootEnumerate(min, max);

        assertEquals(expected, actual);
    }
}