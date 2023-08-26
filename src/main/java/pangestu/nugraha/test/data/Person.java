package pangestu.nugraha.test.data;

import java.util.Objects;

//Materi Mocking di Test
public class Person {

    private String id;

    private String nama;

    public Person() {
    }

    public Person(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!Objects.equals(id, person.id)) return false;
        return Objects.equals(nama, person.nama);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nama != null ? nama.hashCode() : 0);
        return result;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", nama='" + nama + '\'' +
                '}';
    }
}
