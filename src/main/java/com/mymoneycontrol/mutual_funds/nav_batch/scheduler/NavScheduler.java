package com.mymoneycontrol.mutual_funds.nav_batch.scheduler;

import java.net.URL;
import java.time.LocalDateTime;
import lombok.extern.slf4j.Slf4j;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class NavScheduler {

    @Scheduled(cron = "0 * * * * *")
    public void fetchMutualFundNavs() {
        log.info("Running mutual funds NAV batch job at {}", LocalDateTime.now());
        //https://www.amfiindia.com/spages/NAVAll.txt
    }
}
