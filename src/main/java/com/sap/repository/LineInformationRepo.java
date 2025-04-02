package com.sap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sap.entity.LineInformation;

@Repository
public interface LineInformationRepo extends JpaRepository<LineInformation, Integer> {

}
