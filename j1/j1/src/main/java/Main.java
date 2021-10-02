import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.stud.person.Config;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        context.close();
        /*PersonMapper personMapper = new PersonMapperFromJsonImpl();
        List<Person> personList = personMapper.map();

        GuidPersonFilter guidPersonFilter = new GuidPersonFilterByGenderAndAge();
        List<String> guildList = guidPersonFilter.filter(personList);

        System.out.println(guildList);*/

    }

}
