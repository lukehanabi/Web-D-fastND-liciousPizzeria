package hello;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {
    
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/order").setViewName("order");
        registry.addViewController("/orderStatus").setViewName("orderStatus");
        registry.addViewController("/notify").setViewName("notify");
        registry.addViewController("/driver").setViewName("driver");
        registry.addViewController("/error").setViewName("error");
    }

}
