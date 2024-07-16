package com.alura.desafio.foro.domain.topico;

public record DatosRespuestaTopico(Long id,String titulo,String mensaje,String fecha,Long autor, String curso,boolean status){
    public DatosRespuestaTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFecha().toString(), topico.getAutor(),
                topico.getCurso().toString(), topico.getStatus());
    }
}
