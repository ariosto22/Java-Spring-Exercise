package co.develhope.hybernateexercise.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "enrollments")
public class Enrollments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Students students;

    @ManyToOne(fetch = FetchType.LAZY)
    private Classes classes;
}
