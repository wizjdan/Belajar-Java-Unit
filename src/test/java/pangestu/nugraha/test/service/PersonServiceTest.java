package pangestu.nugraha.test.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import pangestu.nugraha.test.data.Person;
import pangestu.nugraha.test.repository.PersonRepository;

@Extensions({@ExtendWith(MockitoExtension.class)})
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    private PersonService personService;

    @BeforeEach
    void setUp() {
        personService = new PersonService(personRepository);
    }

    @Test
    void testNotFound() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            personService.get("Tidak di temukan");
        });
    }

    @Test
    void testGetPersonSuccess() {
        Mockito.when(personRepository.selectById("Nugi"))
                .thenReturn(new Person("Nugi", "Nugi"));

        var person = personService.get("Nugi");

        Assertions.assertNotNull(person);
        Assertions.assertEquals("Nugi", person.getId());
        Assertions.assertEquals("Nugi", person.getNama());
    }

    @Test
    void testRegisterSuccess() {
        var person = personService.register("Nugi");
        Assertions.assertNotNull(person);
        Assertions.assertEquals("Eko", person.getNama());
        Assertions.assertNotNull(person.getId());

        //HARUS VERIFIKASI!!
        Mockito.verify(personRepository, Mockito.times(1))
                .insert( new Person(person.getId(), person.getNama()));
    }
}
