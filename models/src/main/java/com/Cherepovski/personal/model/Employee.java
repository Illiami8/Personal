package com.Cherepovski.personal.model;

import lombok.*;
/**
 * JavaBean or POJO
 */
import java.util.List;
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends AbstractEntity {

    private String name;
    private int age;
    private Title title;
    private List<Divishion> divishions;
    private int salary;

    public Employee(Long id, String name, int age, int salary) {
        super(id);
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
