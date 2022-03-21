package com.kitakita.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/v1/ltkt")
public interface ILtktEndpoint {

    @GetMapping("/get-by-id/{id}")
    String getById( @PathVariable("id") Long id);
}
