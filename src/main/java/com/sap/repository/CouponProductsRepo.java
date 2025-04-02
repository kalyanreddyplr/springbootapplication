package com.sap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sap.entity.CouponProducts;


@Repository
public interface CouponProductsRepo extends JpaRepository<CouponProducts, Integer> {
	
	

}
