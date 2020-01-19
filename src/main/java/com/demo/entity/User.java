package com.demo.entity;

import lombok.Data;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name = "TB_USERS", schema="spring")
@Data
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "CPF_CNPJ")
    private String cpfCnpj;

    @Column(name = "NAME")
    private String name;
}
