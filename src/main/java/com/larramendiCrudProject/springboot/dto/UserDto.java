package com.larramendiCrudProject.springboot.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(description = "UserDTO model information")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;

    //Primeiro nome, ultimo nome  e email nao podem ser nulos ou vazios. Email tambem deve ter um formato valido.
    @Schema(description = "User First Name")
    @NotEmpty(message = "O campo 'First Name' nao pode estar vazio!")
    private String firstName;

    @Schema(description = "User Last Name")
    @NotEmpty(message = "O campo 'Last Name' nao pode estar vazio!")
    private String lastName;

    @Schema(description = "User E-mail address")
    @NotEmpty(message = "O campo 'E-mail' nao pode estar vazio!")
    @Email(message = "Formato de e-mail invalido!")
    private String email;
}
