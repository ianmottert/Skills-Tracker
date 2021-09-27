package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String skillsTracker() {
        return "<html>" +
                "<h1> Skills Tracker </h1>" +
                "<h2> We have a few skills we would like to lean. Here is the list! </h2>" +
                "<body>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String form1() {
        return "<html>" +
                    "<body>" +
                        "<form method = 'post' action = '/form'>" +
                            "<label for = 'name'>Name:</label><br>" +
                            "<input type = 'text' name = 'name'><br>" +
                            "<label for = 'firstChoice'>My favorite language:</label><br>" +
                            "<select id = 'firstChoice' name = 'firstChoice'>" +
                                "<option value = 'Java'>Java</option>" +
                                "<option value = 'JavaScript'>JavaScript</option>" +
                                "<option value = 'Python'>Python</option>" +
                            "</select><br>" +
                            "<label for = 'secondChoice'>My second favorite language:</label><br>" +
                            "<select id = 'secondChoice' name = 'secondChoice'>" +
                                "<option value = 'Java'>Java</option>" +
                                "<option value = 'JavaScript'>JavaScript</option>" +
                                "<option value = 'Python'>Python</option>" +
                            "</select><br>" +
                            "<label for = 'thirdChoice'>My third favorite language:</label><br>" +
                            "<select id = 'thirdChoice' name = 'thirdChoice'>" +
                                "<option value = 'Java'>Java</option>" +
                                "<option value = 'JavaScript'>JavaScript</option>" +
                                "<option value = 'Python'>Python</option>" +
                            "</select><br>" +
                            "<input type = 'submit' value = 'Submit'>" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }

    @PostMapping(value = "form")
    @ResponseBody
    public String form2(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice) {
        return "<html>" +
                    "<h1>" + name + "</h1>" +
                    "<body>" +
                        "<ol>" +
                            "<li>" + firstChoice + "</li>" +
                            "<li>" + secondChoice + "</li>" +
                            "<li>" + thirdChoice + "</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
    }
}
