package co.develhope.Swagger02_DIGREGOLI.entities;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArithmeticOperation {

    @ApiModelProperty(value = "The name of arithmetic operation", example = "Division")
    private String name;
    @ApiModelProperty(value = "The min number of operands", example = "Two operands")
    private int minNumberOfOperands;
    @ApiModelProperty(value = "Description of arithmetic operation", example = "Describe about operation")
    private String description;
    @ApiModelProperty(value = "Properties of arithmetic operation")
    private String[] properties;
}
