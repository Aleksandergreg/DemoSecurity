package org.poll;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PollController {
    private int javaVotes = 0;
    private int pythonVotes = 0;

    @PostMapping("/vote")
    public String vote(@RequestParam String language) {
        if (language.equalsIgnoreCase("java")) {
            javaVotes++;
        } else if (language.equalsIgnoreCase("python")) {
            pythonVotes++;
        }
        return "Vote recorded!";
    }

    @GetMapping("/results")
    public String getResults() {
        return "Java: " + javaVotes + " votes, Python: " + pythonVotes + " votes";
    }
}