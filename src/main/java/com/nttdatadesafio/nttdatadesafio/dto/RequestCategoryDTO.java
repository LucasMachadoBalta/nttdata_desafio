package com.nttdatadesafio.nttdatadesafio.dto;

import com.nttdatadesafio.nttdatadesafio.model.CategoryModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RequestCategoryDTO {

    @NotBlank
    private Long  id;

    @NotBlank
    private String name;

    @NotBlank
    private String description;

    public CategoryModel toCategoryModel() {
        CategoryModel category = new CategoryModel();

        CategoryModel.setId(id);
        CategoryModel.setName(name);
        CategoryModel.setDescription(description);

        return category;
    }

    // public CategoryModel searchCategory() { }
}
