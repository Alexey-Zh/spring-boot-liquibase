package com.meetup.domain;

import java.time.ZonedDateTime;

/**
 * Created by bhavesh.shah on 4/9/2016.
 */
public class Event {

    private String deviceId;
    private ZonedDateTime logTimestamp;
    private String domain;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public ZonedDateTime getLogTimestamp() {
        return logTimestamp;
    }

    public void setLogTimestamp(ZonedDateTime logTimestamp) {
        this.logTimestamp = logTimestamp;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public String toString() {
        return "Event{" +
                "deviceId='" + deviceId + '\'' +
                ", logTimestamp=" + logTimestamp +
                ", domain='" + domain + '\'' +
                '}';
    }

    public String toLogString(){
        return ("Device=" + deviceId  + ", Timestamp=" + logTimestamp + " Domain=" + domain).replace("\"", "");
    }
}
