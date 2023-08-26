package pangestu.nugraha.test;

import org.junit.jupiter.api.*;

//Materi Informasi Test
@DisplayName("Information Test")
public class InformationTest {
    
    //Contoh Unit Test

    @Test
    @Tags({
            @Tag("Satu"),
            @Tag("Dua")
    })
    @DisplayName("Ini test 1")
    //Untuk mendapatkan data informasi testnya masukkan TestInfo ke test1()
    void test1(TestInfo info) {
        System.out.println(info.getDisplayName()); //.getDisplayName untuk mendapatkan Display Namenya
        System.out.println(info.getTags()); //.getTags untuk mendapatkan tagsnya
        System.out.println(info.getTestClass().orElse(null)); //(Opsional)
        System.out.println(info.getTestMethod().orElse(null)); //(Opsional)
    }
}
