package com.example.studentproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.PageAttributes.MediaType;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    //check the api's working correctly api
    @RequestMapping(value="/ping", method=RequestMethod.GET)
    @ResponseBody
    public String healthCheck() {
        return "This is working well";
    }
    @RequestMapping(value="/student", method=RequestMethod.POST)
    @ResponseBody
    public Student addStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @RequestMapping(value="/students", method=RequestMethod.GET)
    @ResponseBody
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @RequestMapping(value="/findstudent", method = RequestMethod.GET)
    @ResponseBody
    public Student findStudent(@RequestParam("studentId") int studentId) {
        return studentRepository.findById(studentId);
    }

    @RequestMapping(value= "/updatestudent", method = RequestMethod.GET)
    @ResponseBody
    public Student updateStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }

    @RequestMapping(value="/deletestudent", method = RequestMethod.GET)
    @ResponseBody
    public int deleteStudent(@RequestParam(value = "studentId") int studentId) {
    	
        return studentRepository.deleteById(studentId);
    }
}
