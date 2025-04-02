package com.sap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sap.entity.DeliveryNoteEntity;

@Repository
public interface DeliveryNoteRepo extends JpaRepository<DeliveryNoteEntity, Integer> {

    boolean existsByDnNo(String dnNo);
	
	

}
