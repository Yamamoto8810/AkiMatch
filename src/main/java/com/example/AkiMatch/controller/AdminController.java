package com.example.AkiMatch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {

    // 管理者用：スケジュール作成画面
    @GetMapping("/admin/schedule/create")
    public String showCreateForm() {
        return "admin/schedule_create";
    }

    // フォーム送信（今は画面遷移のみ）
    @PostMapping("/admin/schedule/create")
    public String createSchedule() {
        // 次回：ここでDB保存
        return "redirect:/schedule";
    }
}
