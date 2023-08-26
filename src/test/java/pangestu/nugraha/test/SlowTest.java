package pangestu.nugraha.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.concurrent.TimeUnit;

//Materi TimeOut di Test
/*
Menggunakan Annotation @TimeOut untuk memastikan bahwa unit test tidak berjalan lebih dari waktu yang sudah ditentukan,
jika melebihi dari waktu yang sudah ditentukan secara otomatis unit test tersebut akan gagal
 */
@Execution(ExecutionMode.CONCURRENT)
public class SlowTest {

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    public void slow() throws InterruptedException {
        Thread.sleep(10_000);
    }

    //Materi Eksekusi Test Secara Pararel
    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    public void slow2() throws InterruptedException {
        Thread.sleep(10_000);
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    public void slow3() throws InterruptedException {
        Thread.sleep(10_000);
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    public void slow4() throws InterruptedException {
        Thread.sleep(10_000);
    }

}
