package edu.zaharov.spring_test.bean_post_processor;

import edu.zaharov.spring_test.models.User;
import javafx.scene.effect.Reflection;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.ReflectionUtils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class CustomBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.getAnnotation(UpdateField.class) != null){
                System.out.println("postProcessBeforeInitialization");
                field.setAccessible(true);
                ReflectionUtils.setField(field, bean, "Not define");
            }
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        return bean;
    }
}
