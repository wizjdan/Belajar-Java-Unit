package pangestu.nugraha.test;

import org.junit.jupiter.api.*;
import org.opentest4j.TestAbortedException;
import pangestu.nugraha.test.generator.SimpleDisplayNameGenerator;

//Mengimport Assertions yang static dari junit
import static org.junit.jupiter.api.Assertions.*;

//Mengimport Assumptions
import static org.junit.jupiter.api.Assumptions.*;

//Materi Mengubah Nama Test, menggunakan @DisplayName. Bisa di tambahkan dalam type dan method.

//Contoh pembuatan @DisplayName
//@DisplayName("Test untuk Calculator Class")

//Contoh Pembuatan @DisplayNameGeneration pada class
@DisplayNameGeneration(SimpleDisplayNameGenerator.class)

//Contoh Pembuatan @Generator
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    //Materi Sebelum dan Setelah Test
    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before All");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("After All");
    }

    //Materi Sebelum dan Setelah Test
    @BeforeEach
    public void setUp(){
        System.out.println("Before Each");
    }

    @AfterEach
    public void tearDown(){
        System.out.println("AfterEach");
    }

    //Contoh membuat method test dengan skenario Sukses
    //Tambahkan @Test untuk menandakan sebagai Unit Test

    @Test
    @DisplayName("Jika skenario Success di method add(Integer pertama, Integer kedua)")
    public void testAddSuccess(){
        var hasil = calculator.add(14, 16);

        /*
        Pengecekan tanpa Assertions menggunakan if else
        if (hasil != 30){
            throw new RuntimeException("Pengetesan Gagal");
        }
        Pengetesan menggunakan if tidak di rekomendasikan. Lebih baik menggunakan Assertions
         */

        //Contoh penggunaan Assertions
        //Penjumlahan 14 + 16 hasilnya adalah 30. Jadi di bagian expected kita masukan 30.
        assertEquals(30, hasil);
    }

    @Test
    @DisplayName("Jika seknario Success di method pembagian(Integer pertama, Integer kedua)")
    public void testPembagianSuccess(){
        var hasil = calculator.pembagian(10, 2);
        assertEquals(5, hasil);
    }

    //Contoh pembuatan jika pada pembagian gagal
    @Test
    @DisplayName("Jika Skenario gagal di method pembagian")
    public void testPembagianFailed(){
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.pembagian(10, 0);
        });
    }

    //Contoh penggunaan @DisplayNameGenerator
    @Test
    public void testAddSuccess2() {
        var hasil = calculator.add(14, 16);
    }

    @Test
    public void testPembagianSuccess2() {
        var hasil = calculator.pembagian(10, 2);
        assertEquals(5, hasil);
    }

    @Test
    public void testPembagianFailed2(){
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.pembagian(10, 0);
        });
    }

    //Materi menonaktifkan unit Test dengan menggunakan @Disabled
    @Test
    @Disabled
    public void testComingSoon(){

    }

    //Materi Membatalkan Test menggunakan exception
    @Test
    public void testAborted(){
        //Contoh pengecekan
        var profile = System.getenv("PROFILE");
        if (!"DEV".equals(profile)){
            throw new TestAbortedException("Test Di batalkan karena bukan DEV");
        }
    }

    //Materi Membatalkan Test menggunakan Assumptions
    @Test
    public void testAssumption(){
        //Contoh pengecekan tidak perlu menggunakan if
        assumeTrue("DEV".equals(System.getenv("PROFILE")));
    }
}
