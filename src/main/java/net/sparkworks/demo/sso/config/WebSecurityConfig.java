package net.sparkworks.demo.sso.config;

import org.springframework.boot.actuate.autoconfigure.security.servlet.EndpointRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@Order(-1)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring()
                .antMatchers("/favicon.ico")
                .antMatchers("/logout_success")
                .antMatchers("/img/**")
                .antMatchers("/css/**")
                .antMatchers("/font-awesome/**")
                .antMatchers("/webjars/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .requestMatcher(EndpointRequest.toAnyEndpoint())
                .authorizeRequests()
                .anyRequest().permitAll();
        http
                .authorizeRequests()
                .antMatchers("/**").authenticated()
                .and()
                .logout().logoutUrl("/logout").logoutSuccessUrl("/logout_success")
                .invalidateHttpSession(true).clearAuthentication(true)
                .and()
                .httpBasic().disable();

    }
}
