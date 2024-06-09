package edu.lucasrech.product_catalog.domain;

import jakarta.persistence.*;

@Entity(name = "dimensions")
public class Dimension {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "dimension_id")
    private String id;

    @OneToOne(mappedBy = "dimensions")
    private Product product;

    @Column(nullable = false)
    private Double weight;
    @Column(nullable = false)
    private Double height;
    @Column(nullable = false)
    private Double width;
    @Column(nullable = false)
    private Double length;

}
