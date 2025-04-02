package com.sap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sap.entity.DeliveryNoteDetailEntity;

@Repository
public interface DeliveryNoteDetailRepo extends JpaRepository<DeliveryNoteDetailEntity, Integer> {

}
