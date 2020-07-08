package com.company.controller.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.jstl.core.Config;
import java.io.IOException;
import java.util.Locale;

/**
 * Created on 16.04.2020 13:45.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class LocalizationFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Locale.setDefault(Locale.ENGLISH);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {

        String locale = servletRequest.getParameter("locale");

        if (locale != null) {
            HttpServletRequest request = (HttpServletRequest) servletRequest;
            HttpServletResponse response = (HttpServletResponse) servletResponse;
            request.getSession().setAttribute("locale", locale);
            if (locale.equals("ua")) {
                Config.set(request.getSession(), Config.FMT_LOCALE, new Locale("ua", "UA"));
            }
            if (locale.equals("en")) {
                Config.set(request.getSession(), Config.FMT_LOCALE, new Locale("en", "US"));
            }
            response.sendRedirect(request.getHeader("referer"));
            return;
        }
        servletRequest.getServletContext().setAttribute("locale", "en");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
