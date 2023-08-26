package pangestu.nugraha.test;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;

//Materi Urutan Eksekusi Test
/*
Tambahkan @TestMethodOrder pada class Kemudian tambahkan MethodOrderer.
Pada contoh di bawah menggunakan MethodName. Kemudian diakhiri dengan .class
Jadi ketika di Running makan akan diurutkan sesuai dengan Nama Methodnya.
Jika .MethodName diganti menggunakan .Random, maka akan di eksekusi secara acak
Jika menggunakan .OrderAnnotation tambahkan terlebih dahulu @Order() di bawah @Test. Kemudian masukan urutan yang akan
dieksekusikan
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.MethodName.class)
public class OrderedTest {

    private int counter = 0;

    @Test
    void test3() {
        counter++;
        System.out.println(counter);
    }

    @Test
    void test2() {
        counter++;
        System.out.println(counter);
    }

    @Test
    void test1() {
        counter++;
        System.out.println(counter);
    }
}
