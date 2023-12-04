package ro.uvt.info.proiectsp.Controllers;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Component
public class RequestLoggingFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        System.out.println("Logging Request " + req.getMethod() + " : " + req.getRequestURI());

        chain.doFilter(request, response);

        System.out.println("Logging Response : " + res.getContentType());
    }

    public void destroy() {

    }
}
