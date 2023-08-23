package pangestu.nugraha.test;

//Materi JUnit
public class Calculator {

    public Integer pembagian(Integer pertama, Integer kedua){
        if (kedua == 0){
            throw new IllegalArgumentException("Tidak bisa dilakukan pembagian 0");
        } else {
            return pertama / kedua;
        }
    }

    public Integer add(Integer pertama, Integer kedua){
        return pertama + kedua;
    }
}
