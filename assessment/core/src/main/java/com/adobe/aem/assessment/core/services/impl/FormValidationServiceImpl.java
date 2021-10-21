package com.adobe.aem.assessment.core.services.impl;

import com.adobe.aem.assessment.core.services.FormValidationService;

import org.osgi.service.component.annotations.*;

@Component(service = FormValidationService.class, immediate = true)
public class FormValidationServiceImpl implements FormValidationService{

    @Override
    public boolean isValid(String s1, String s2) {
        return s1.equals(s2);
    }
    
}