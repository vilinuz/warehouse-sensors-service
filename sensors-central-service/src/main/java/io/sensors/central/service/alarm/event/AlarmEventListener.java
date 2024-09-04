package io.sensors.central.service.alarm.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AlarmEventListener {

    @EventListener
    public void handleAlarmEvent(AlarmEvent event) {
        log.warn("Alarm event triggered!!!: {}", event);
    }
}