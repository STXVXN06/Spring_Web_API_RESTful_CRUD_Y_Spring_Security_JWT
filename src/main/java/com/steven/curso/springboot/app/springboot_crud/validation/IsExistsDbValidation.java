package com.steven.curso.springboot.app.springboot_crud.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.steven.curso.springboot.app.springboot_crud.services.IProductService;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

@Component
public class IsExistsDbValidation implements ConstraintValidator<IsExistsDb, String> {

    @Autowired
    private IProductService productService;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (productService == null) {
            return true;
        }
        return !productService.existsBySku(value);
    }

}
