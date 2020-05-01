package com.springbootjsp.controller;

import com.springbootjsp.entity.Student;
import com.springbootjsp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("hello")
public class HelloHandler {

    @Autowired
    private StudentRepository StudentRepository;

    @GetMapping("index")
    public String index(){
        System.out.println("index......");
      return "index1" ;
    }

    @GetMapping("findAll")
    public ModelAndView getInfo(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("list",StudentRepository.findAll());
        return modelAndView;
    }

    @GetMapping("delete/{delid}")
    public ModelAndView delete(@PathVariable(value = "delid")int id){
        ModelAndView modelAndView = new ModelAndView();
        StudentRepository.delete(id);
        modelAndView.setViewName("index");
        modelAndView.addObject("list",StudentRepository.findAll());
        return modelAndView;

    }

    @GetMapping("saveJsp")
    public String addJsp(){
        return "save";
    }

    @GetMapping("save")
    public ModelAndView add(Student student){
        ModelAndView modelAndView = new ModelAndView();
        StudentRepository.saveAndUpdate(student);
        modelAndView.setViewName("index");
        modelAndView.addObject("list",StudentRepository.findAll());
        return modelAndView;
    }

    @PostMapping("save1")
    public String add1(Student student){

        StudentRepository.saveAndUpdate(student);

        return "redirect:/hello/findAll";
    }

    @GetMapping("findById/{stuId}")
    public ModelAndView findById(@PathVariable(value = "stuId") int id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("stu",StudentRepository.findById(id));
        modelAndView.setViewName("update");
        return modelAndView;
    }

    @PostMapping("/update")
    public String update(Student stu){
        StudentRepository.saveAndUpdate(stu);
        return "redirect:/hello/findAll";
    }

}
