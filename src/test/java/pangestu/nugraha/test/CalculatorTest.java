package pangestu.nugraha.test;

import org.junit.jupiter.api.Test;

//Mengimport Assertions yang static dari junit
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    //Contoh membuat method test dengan skenario Sukses
    //Tambahkan @Test untuk menandakan sebgai Unit Test

    @Test
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
    public void testPembagianSuccess(){
        var hasil = calculator.pembagian(10, 2);
        assertEquals(5, hasil);
    }

    //Contoh pembuatan jika pada pembagian gagal
    @Test
    public void testPembagianFailed(){
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.pembagian(10, 0);
        });
    }

}
