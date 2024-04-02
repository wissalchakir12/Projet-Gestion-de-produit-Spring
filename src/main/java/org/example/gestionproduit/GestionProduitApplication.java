package org.example.gestionproduit;

import org.example.gestionproduit.entities.Product;
import org.example.gestionproduit.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class GestionProduitApplication  implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;
    public static void main(String[] args)
    {
        SpringApplication.run(GestionProduitApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {
        //Pour eviter que a chaque fois on a des produits.
        //productRepository.save(new Product(null,"pc1",4300,3));
        //productRepository.save(new Product(null,"pc2",4300,3));
        //productRepository.save(new Product(null,"pc3",4300,3));
        List <Product> products=productRepository.findAll();
        products.forEach
                (p->{
            System.out.println(p.toString());

                });







    }
}
