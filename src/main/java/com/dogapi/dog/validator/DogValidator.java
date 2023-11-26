package com.dogapi.dog.validator;

import com.dogapi.dog.model.Dog;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class DogValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Dog.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "field.required", "Name must not be empty");
        Dog dog = (Dog) target;
        if (dog.getAge() <= 0) {
            errors.rejectValue("age", "field.required", "Age must be greater than 0");
        }
    }
}