package com.foro_hub.dto.topic;

import com.foro_hub.models.Topic;

import java.time.LocalDateTime;

public record TopicListData(
        Long id,
        String curso,
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        Boolean status
)
{
    public TopicListData(Topic topic)
    {
        this(
                topic.getId(),
                topic.getCurso(),
                topic.getTitulo(),
                topic.getMensaje(),
                topic.getFechaCreacion(),
                topic.getStatus()
        );
    }
}
