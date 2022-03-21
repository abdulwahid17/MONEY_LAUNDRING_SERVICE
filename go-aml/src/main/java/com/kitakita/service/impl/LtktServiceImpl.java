package com.kitakita.service.impl;

import com.kitakita.service.ILtktService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class LtktServiceImpl implements ILtktService {


    @Override
    public String getById(Long id) {
        return "hello world "+id;
    }
}
