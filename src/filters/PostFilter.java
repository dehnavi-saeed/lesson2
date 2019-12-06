package filters;

import javax.servlet.*;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Map;

public class PostFilter implements    Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        servletRequest.getParameterMap().forEach((s, strings) -> {if(! (s.equalsIgnoreCase("title")|| s.equalsIgnoreCase("content"))
             {servletRequest.getParameterMap().remove(s);
             }
         });

    }

    @Override
    public void destroy() {

    }
}
