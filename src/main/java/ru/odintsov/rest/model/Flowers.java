package ru.odintsov.rest.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Flowers {
    private int id;
    private String name;
    private int count;
    private String color;
}
