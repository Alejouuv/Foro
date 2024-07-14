package com.foro_hub.dto.topic;

import com.foro_hub.models.Topic;

import java.time.LocalDateTime;

public record TopicData(
        Long id,
        Long usuario,
        String curso,
        String titulo,
        String mensaje,
        LocalDateTime fecha
)
{

        public TopicData(Topic topic)
        {
              this(
                      topic.getId(),
                      topic.getUsuario().getId(),
                      topic.getCurso(),
                      topic.getTitulo(),
                      topic.getMensaje(),
                      topic.getFechaCreacion()
              );
        }
}
