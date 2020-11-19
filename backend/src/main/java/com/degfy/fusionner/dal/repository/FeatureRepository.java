package com.degfy.fusionner.dal.repository;

import com.degfy.fusionner.dal.entity.Feature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FeatureRepository extends JpaRepository<Feature, Integer>, JpaSpecificationExecutor<Feature> {

}