package com.adobe.aem.assessment.core.servlets;

import com.adobe.aem.assessment.core.services.FormValidationService;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.osgi.service.component.annotations.*;

import java.io.IOException;
import javax.servlet.Servlet;

@Component(service = Servlet.class, property = { "sling.servlet.paths=" + "/bin/test/myform",
    "sling.servlet.methods=" + HttpConstants.METHOD_POST, "sling.servlet.selectors=" + "val",
    "sling.servlet.extension=" + "json" })

public class ValidateFormServlet extends SlingAllMethodsServlet {

 @Reference
 public FormValidationService fService;

 @Override
 protected void doGet(final SlingHttpServletRequest req, final SlingHttpServletResponse resp)
 throws IOException {
     resp.getWriter().write(fService.isValid(req.getRequestParameter("fname").getString(),
            req.getRequestParameter("lname").getString()) ? "First and Last name cannot be same"
                    : "Submission Sucessfull");

 }

}