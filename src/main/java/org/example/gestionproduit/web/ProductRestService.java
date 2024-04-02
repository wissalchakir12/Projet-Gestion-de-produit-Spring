package org.example.gestionproduit.web;

import org.example.gestionproduit.entities.Product;
import org.example.gestionproduit.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
public class ProductRestService
{
    @Autowired
    private ProductRepository productRepository;

    // on aura la liste de tous les produits en format JSON car on a utiliser un RestController!
    @GetMapping("/products")
    public List<Product> products()
    {
        return productRepository.findAll();
    }
    //avoir un produit avec son id
    @GetMapping("/products/{id}")
    public Product findProduct(@PathVariable Long id) {
        return productRepository.findById(id).orElse(null);
    }
}
