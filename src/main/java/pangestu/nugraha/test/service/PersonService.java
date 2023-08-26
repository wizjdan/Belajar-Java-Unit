package pangestu.nugraha.test.service;

import pangestu.nugraha.test.data.Person;
import pangestu.nugraha.test.repository.PersonRepository;

import java.util.UUID;

public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person get(String id){
        Person person = personRepository.selectById(id);
        if (person != null){
            return person;
        } else {
            throw new IllegalArgumentException("Person tidak di temukan");
        }
    }

    public Person register(String nama){
        var person = new Person(UUID.randomUUID().toString(), nama);
        personRepository.insert(person);
        return person;
    }
}
