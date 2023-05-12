package com.sajal.service;

import com.sajal.model.Trainee;

import java.util.List;

public interface TraineeService {
    public void addTrainee(Trainee trainee);
    public List<Trainee> getAllTrainee();
}
