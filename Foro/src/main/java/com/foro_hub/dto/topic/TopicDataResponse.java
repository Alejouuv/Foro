package com.foro_hub.dto.topic;

import com.foro_hub.dto.UserData;

public record TopicDataResponse(
        Long id,
        UserData user,
        String curso,
        String titulo,
        String mensaje
) {
}
