package com.yorick.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by yorick on 2017/8/29.
 */
public class AppServletContextListener implements ServletContextListener {

    private final String CONTEXT_PATH_IN_SERVLET_CONTEXT = "context";

    /**
     * 项目启动时, 初始化项目的 contextPath 放入 ServletContext 中
     * @param servletContextEvent
     */
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        ServletContext servletContext = servletContextEvent.getServletContext();
        String appContextPath = servletContext.getContextPath();
        servletContext.setAttribute(CONTEXT_PATH_IN_SERVLET_CONTEXT, appContextPath);

        System.out.println(servletContext.getAttribute(CONTEXT_PATH_IN_SERVLET_CONTEXT));

    }

    /**
     * 项目终止时, 初始化项目的 contextPath 从 ServletContext 中移除
     * @param servletContextEvent
     */
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

        ServletContext servletContext = servletContextEvent.getServletContext();
        servletContext.removeAttribute(CONTEXT_PATH_IN_SERVLET_CONTEXT);

        System.out.println(servletContext.getAttribute(CONTEXT_PATH_IN_SERVLET_CONTEXT));

    }
}
