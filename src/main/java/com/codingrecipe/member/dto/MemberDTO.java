package com.codingrecipe.member.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberDTO {
    private Long id; //
    private String memberName;
    private String memberEmail;
    private String memberPassword;
    private String memberCheckPassword;
}
