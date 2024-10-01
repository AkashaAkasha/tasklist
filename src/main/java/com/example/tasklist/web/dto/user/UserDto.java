package com.example.tasklist.web.dto.user;

import com.example.tasklist.domain.task.Task;
import com.example.tasklist.domain.user.Role;
import com.example.tasklist.web.dto.validation.OnCreate;
import com.example.tasklist.web.dto.validation.OnUpdate;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.List;
import java.util.Set;

@Data
public class UserDto {

    @NotNull(message = "ID must be not null", groups = OnUpdate.class)
    private Long id;
    @NotNull(message = "Name must be not null", groups = {OnUpdate.class, OnCreate.class})
    @Length(max = 255, message = "Name must be smaller then 255 symbols", groups = {OnUpdate.class, OnCreate.class})
    private String name;
    @NotNull(message = "Username must be not null", groups = {OnUpdate.class, OnCreate.class})
    @Length(max = 255, message = "Username must be smaller then 255 symbols", groups = {OnUpdate.class, OnCreate.class})
    private String username;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message = "password must be not null", groups = {OnUpdate.class, OnCreate.class})
    private String password;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message = "passwordConfirmation must be not null", groups = OnCreate.class)
    private String passwordConfirmation;

}
