package org.carte.web.springchatappwithwebsockets.chat;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

public enum MessageType {
    CHAT,
    JOIN,
    LEAVE
}
