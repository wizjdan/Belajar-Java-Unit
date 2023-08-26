package pangestu.nugraha.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import pangestu.nugraha.test.resolver.RandomParameterResolver;

/*
Jika lebih dari satu gunakan @Extensions
JIka hanya satu gunakan @ExtendWith
 */
//Pada contoh disini menggunakan @Extension yang didalamnya ada @ExtendWih
@Extensions({
        @ExtendWith(RandomParameterResolver.class)
})
public class AbstractCalculatorTest {

    /*
    private Calculator calculator = new Calculator();

    Karena private tidak dapat digunakan oleh class turunannya, makan disini di ganti menjadi protected
     */
    protected Calculator calculator = new Calculator();

    @BeforeEach
    void setUp() {
        System.out.println("Before Each");
    }
}
