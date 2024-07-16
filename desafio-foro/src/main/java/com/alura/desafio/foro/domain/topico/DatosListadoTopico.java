package com.alura.desafio.foro.domain.topico;

public record DatosListadoTopico(Long id,String titulo, String mensaje,String fecha,Long autor,String curso) {
    public DatosListadoTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFecha().toString(), topico.getAutor(),topico.getCurso().toString());
    }
}
