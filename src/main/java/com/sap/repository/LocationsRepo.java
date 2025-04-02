package com.sap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sap.entity.Locations;


@Repository
public interface LocationsRepo extends JpaRepository<Locations, Long> {

//	@Query("select l.locName from Locations l where l.locCode=:loc_code")
//	String findLocationName(@Param("loc_code") String supLocCode);

	@Query("select l.locName from Locations l where l.locCode=:loc_code")
	String findDestLocationName(@Param("loc_code") String recLocCode);
	
	
	
	@Query(value="select bl.loc_name from bpcl_location bl where loc_code =:loc_code",nativeQuery = true)
	String findLocationName(@Param("loc_code") String supLocCode);
	
	
	

}
