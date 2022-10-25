package com.example.lifemanager.meetingpoll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "meetingpoll")
public class PollController {

    @Autowired
    private PollHeaderRepository pollRepository;

    @PostMapping(path = "/addPoll")
    public @ResponseBody String addPoll (@RequestParam String description){
        var pollHeader = new PollHeader();
        pollHeader.setDescription(description);
        pollRepository.save(pollHeader);
        return "saved";
    }

    @GetMapping(path = "/list")
    public @ResponseBody Iterable<PollHeader> getAllPolls() {
        return pollRepository.findAll();
    }



}
