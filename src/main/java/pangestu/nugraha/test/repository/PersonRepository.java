package pangestu.nugraha.test.repository;

import pangestu.nugraha.test.data.Person;

public interface PersonRepository {

    Person selectById(String id);

    void insert(Person person);

}
