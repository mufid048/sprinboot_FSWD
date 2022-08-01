package com.example.demo.controller;

import com.example.demo.model.Result;
import com.example.demo.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class resultController {
    @Autowired
    ResultRepository resultRepository;

    @GetMapping("/listResult")
    public List<Result> getAllResult() {
        return resultRepository.findAll();
    }

    @GetMapping("/Result/{id}")
    public Result getResult(@PathVariable Integer id) {
        return (Result) resultRepository.findById(id).get();
    }

    @DeleteMapping("/Result/{id}")
    public List<Result> deleteResult(@PathVariable Integer id) {
        resultRepository.delete(resultRepository.findById(id).get());
        return resultRepository.findAll();
    }

    @PostMapping("/Result")
    public List<Result> addResult(@RequestBody Result result) {
        resultRepository.save(result);
        return resultRepository.findAll();
    }

    @PutMapping("/Result/{id}")
    public List<Result> updateResult(@RequestBody Result result, @PathVariable Integer id) {
        Result resultObj = (Result) resultRepository.findById(id).get();
        //resultObj.setSemester(result.getSemester());
        resultObj.setPercentage(result.getPercentage());
        Object ResultObj;
        resultRepository.save(resultObj);
        return resultRepository.findAll();
    }
}
