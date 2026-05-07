package com.student.result_management.controller;

import com.student.result_management.model.Result;
import com.student.result_management.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/results")
public class ResultController {

    @Autowired
    private ResultService resultService;

    @GetMapping
    public List<Result> getAllResults() {
        return resultService.getAllResults();
    }

    @GetMapping("/student/{studentId}")
    public List<Result> getResultsByStudent(@PathVariable Long studentId) {
        return resultService.getResultsByStudentId(studentId);
    }

    @PostMapping
    public Result addResult(@RequestBody Result result) {
        return resultService.saveResult(result);
    }

    @DeleteMapping("/{id}")
    public String deleteResult(@PathVariable Long id) {
        resultService.deleteResult(id);
        return "Result deleted successfully";
    }
}