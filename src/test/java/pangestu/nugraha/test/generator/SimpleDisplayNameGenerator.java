package pangestu.nugraha.test.generator;

//Materi Mengubah nama Test menggunakan @DisplayNameGenerator

import org.junit.jupiter.api.DisplayNameGenerator;

import java.lang.reflect.Method;

//Tambahkan implements DisplayNameGenerato pada Classnya. Kemudian Override method nya
public class SimpleDisplayNameGenerator implements DisplayNameGenerator {
    @Override
    public String generateDisplayNameForClass(Class<?> aClass) {
        return "Test " + aClass.getSimpleName();
    }

    @Override
    public String generateDisplayNameForMethod(Class<?> aClass, Method method) {
        return "Test " + aClass.getSimpleName() + "." + method.getName();
    }

    //Ini akan dibahas pada Materi Nested Unit test
    @Override
    public String generateDisplayNameForNestedClass(Class<?> aClass) {
        return null;
    }
}
