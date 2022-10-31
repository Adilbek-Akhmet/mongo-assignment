package adilbek.mongoassignment.task1andtask2.mapper;

import adilbek.mongoassignment.task1andtask2.model.Log;
import adilbek.mongoassignment.task1andtask2.model.LogDto;

public class LogMapper {

    private LogMapper() {
    }

    public static LogDto toDto(Log log) {
        return LogDto.builder()
                .ip(log.getIp())
                .url(log.getUrl())
                .timeStamp(log.getTimeStamp().toString())
                .timeSpent(log.getTimeSpent())
                .build();
    }
}
