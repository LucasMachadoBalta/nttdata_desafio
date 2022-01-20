package com.nttdatadesafio.nttdatadesafio.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class CategoryDTO {

    //@NotBlank -> mudar para CategoryEntity

    //@NotBlank
    private String name;
    //@NotBlank
    private String description;


}
