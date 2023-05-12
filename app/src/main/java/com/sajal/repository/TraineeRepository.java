package com.sajal.repository;

import com.sajal.model.Trainee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TraineeRepository {
    private final List<Trainee>  traineeList;
    TraineeRepository(){
        traineeList = new ArrayList<>();
    }

    public  void add(Trainee trainee){
        traineeList.add(trainee);
    }
    public  List<Trainee> getAll(){
       return traineeList;
    }


}
