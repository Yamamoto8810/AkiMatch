package com.example.AkiMatch.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminScheduleController {

    // 画面表示
    @GetMapping("/admin/schedule/create")
    public String showCreateForm() {
        return "admin/schedule_create";
    }

    // フォーム送信（1つだけ！）
    @PostMapping("/admin/schedule/create")
    public String createSchedule(Model model) {
        // 次回：DB保存・token発行
        return "redirect:/admin/schedule/create";
    }
}

