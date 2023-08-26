package pangestu.nugraha.test;

import jdk.jfr.Enabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.util.Properties;

//Materi Test Berdasarkan Kondisi
public class ConditionTest {

    //Ini adalah daftar yang ada dalam System Properties
    @Test
    void testSystemProperties() {
        Properties properties= new Properties();
        properties.forEach(((key, value) -> System.out.println(key + ": " + value)));
    }

    //Contoh 1 Unit Test
    /*
    Jadi Test ini hanya boleh Running di System Operasi Windows
     */
    @Test
    @EnabledOnOs({OS.WINDOWS})
    void testRunOnlyOnWindows() {
    }
    
    //Contoh 2 Unit Test
    /*
    Jadi Test ini tidak boleh Running di System Operasi Windows
     */
    @Test
    @DisabledOnOs({OS.WINDOWS})
    void testRunDisabledOnWindows() {
    }

    //Contoh 3 Unit Test
    /*
    Jadi Test ini hanya bisa dilakukan pada JRE 20
     */
    @Test
    @EnabledOnJre({JRE.JAVA_20})
    void testEnabledOnJava20() {
    }

    //Contoh 4 Unit Test
    /*
    Jadi Test ini tidak bisa dilakukan pada JRE 20
     */
    @Test
    @DisabledOnJre({JRE.JAVA_20})
    void testDisabledOnJava20() {
    }
    
    //Contoh 5 Unit Test
    /*
    Jadi Test ini menggunakan range atau jarak penggunaan JRE yang di perbolehkan
     */
    @Test
    @EnabledForJreRange(min = JRE.JAVA_15, max = JRE.JAVA_20)
    void testEnabledOnJava15To20() {
    }

    //Contoh 6 Unit Test
    /*
    Jadi Test ini menggunakan range atau jarak penggunaan JRE yang tidak di perbolehkan
     */
    @Test
    @DisabledForJreRange(min = JRE.JAVA_15, max = JRE.JAVA_20)
    void testDisabledOnJava15To20() {
    }
    
    //Contoh 7 Unit Test
    /*
    Jadi Test ini akan berjalan pada System Properties yang ditentukan
     */
    @Test
    @EnabledIfSystemProperties({@EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")})
    void testEnabledOnJavaVendorOracle() {
    }

    //Contoh 8 Unit Test
    /*
    Jadi Test ini tidak akan berjalan pada System Properties yang ditentukan
     */
    @Test
    @DisabledIfSystemProperties({@DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")})
    void testDisabledOnJavaVendorOracle() {
    }
    
    //Contoh 9 Unit Test
    /*
    Jadi Test ini akan berjalan pada Environment yang sudah di tentukan
     */
    @Test
    @EnabledIfEnvironmentVariables({@EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")})
    void testEnabledOnProfileDev() {
    }

    //Contoh 10 Unit Test
    /*
    Jadi Test ini tidak akan berjalan pada Environment yang sudah di tentukan
     */
    @Test
    @DisabledIfEnvironmentVariables({@DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")})
    void testDisabledOnProfileDev() {
    }
}
