package pangestu.nugraha.test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import pangestu.nugraha.test.resolver.RandomParameterResolver;

import java.util.List;
import java.util.Random;

public class RandomCalculatorTest extends AbstractCalculatorTest{

    @Test
    void testRandom(Random random) {
        var a = random.nextInt();
        var b = random.nextInt();

        var hasil = calculator.add(a, b);
        var ekspektasi = a + b;

        Assertions.assertEquals(ekspektasi, hasil);

    }
    /*
    Materi Perulangan Test.
    Menggunakan @RepeatedTest
     */
    @DisplayName("Test Random Calculator")
    @RepeatedTest(
            value = 10,
            name = "{displayName} ke {currentRepeatition} dari {totalRepeatitions}"
    )
    void testRandomBerulang(Random random) {
        var a = random.nextInt();
        var b = random.nextInt();

        var hasil = calculator.add(a, b);
        var ekspektasi = a + b;

        Assertions.assertEquals(ekspektasi, hasil);

    }
    /*
    Materi Perulangan Test.
    Menggunakan @RepeatedTest
     */
    @DisplayName("Test Random Calculator")
    @RepeatedTest(
            value = 10, name = "{displayName}")
    void testRandomBerulangInfo(TestInfo info, Random random, RepetitionInfo repetitionInfo) {
        System.out.println(info.getDisplayName() + " ke " + repetitionInfo.getCurrentRepetition() + " dari " + repetitionInfo.getTotalRepetitions());
        var a = random.nextInt();
        var b = random.nextInt();

        var hasil = calculator.add(a, b);
        var ekspektasi = a + b;

        Assertions.assertEquals(ekspektasi, hasil);
    }
    /*
    Materi Test dengan Parameter.
    Menggunakan Test Parameter menggunakan @ParameterizedTest menggunakan @ValueSource
     */
    @DisplayName("Test Calculator")
    @ParameterizedTest(name = "{displauName} dengan parameter {0}")
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9})
    void testWithParameter(int nilai){
        var ekspektasi = nilai + nilai;
        var hasil = calculator.add(nilai, nilai);

        Assertions.assertEquals(ekspektasi, hasil);
    }
    //Contoh static methode untuk parameter source
    public static List<Integer> parameterSource(){
        return List.of(1,2,3,4,5);
    }
    /*
    Materi Test dengan Parameter.
    Menggunakan Test Parameter menggunakan @ParameterizedTest menggunakan @MethodSource
     */
    @DisplayName("Test Calculator")
    @ParameterizedTest(name = "{displauName} dengan parameter {0}")
    @MethodSource({"parameterSource"})
    void testWithMethodSource(Integer nilai){
        var ekspektasi = nilai + nilai;
        var hasil = calculator.add(nilai, nilai);

        Assertions.assertEquals(ekspektasi, hasil);
    }

}
