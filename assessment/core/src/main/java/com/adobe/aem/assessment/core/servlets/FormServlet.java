package com.adobe.aem.assessment.core.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import com.adobe.aem.assessment.core.models.FormService;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.request.RequestParameter;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(service = Servlet.class, property = { "sling.servlet.methods=" + "HttpConstants.METHOD_GET",
        "sling.servlet.methods=" + "HttpConstants.METHOD_POST", "sling.servlet.paths=" + "/bin/services/helloworld",
        "sling.servlet.selectors=" + "helloworld", "sling.servlet.extension=" + "json" })
public class FormServlet extends SlingAllMethodsServlet {

    @Reference
    FormService formValidation;

    @Override
    protected void doGet(final SlingHttpServletRequest req, final SlingHttpServletResponse resp) throws IOException {
        resp.getWriter().write("Hello World!!!!!");
    }

    @Override
    protected void doPost(SlingHttpServletRequest req, SlingHttpServletResponse resp)
            throws ServletException, IOException {

        List<RequestParameter> requestParameterList = req.getRequestParameterList();

        if (formValidation.validate(requestParameterList))
            resp.getWriter().write("First name is same as last name");
        else
            resp.getWriter().write("sucessfully submitted");
    }

}