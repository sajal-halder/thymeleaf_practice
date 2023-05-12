package com.sajal.service;

import com.sajal.model.Trainee;
import com.sajal.repository.TraineeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraineeServiceImpl implements TraineeService{
    @Autowired
    TraineeRepository traineeRepository;
    @Override
    public void addTrainee(Trainee trainee) {
        traineeRepository.add(trainee);
    }

    @Override
    public List<Trainee> getAllTrainee() {
        return traineeRepository.getAll();
    }
}
