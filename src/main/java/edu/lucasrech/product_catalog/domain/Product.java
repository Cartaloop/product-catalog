package edu.lucasrech.product_catalog.domain;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "product_id")
    private String id;

    @Column(nullable = false, length = 60)
    private String name;

    @Column(nullable = false, length = 5000)
    private String description;

    @Column(nullable = false, unique = true)
    private Long code;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "dimension_id", referencedColumnName = "dimension_id")
    private Dimension dimension;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    private Date creationDate;

    @Column(nullable = false)
    private Date updateDate;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;
}
