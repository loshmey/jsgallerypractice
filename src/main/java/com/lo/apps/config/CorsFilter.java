package com.lo.apps.config;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Cors config.
 */
@Component
public class CorsFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // not in use
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        setResponseHeader(servletResponse);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        // not in use
    }

    /**
     * Sets response header.
     *
     * @param res servlet response
     */
    void setResponseHeader(ServletResponse res) {
        HttpServletResponse response = (HttpServletResponse) res;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type");
    }
}
