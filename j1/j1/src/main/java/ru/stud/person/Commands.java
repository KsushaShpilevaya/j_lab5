package ru.stud.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.stud.person.GuidPersonFilter;
import ru.stud.person.GuidPersonFilterByGenderAndAge;
import ru.stud.person.Person;
import ru.stud.person.mapper.PersonMapper;
import ru.stud.person.mapper.PersonMapperFromJsonImpl;

import javax.annotation.PostConstruct;
import java.util.List;
@Component
public class Commands {
    @Autowired
    private List<String> guidList;
    @PostConstruct
    private void test() {
        System.out.println("begin");
        System.out.println(guidList);
    }
}
