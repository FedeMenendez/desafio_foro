package com.alura.desafio.foro.domain.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fecha;
    private Boolean status;
    private Curso curso;
    private Long autor;

    public Topico(DatosRegistroTopico datosRegistroTopico){
        this.status=true;
        this.autor=datosRegistroTopico.autor();
        this.mensaje=datosRegistroTopico.mensaje();
        this.curso= datosRegistroTopico.curso();
        this.titulo= datosRegistroTopico.titulo();
        this.fecha= LocalDateTime.now();
    }

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {
        if (datosActualizarTopico.titulo() != null) {
            this.titulo = datosActualizarTopico.titulo();
        }
        if (datosActualizarTopico.mensaje() != null) {
            this.mensaje = datosActualizarTopico.mensaje();
        }
        if (datosActualizarTopico.status() != null) {
            this.status = Boolean.valueOf(datosActualizarTopico.status());
        }
    }

}
