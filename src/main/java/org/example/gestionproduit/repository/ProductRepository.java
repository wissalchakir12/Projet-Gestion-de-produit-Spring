package org.example.gestionproduit.repository;

import org.example.gestionproduit.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long>
{
}
