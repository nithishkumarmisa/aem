package com.adobe.aem.assessment.core.models;


import org.apache.sling.api.request.RequestParameter;
import java.util.List;
public interface FormService {


    public boolean validate(List<RequestParameter> list);
}