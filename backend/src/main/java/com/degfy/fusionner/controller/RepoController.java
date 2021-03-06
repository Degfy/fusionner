package com.degfy.fusionner.controller;

import com.degfy.fusionner.domain.RepoBO;
import com.degfy.fusionner.service.RepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/repo")
public class RepoController {
    private final RepoService repoService;

    @Autowired
    public RepoController(RepoService repoService) {
        this.repoService = repoService;
    }

    @PostMapping()
    public RepoBO createRepo(@RequestBody RepoBO repoBO) {
        return repoService.addRepo(repoBO, 0, 0);
    }

    @GetMapping("{id}")
    public RepoBO getRepoById(
            @PathVariable("id") Integer id
    ) {
        return repoService.getRepoById(id);
    }
}
