package com.ms.email.dto;


import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class EmailDto {

    @NotBlank
    private String ownerRef;
    @NotBlank
    private String emailFrom;
    @NotBlank
    @Email
    private String emaiTo;
    @NotBlank
    @Email
    private String subject;
    @NotBlank
    private String text;

}
