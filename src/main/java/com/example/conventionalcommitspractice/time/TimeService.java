package com.example.conventionalcommitspractice.time;

import java.time.OffsetDateTime;

import org.springframework.stereotype.Service;

@Service
public class TimeService {

    public String getCurrentTime() {
        return OffsetDateTime.now().toString();
    }
}
