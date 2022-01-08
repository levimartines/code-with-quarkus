package dev.levimartines.models.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CategoryVO {

    @NotBlank(message = "Name may not be blank or null")
    @NotNull(message = "Name may not be blank or null")
    private String name;
}
