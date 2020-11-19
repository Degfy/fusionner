package com.degfy.fusionner.dal.repository;

import com.degfy.fusionner.dal.entity.TestPointVersion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TestPointVersionRepository extends JpaRepository<TestPointVersion, Integer>, JpaSpecificationExecutor<TestPointVersion> {

}