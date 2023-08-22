package com.example.Final_Project_9team.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserUpdateDto {
    @NotBlank
    @Size(max = 12, message = "닉네임은 한글자 이상 열두글자 이하로 작성해주세요.")
    private String nickname;

}
