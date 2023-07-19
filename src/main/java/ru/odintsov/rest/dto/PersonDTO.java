package ru.odintsov.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class PersonDTO {
    private String username ;
    private int yearOfBirth ;
    private String password ;
    private String role ;


}
