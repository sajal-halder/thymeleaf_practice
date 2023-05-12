package com.sajal.controller;

import com.sajal.model.Trainee;
import com.sajal.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class TraineeController {
    @Autowired
    TraineeService traineeService;


    /// ---------- page mapper ------- ///
    @GetMapping("/")
    public ModelAndView home(ModelAndView model){
        model.setViewName("index.html");
        return model;
    }
    @GetMapping("/traineeForm")
    public ModelAndView traineeForm(ModelAndView model){
        model.setViewName("trainee_form.html");
        return model;
    }
    @GetMapping("/getAllTrainee")
    public ModelAndView getAllTrainee(ModelAndView model){
        List<Trainee> traineeList = traineeService.getAllTrainee();
        model.setViewName("view_all_trainee.html");
        model.addObject("TraineeList",traineeList);
        return model;
    }

    /// ---------- process endpoint ------- ///
    @PostMapping("/addTrainee")
    public RedirectView addTrainee(@ModelAttribute Trainee trainee ){
        traineeService.addTrainee(trainee);
        return  new RedirectView("/getAllTrainee");
    }


}
