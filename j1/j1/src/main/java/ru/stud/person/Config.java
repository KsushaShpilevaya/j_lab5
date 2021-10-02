package ru.stud.person;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.stud.person.GuidPersonFilter;
import ru.stud.person.GuidPersonFilterByGenderAndAge;
import ru.stud.person.Person;
import ru.stud.person.mapper.PersonMapper;
import ru.stud.person.mapper.PersonMapperFromJsonImpl;

import java.util.List;

@Configuration
@ComponentScan("ru.stud.person")
public class Config {
    @Bean
    public PersonMapper getPersonMapper() {
        return new PersonMapperFromJsonImpl();
    }

    @Bean
    public List<Person> getPersonList() {
        return getPersonMapper().map();
    }

    @Bean
    public GuidPersonFilter getGuidPersonFilter() {
        return new GuidPersonFilterByGenderAndAge();
    }

    @Bean
    public List<String> getGuidList() {
        return getGuidPersonFilter().filter(getPersonList());
    }
}
