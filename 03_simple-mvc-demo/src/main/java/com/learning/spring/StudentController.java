package com.learning.spring;

import com.learning.spring.models.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController
{
    /**
     * Will read value from config xml and properties file
     */
    @Value("#{countryOptions}")
    private Map<String, String> countryOptions;

    @RequestMapping("/show-form")
    public String showForm(Model theModel)
    {
        Student theStudent = new Student();
        theModel.addAttribute("student", theStudent);

        // add the country options to the model
        theModel.addAttribute("theCountryOptions", countryOptions);

        return "student/student-form";
    }

    /**
     * This method binds all form data to parameter model
     * Here all form fields binding to Student model will be done
     *
     * @param theStudent
     * @return
     */
    @RequestMapping("/process-form")
    public String processForm(@ModelAttribute("student") Student theStudent)
    {
        return "student/student-confirmation";
    }
}
