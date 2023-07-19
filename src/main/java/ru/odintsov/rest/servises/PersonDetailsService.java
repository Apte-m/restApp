package ru.odintsov.rest.servises;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.odintsov.rest.dto.PersonDTO;

import java.util.Optional;

@Service
public class PersonDetailsService implements UserDetailsService {





    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<PersonDTO> person = Optional.of(new PersonDTO("user", 1911, "user","ADMIN"));

        if (person.isEmpty())
            throw new UsernameNotFoundException("User not found");

        return new PersonDetails(person.get());
    }
}
