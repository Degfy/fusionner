package com.degfy.fusionner.dal.repository;

import com.degfy.fusionner.dal.entity.TestRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TestRecordRepository extends JpaRepository<TestRecord, Integer>, JpaSpecificationExecutor<TestRecord> {

}