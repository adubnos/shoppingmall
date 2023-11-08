package com.example.shoppingmall.Repository;

import com.example.shoppingmall.Entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//10. 데이터베이스 처리를 위한 SQL
public interface ProductRepository extends
        JpaRepository<ProductEntity, Integer> {
}
