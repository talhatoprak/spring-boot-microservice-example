package com.talhatoprak.springbootmicroserviceproduct.Entity;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;
import java.util.UUID;

@Data
@Table(value = "products")
public class Product {
    @PrimaryKey
    private String id= UUID.randomUUID().toString();
    private String name;
    private Double price;
    private Date createdAt;
    private boolean isActive;
}
