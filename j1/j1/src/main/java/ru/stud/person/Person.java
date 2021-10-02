package ru.stud.person;

import lombok.Builder;
import lombok.Data;
import ru.stud.person.utils.UUUU;

import java.util.List;

@Data
public class Person extends UUUU {
    private String guid;
    private Boolean isActive;
    private String balance;
    private Integer age;
    private String eyeColor;
    private String name;
    private String gender;
    private String company;
    private String email;
    private String phone;
    private String address;
    private String registered;
    private List<String> tags;
    private String favoriteFruit;
}
