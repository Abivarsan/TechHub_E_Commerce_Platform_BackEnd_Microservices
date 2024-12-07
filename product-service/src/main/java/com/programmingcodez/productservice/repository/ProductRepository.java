//package com.programmingcodez.productservice.repository;
//
//import com.programmingcodez.productservice.entity.Product;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface ProductRepository extends JpaRepository<Product, String> {
//    @Query("SELECT DISTINCT p.category FROM Product p")
//    List<String> findDistinctCategories();
//}

package com.programmingcodez.productservice.repository;

import com.programmingcodez.productservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> { // Using String for SKU code as primary key

    @Query("SELECT DISTINCT p.category FROM Product p")
    List<String> findDistinctCategories();

    Optional<Product> findBySkucode(String skucode);
}
