package com.learning.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController
{
    @RequestMapping("/show-form")
    public String showForm()
    {
        //It will look for /WEB-INF/view/hello-form.jsp by using config prefix and suffix
        return "hello-form";
    }

    /**
     * This method gets form field value from request parameter
     * and put it into model to pass it for view.
     *
     * @param request
     * @param model
     *
     * @return
     */
    @RequestMapping("process-form")
    public String processForm(HttpServletRequest request, Model model)
    {
        //Get form data from request parameter
        String theName = request.getParameter("studentName");
        theName = theName.toUpperCase();

        //Add attribute to model for view
        model.addAttribute("message", "Yo yo! " + theName);

        return "process-form";
    }

    /**
     * This method binds form field data to function parameters.
     * It uses annotation @RequestParam
     *
     * @param theName
     * @param model
     *
     * @return
     */
    @RequestMapping("/process-form2")
    public String processForm2(
            @RequestParam("studentName") String theName, //binding
            Model model
    ) {
        theName = theName.toUpperCase();
        model.addAttribute("message", "Yo yo! " + theName);

        return "process-form";
    }
}
