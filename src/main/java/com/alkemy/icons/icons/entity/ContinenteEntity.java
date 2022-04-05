package com.alkemy.icons.icons.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="continente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContinenteEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String imagen;
    @Column(unique = true)
    private String denominacion;

}
