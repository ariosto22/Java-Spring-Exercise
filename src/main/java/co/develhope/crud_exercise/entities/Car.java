package co.develhope.crud_exercise.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer, handler"})
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @
    private long id;
    private String modelName;
    private String type;


}
