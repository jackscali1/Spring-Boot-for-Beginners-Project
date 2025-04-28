package com.amigoscode;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SoftwareEngineerViewController {

    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerViewController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping("/software-engineers")
    public String viewSoftwareEngineers(Model model) {
        List<SoftwareEngineer> engineers = softwareEngineerService.getAllSoftwareEngineers();
        model.addAttribute("engineers", engineers);
        return "software-engineers"; // Points to templates/software-engineers.html
    }
}
