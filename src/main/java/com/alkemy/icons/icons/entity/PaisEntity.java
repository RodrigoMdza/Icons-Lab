package com.alkemy.icons.icons.entity;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="pais")
@Getter
@Setter
public class PaisEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String imagen;
    @Column(unique = true)
    private String denominacion;
    @Column(name="cantidad_habitantes")
    private Long cantidadHabitantes;
    private Long superficie;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "continente_id", insertable = false, updatable = false)
    private ContinenteEntity continente;
    @Column(name = "continente_id", nullable = false)
    private Long continenteId;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "icon_pais", 
               joinColumns = @JoinColumn(name = "pais_id"),
               inverseJoinColumns = @JoinColumn(name = "icon_id"))
    private List<IconEntity> icons = new ArrayList<>();

}
