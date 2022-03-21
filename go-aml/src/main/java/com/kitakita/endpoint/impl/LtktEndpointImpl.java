package com.kitakita.endpoint.impl;

import com.kitakita.endpoint.ILtktEndpoint;
import com.kitakita.service.ILtktService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RestController
public class LtktEndpointImpl implements ILtktEndpoint {

    private final ILtktService ltktService;

    @Override
    public String getById(Long id) {
        return ltktService.getById(id);
    }
}
