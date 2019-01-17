package pl.mrzeszotarski.auditlogs.configuration.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class ExampleUserDetailsService implements UserDetailsService {

    private PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if(username.equals("example")){
            return User.builder()
                    .passwordEncoder(encoder::encode)
                    .username("example")
                    .password("example")
                    .roles("read_scope")
                    .build();
        }
        throw new UsernameNotFoundException(username);
    }
}
