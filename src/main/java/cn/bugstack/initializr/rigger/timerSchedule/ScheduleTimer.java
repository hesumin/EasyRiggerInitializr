package cn.bugstack.initializr.rigger.timerSchedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTimer {

    private String str = "hello world";

    @Scheduled(cron = "0/30 * * * * ?")
    public void executeTask() {
        System.out.println(str);
    }
}
