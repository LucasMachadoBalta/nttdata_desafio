package com.nttdatadesafio.nttdatadesafio.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EntryDTO {

    @NotBlank
    private String searchEntry;

    // public EntryModel searchEntry() { }

}
