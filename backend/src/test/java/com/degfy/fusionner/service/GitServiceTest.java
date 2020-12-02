package com.degfy.fusionner.service;

import com.degfy.fusionner.FusionnerApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FusionnerApplication.class)
@Slf4j
public class GitServiceTest {
    @Autowired
    private GitService gitService;

    @Test
    public void getFileByLocalPath() {
        File file = gitService.getFileByLocalPath("my/test/ok");
        try {
            boolean result = file.createNewFile();
            log.info("result:{}", result);
        } catch (IOException e) {
            e.printStackTrace();
        }

        log.info("file info:{}", file);
    }
}
