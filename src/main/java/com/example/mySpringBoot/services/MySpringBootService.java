package com.example.mySpringBoot.services;

import com.example.mySpringBoot.repositories.MySpringBootRepository;
import com.example.mySpringBoot.models.pojos.MyEntityRequestPayload;
import com.example.mySpringBoot.models.tables.MyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MySpringBootService {

    @Autowired
    MySpringBootRepository mySpringBootRepository;

    public List<MyEntity> getAllEntities() {
        return mySpringBootRepository.findAll();
    }

    public List<String> getAllNames() {
        return mySpringBootRepository.findAllNames();
    }

    public MyEntity addEntity(MyEntityRequestPayload myEntityRequestPayload) {
        MyEntity myEntity = new MyEntity();

        myEntity.setName(myEntityRequestPayload.getName());
        myEntity.setAge(myEntityRequestPayload.getAge());
        myEntity.setAddressLine1(myEntityRequestPayload.getAddressLine1());
        myEntity.setAddressLine2(myEntityRequestPayload.getAddressLine2());

        return mySpringBootRepository.save(myEntity);
    }
}
