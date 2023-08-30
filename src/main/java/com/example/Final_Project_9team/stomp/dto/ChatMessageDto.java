package com.example.Final_Project_9team.stomp.dto;

import com.example.Final_Project_9team.entity.User;
import com.example.Final_Project_9team.stomp.jpa.ChatMessage;
import com.example.Final_Project_9team.stomp.jpa.ChatRoom;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessageDto {
    private Long roomId;
    private String sender;
    private String message;
    private String time;



    public static ChatMessageDto fromEntity(ChatMessage messageEntity) {
        return new ChatMessageDto(
                messageEntity.getChatRoom().getId(),
                messageEntity.getUser().getNickname(), //sender->유저 닉네임으로 변경
                messageEntity.getMessage(),
                messageEntity.getTime()
        );
    }

    public ChatMessage newEntity(ChatRoom chatRoom, User user) {
        ChatMessage messageEntity = ChatMessage.builder()
                .chatRoom(chatRoom)
                .user(user)
                .message(message)
                .time(time)
                .build();

        return messageEntity;
    }
}
