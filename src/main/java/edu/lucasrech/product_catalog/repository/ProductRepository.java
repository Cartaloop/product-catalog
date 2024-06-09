package edu.lucasrech.product_catalog.repository;

import edu.lucasrech.product_catalog.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {

}
