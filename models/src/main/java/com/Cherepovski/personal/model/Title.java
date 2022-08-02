package com.Cherepovski.personal.model;

import lombok.*;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor

public class Title extends AbstractEntity {
    private String name;
}
