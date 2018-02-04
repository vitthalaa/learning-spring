package com.learning.spring;

import com.learning.spring.models.Customer;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController
{
    /**
     * InitBinder can be used to process properties before binding to model.
     * Like validation, parsing to other objects, format strings/dates etc.
     *
     * @param dataBinder
     */
    @InitBinder
    public void initBinder(WebDataBinder dataBinder)
    {
        //Trim white spaces of string properties using spring provided property editor
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("/show-form")
    public String showForm(Model theModel)
    {
        theModel.addAttribute("customer", new Customer());

        return "/customer/customer-form";
    }

    /**
     * Hibernate validator @Valid validates model attributes
     * by reading validation annotations on them.
     * And puts the validation result in BindingResult object.
     * BindingResult object must be next parameter to Model object.
     *
     * @param customer
     * @param theBindingResult
     * @return
     */
    @RequestMapping("/process-form")
    public String processForm(
            @Valid @ModelAttribute("customer") Customer customer, //Validate Customer attributes
            BindingResult theBindingResult
    ) {

        if (theBindingResult.hasErrors()) { //Check binding result for validation errors

            return "/customer/customer-form";
        }

        return "/customer/customer-confirmation";
    }
}
