package com.adobe.aem.assessment.core.servlets;
 
import java.io.IOException;
 
import javax.servlet.Servlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.osgi.service.component.annotations.Component;
 
@Component(service = Servlet.class, property = {
    "sling.servlet.paths=" + "/bin/new/test",
    "sling.servlet.selectors="+ "helloworld",
    "sling.servlet.extension="+ "json",
    })
public class HelloWorld extends SlingAllMethodsServlet{
    
    @Override
    protected void doGet(final SlingHttpServletRequest req, final SlingHttpServletResponse resp) throws IOException {
        resp.getWriter().write("Hellow World");
    }
}