package com.sap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sap.entity.BpclSapPayloads;

@Repository
public interface BpclSapPayloadsRepo extends JpaRepository<BpclSapPayloads, Integer> {
}