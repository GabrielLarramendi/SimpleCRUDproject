package com.larramendiCrudProject.springboot.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;

    //Primeiro nome, ultimo nome  e email nao podem ser nulos ou vazios. Email tambem deve ter um formato valido.
    @NotEmpty(message = "O campo 'First Name' nao pode estar vazio!")
    private String firstName;
    @NotEmpty(message = "O campo 'Last Name' nao pode estar vazio!")
    private String lastName;
    @NotEmpty(message = "O campo 'E-mail' nao pode estar vazio!")
    @Email(message = "Formato de e-mail invalido!")
    private String email;
}
