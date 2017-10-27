package com.iotrack.pushapi.service;

import com.iotrack.pushapi.domain.Body;
import com.iotrack.pushapi.repository.PushRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PushServiceImpl implements PushService{

    @Autowired
    private PushRepository pushRepository;

    @Override
    public Body addBody(Body body) {

        return this.pushRepository.save(body);

    }
}
