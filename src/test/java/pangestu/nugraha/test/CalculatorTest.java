package pangestu.nugraha.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import pangestu.nugraha.test.generator.SimpleDisplayNameGenerator;

//Mengimport Assertions yang static dari junit
import static org.junit.jupiter.api.Assertions.*;

//Materi Mengubah Nama Test, menggunakan @DisplayName. Bisa di tambahkan dalam type dan method.

//Contoh pembuatan @DisplayName
//@DisplayName("Test untuk Calculator Class")

//Contoh Pembuatan @DisplayNameGeneration pada class
@DisplayNameGeneration(SimpleDisplayNameGenerator.class)

//Contoh Pembuatan @Generator
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    //Contoh membuat method test dengan skenario Sukses
    //Tambahkan @Test untuk menandakan sebgai Unit Test

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

}
