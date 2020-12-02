package com.degfy.fusionner.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AuthService {

    public void auth() {
        log.info("this is auth in AuthService");
    }
}
