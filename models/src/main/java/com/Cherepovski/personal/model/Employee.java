package com.Cherepovski.personal.model;

import lombok.*;
/**
 * JavaBeab or POJO
 */
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String name;
    private int age;
    private Title title;
    private List<Divishion> divishions;
}
