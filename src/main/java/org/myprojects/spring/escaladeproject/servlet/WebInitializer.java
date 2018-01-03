package org.myprojects.spring.escaladeproject.servlet;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends
AbstractAnnotationConfigDispatcherServletInitializer {

@Override
protected Class<?>[] getServletConfigClasses() {
return new Class[] { org.myprojects.spring.escaladeproject.config.WebConfig.class };
}

@Override
protected String[] getServletMappings() {
return new String[] { "/" };
}

@Override
protected Class<?>[] getRootConfigClasses() {
return null;
}

}
