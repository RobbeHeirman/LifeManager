package com.example.lifemanager.meetingpoll;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
public class PollDate {

    @Id
    @GeneratedValue
    private int Id;

    @Getter
    @Setter
    private ZonedDateTime startDateTime;

    @Getter
    @Setter
    private ZonedDateTime endDateTime;

    @ManyToOne
    private PollHeader pollHeader;



}
