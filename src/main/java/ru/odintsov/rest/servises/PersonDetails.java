package ru.odintsov.rest.servises;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import ru.odintsov.rest.dto.PersonDTO;

import java.util.Collection;
import java.util.Collections;

public class PersonDetails implements UserDetails {
    private final PersonDTO person;

    public PersonDetails(PersonDTO person) {
        this.person = person;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // SHOW_ACCOUNT, WITHDRAW_MONEY, SEND_MONEY
        // ROLE_ADMIN, ROLE_USER - это роли
        return Collections.singletonList(new SimpleGrantedAuthority(person.getRole()));
    }

    @Override
    public String getPassword() {
        return this.person.getPassword();
    }

    @Override
    public String getUsername() {
        return this.person.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    // Нужно, чтобы получать данные аутентифицированного пользователя
    public PersonDTO getPerson() {
        return this.person;
    }
}

