package com.istad.sb4mybatis.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Category {
    private Integer id;
    @NotBlank
    private String name;

}
