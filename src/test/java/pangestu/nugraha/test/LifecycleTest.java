package pangestu.nugraha.test;

import org.junit.jupiter.api.Test;

//Materi Urutan Eksekusi Test
public class LifecycleTest {

    private String temp;

    @Test
    void testA() {
        temp ="Nugi";
    }

    @Test
    void testB() {
        System.out.println(temp);
    }

    /*
    Lifecycle testA dan testB di atas adalah Independen antar method di Java Unit
     */
}
