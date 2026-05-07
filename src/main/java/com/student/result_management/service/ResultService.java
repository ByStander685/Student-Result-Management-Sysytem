package com.student.result_management.service;

import com.student.result_management.model.Result;
import com.student.result_management.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ResultService {

    @Autowired
    private ResultRepository resultRepository;

    public List<Result> getAllResults() {
        return resultRepository.findAll();
    }

    public List<Result> getResultsByStudentId(Long studentId) {
        return resultRepository.findByStudentId(studentId);
    }

    public Result saveResult(Result result) {
        return resultRepository.save(result);
    }

    public void deleteResult(Long id) {
        resultRepository.deleteById(id);
    }
}