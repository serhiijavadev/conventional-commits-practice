package com.example.conventionalcommitspractice.time;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.matchesPattern;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(TimeController.class)
class TimeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private TimeService timeService;

    @Test
    void getCurrentTime_returns200WithNonEmptyCurrentTime() throws Exception {
        when(timeService.getCurrentTime()).thenReturn("2026-06-28T21:00:00+08:00");

        mockMvc.perform(get("/api/time"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.currentTime").exists())
                .andExpect(jsonPath("$.currentTime").isNotEmpty());
    }

    @Test
    void getCurrentTime_returnsTimestampWithTimezoneOffset() throws Exception {
        when(timeService.getCurrentTime()).thenReturn("2026-06-28T21:00:00+08:00");

        mockMvc.perform(get("/api/time"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.currentTime", matchesPattern(".*[+-]\\d{2}:\\d{2}$")));
    }
}
