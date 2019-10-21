package com.gzy.im.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = {"name"})
})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 191)
    private String name;

    @JsonIgnore
    private String password;

    private String bio;

}
