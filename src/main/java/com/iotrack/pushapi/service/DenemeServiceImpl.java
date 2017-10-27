package com.iotrack.pushapi.service;

import com.iotrack.pushapi.domain.Deneme;
import com.iotrack.pushapi.repository.DenemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DenemeServiceImpl implements DenemeService {

    @Autowired
    private DenemeRepository denemeRepository;

    @Override
    public void addDeneme(Deneme deneme) {
        this.denemeRepository.save(deneme);
    }
}
