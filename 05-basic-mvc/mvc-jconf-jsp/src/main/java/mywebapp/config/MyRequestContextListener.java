package mywebapp.config;

import org.springframework.context.annotation.Configuration;
import javax.servlet.annotation.WebListener;
import org.springframework.web.context.request.RequestContextListener;

@Configuration
@WebListener
public class MyRequestContextListener extends RequestContextListener {
}
