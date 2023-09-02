package com.example.btbuoi38.controller;

import com.example.btbuoi38.entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudenntController {
    List<Student> list = new ArrayList<Student>();

    @PostMapping("")
    public ResponseEntity<Student> themUser(@RequestParam String name, @RequestParam int age){
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        list.add(student);
        return new ResponseEntity(list, HttpStatus.OK);
    }
    @PostMapping("/{name}/{age}")
    public ResponseEntity<Student> themUser1(@PathVariable String name, @PathVariable int age){
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        list.add(student);
        return new ResponseEntity(list, HttpStatus.OK);
    }
    @PostMapping("/student")
    public ResponseEntity<?> themUser2(@RequestBody Student student){
        list.add(student);
        return new ResponseEntity(list, HttpStatus.OK);
    }
}
