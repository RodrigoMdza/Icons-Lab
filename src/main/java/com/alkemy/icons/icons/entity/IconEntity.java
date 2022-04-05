package com.alkemy.icons.icons.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="icon")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IconEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String imagen;
    @Column(unique = true)
    private String denominacion;
    @Column(name = "fecha_creacion")
    @DateTimeFormat(pattern = "yyyy,MM,dd")
    private LocalDate fechaCreacion;
    private Long altura;
    private String historia;
    @ManyToMany(mappedBy = "icons", cascade = CascadeType.ALL)
    private List<PaisEntity> paises = new ArrayList<>();
}
