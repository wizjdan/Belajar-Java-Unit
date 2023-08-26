package pangestu.nugraha.test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

//Materi Penggunaan Anotasi @Tag
/*
Jika hanya 1 gunakan @Tag
Jika lebih dari 1 gnakan @Tags
 */
@Tags({@Tag("integration-test")})
public class SampleIntegrationTest {

    @Test
    void test1() {
    }

    @Test
    void test2() {
    }
}
