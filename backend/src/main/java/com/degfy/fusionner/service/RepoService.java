package com.degfy.fusionner.service;

import com.degfy.fusionner.dal.entity.Repo;
import com.degfy.fusionner.dal.repository.RepoRepository;
import com.degfy.fusionner.domain.RepoBO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RepoService {
    private final RepoRepository repoRepository;

    @Autowired
    public RepoService(RepoRepository repoRepository) {
        this.repoRepository = repoRepository;
    }

    public RepoBO addRepo(RepoBO repoBO, Integer productId, Integer userId) {
        Repo repo = new Repo();
        BeanUtils.copyProperties(repoBO, repo);
        repo
                .setProductId(productId)
                .setCreatedBy(userId)
                .setUpdatedBy(userId);

        repoRepository.save(repo);
        repoBO.setId(repo.getId());
        return repoBO;
    }


}
