package ru.stud.person;

import java.util.List;

public interface GuidPersonFilter {
    List<String> filter(List<Person> people);
}
