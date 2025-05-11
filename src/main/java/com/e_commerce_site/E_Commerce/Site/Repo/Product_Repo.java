package com.e_commerce_site.E_Commerce.Site.Repo;

import com.e_commerce_site.E_Commerce.Site.Entity.Product_Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Product_Repo extends JpaRepository<Product_Entity, Long> {
    // This interface will automatically inherit CRUD operations from JpaRepository
    // No additional code is needed here unless you want to define custom queries

}
