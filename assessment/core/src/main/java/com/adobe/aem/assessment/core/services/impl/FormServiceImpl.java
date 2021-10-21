package com.adobe.aem.assessment.core.models;


import java.util.List;


import org.apache.sling.api.request.RequestParameter;
import org.osgi.service.component.annotations.Component;


@Component(service = FormService.class)
public class FormServiceImpl implements FormService {


  @Override
    public boolean validate(List<RequestParameter> list) {


        RequestParameter fnameParam =  list.get(0);
        RequestParameter lnameParam =  list.get(1);
        String fname = fnameParam.getString();
        String lname = lnameParam.getString();
        if(fname.equals(lname))
            return true;
        return false;
    }
}