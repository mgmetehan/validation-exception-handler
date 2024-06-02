package com.mgmetehan.validationexceptionhandler.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserRequestDTO {

    @NotNull
    @Size(min = 3, max = 10, message = "Name must be between 3 and 10 characters")
    private String name;

    @NotNull
    @Size(min = 3, max = 10, message = "Surname must be between 3 and 10 characters")
    private String surname;

    @Max(value = 999, message = "User number must be less than or equal to 999")
    @Positive(message = "User number must be positive")
    private int userNumber;

    @NotBlank(message = "Company name cannot be blank")
    private String companyName;

    @Email(message = "Email must be valid")
    private String email;

    @Min(value = 18, message = "Age must be greater than or equal to 18")
    private int age;

    @Pattern(regexp = "[0-9\\s]{12}", message = "Phone number must be 12 digits")
    private String phoneNumber;
}
