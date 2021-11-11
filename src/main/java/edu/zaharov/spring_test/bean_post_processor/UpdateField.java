package edu.zaharov.spring_test.bean_post_processor;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value = RetentionPolicy.RUNTIME)
public @interface UpdateField {
}
