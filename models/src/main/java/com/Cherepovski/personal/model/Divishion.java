package com.Cherepovski.personal.model;

import lombok.*;

import java.util.List;
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Divishion extends AbstractEntity {
    private String name;
    private List<Employee> personList;
}
