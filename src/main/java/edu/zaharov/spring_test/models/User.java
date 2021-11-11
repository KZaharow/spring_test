package edu.zaharov.spring_test.models;

import edu.zaharov.spring_test.bean_post_processor.UpdateField;
import edu.zaharov.spring_test.enums.Skill;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User implements Quoter {

    @UpdateField
    private String firstName;

    @UpdateField
    private String lastName;

    private int age;

    private Skill skill;

    @Override
    public String sayQuote() {
        return "hello";
    }
}
