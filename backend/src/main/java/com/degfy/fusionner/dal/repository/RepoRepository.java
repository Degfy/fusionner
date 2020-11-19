package com.degfy.fusionner.dal.repository;

import com.degfy.fusionner.dal.entity.Repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RepoRepository extends JpaRepository<Repo, Integer>, JpaSpecificationExecutor<Repo> {

}