package com.sap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sap.dto.ProductDTO;
import com.sap.dto.ProductPriceListDTO;
import com.sap.entity.Products;


@Repository
public interface ProductsRepo  extends JpaRepository<Products, Integer>{
	
	
@Query("SELECT ps.prodName FROM Products ps WHERE ps.prodCode=:Prod_Code and ps.status='A'")
	String getProd_name(@Param("Prod_Code")String prodCode);

@Query("SELECT ps.bottleCapacity FROM Products ps WHERE ps.prodCode=:Prod_Code and ps.status='A'")
String getProdCapacity(@Param("Prod_Code")String prodCode);

@Query("SELECT ps.packType FROM Products ps WHERE ps.prodCode=:Prod_Code and ps.status='A'")
String getProdPackType(@Param("Prod_Code")String prodCode);


@Query("SELECT CASE WHEN COUNT(p) > 0 THEN TRUE ELSE FALSE END FROM Products p WHERE p.prodCode = :prod_code")
boolean checkPrudctcode(@Param("prod_code") String prodCode);



@Query("SELECT new com.sap.dto.ProductDTO(p.prodCode, p.prodName, p.upc, p.purpose) FROM Products p where p.prodCode='7260371'")
List<ProductDTO> findSpecificColumns();

@Query("SELECT new com.sap.dto.ProductPriceListDTO(p.prodCode, p.prodName, p.packType, p.upc, p.purpose,p.bottleCapacity, " +
        "pr.mrp, pr.mrpBatch) " +
        "FROM Products p JOIN ProductPriceListEntity pr ON p.prodCode = pr.prodCode " +
        "WHERE p.prodCode = '7211251' AND p.status = 'A' and pr.status='A'")
 List<ProductPriceListDTO> findProductPriceDetails();


@Query("SELECT ps.upc FROM Products ps WHERE ps.prodCode=:Prod_Code and ps.status='A'")
String getUpc(@Param("Prod_Code")String prodCode);
}
