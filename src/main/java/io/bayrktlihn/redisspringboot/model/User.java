package io.bayrktlihn.redisspringboot.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class User implements Serializable {
    private String name;
    private String city;
}
