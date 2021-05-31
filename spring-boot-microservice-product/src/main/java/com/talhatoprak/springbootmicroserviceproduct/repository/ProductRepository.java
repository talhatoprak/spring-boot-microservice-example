package com.talhatoprak.springbootmicroserviceproduct.repository;

import com.talhatoprak.springbootmicroserviceproduct.Entity.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CassandraRepository<Product, String> {
}
