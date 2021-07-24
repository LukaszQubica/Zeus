package com.lucqubica.module.dashboard;

import com.lucqubica.module.dashboard.dto.Article;
import com.lucqubica.module.dashboard.dto.Menu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping ("/dashboard")
    public String getDashboard (Model model) {
        model.addAttribute("menu", getMenu());
        model.addAttribute("atricle", getArticle());
        return "dashboard.html";
    }
    private Menu getMenu() {
        return null;
    }
    private Article getArticle() {
        return null;
    }
}
