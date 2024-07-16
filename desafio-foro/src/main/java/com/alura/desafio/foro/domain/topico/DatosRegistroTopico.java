package com.alura.desafio.foro.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
        @NotNull
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        Curso curso,
        @NotBlank
        Long autor) {
}
