package com.degfy.fusionner.service;

import org.eclipse.jgit.transport.CredentialsProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class GitService {
    @Value("${git.local-root-path}")
    private String gitRootPath;


    //1. 检查远程分支是否存在
    //2. 创建远程分支
    //3. 检查主分支是否已经超越特性分支
    //4. 将特性分支合并到主分支

    //5. 将远程仓库clone到本地
    public String gitClone(String gitUri, CredentialsProvider cp, String localPath) {
        File file = new File(gitRootPath, localPath);

        return file.getAbsolutePath();
    }

    public File getFileByLocalPath(String localPath) {
        File file = new File(gitRootPath, localPath);

        return file;
    }
}
