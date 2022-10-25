package com.example.lifemanager.meetingpoll;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
public class PollHeader {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int id;

    @Getter
    @Setter
    protected String description;

    @OneToMany(mappedBy="pollHeader")
    protected List<PollDate> pollDates;

}
