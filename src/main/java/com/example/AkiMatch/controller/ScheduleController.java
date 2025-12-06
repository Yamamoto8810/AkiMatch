package com.example.AkiMatch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScheduleController {

    @GetMapping("/schedule")
    public String schedule(Model model) {
        // 日・時間のサンプルデータを送る
        String[] days = {"月", "火", "水", "木", "金"};
        String[] times = {"09:00", "09:15", "09:30", "09:45", "10:00"};
        
        model.addAttribute("days", days);
        model.addAttribute("times", times);
        return "schedule"; // templates/schedule.html を返す
    }
}
