package app.vercel.gympartner.servicesimplement;

import app.vercel.gympartner.entities.User;
import app.vercel.gympartner.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.Authentication;

import java.util.Collections;

@Service
public class JwtUserDetailsService implements UserDetailsService {
    @Autowired
    private IUserRepository uR;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = uR.findByEmail(email);

        if(user == null) {
            throw new UsernameNotFoundException(String.format("User not exists", email));
        }

        GrantedAuthority role = new SimpleGrantedAuthority(user.getRole().getName());

        UserDetails uD = new org.springframework.security.core.userdetails.User(
                user.getEmail(),
                user.getPassword(),
                user.isStatus(),
                true,
                true,
                true,
                Collections.singletonList(role)
        );
        return uD;
    }
}
