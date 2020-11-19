package com.degfy.fusionner.dal.repository;

import com.degfy.fusionner.dal.entity.TestPoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TestPointRepository extends JpaRepository<TestPoint, Integer>, JpaSpecificationExecutor<TestPoint> {

}