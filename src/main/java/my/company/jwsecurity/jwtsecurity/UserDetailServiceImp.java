package my.company.jwsecurity.jwtsecurity;

import my.company.jwsecurity.model.User;
import my.company.jwsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service("userDetailServiceImp")
public class UserDetailServiceImp implements UserDetailsService {

private final UserRepository userRepository;

@Autowired
public UserDetailServiceImp(UserRepository userRepository) {
    this.userRepository = userRepository;
}

@Override
public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    User user = userRepository.findByEmail(email).orElseThrow(
            () -> new UsernameNotFoundException("User doesn't exists"));
    return SecurityUser.fromUser(user);
}
}
