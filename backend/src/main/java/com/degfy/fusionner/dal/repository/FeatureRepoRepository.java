package com.degfy.fusionner.dal.repository;

import com.degfy.fusionner.dal.entity.FeatureRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FeatureRepoRepository extends JpaRepository<FeatureRepo, Integer>, JpaSpecificationExecutor<FeatureRepo> {

}