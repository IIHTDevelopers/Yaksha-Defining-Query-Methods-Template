package com.yaksha.assignment.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.yaksha.assignment.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	// Custom query method to find products by name

	// Custom query method to find products by price range
}
