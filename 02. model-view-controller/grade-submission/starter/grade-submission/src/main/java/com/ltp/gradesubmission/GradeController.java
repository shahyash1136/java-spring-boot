package com.ltp.gradesubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GradeController {

    @GetMapping("/grades")
    public String getGrades(Model model) {
        Grade grade = new Grade("Harry", "Potions", "C-");
        Grade grade2 = new Grade("Hermione", "Potions", "C-");
        Grade grade3 = new Grade("Ron", "Potions", "C-");

        model.addAttribute("grade", grade2);

        return "grades";
    }
}
