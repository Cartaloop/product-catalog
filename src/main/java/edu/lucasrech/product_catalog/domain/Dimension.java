package edu.lucasrech.product_catalog.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "dimensions")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dimension {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "dimension_id")
    private String id;

    @Column(nullable = false)
    private Double weight;

    @Column(nullable = false)
    private Double height;

    @Column(nullable = false)
    private Double width;

    @Column(nullable = false)
    private Double length;

}
