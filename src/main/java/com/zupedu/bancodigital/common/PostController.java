package com.zupedu.bancodigital.common;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.util.UriComponentsBuilder;

public interface PostController<T> {
    @PostMapping
    ResponseEntity<?> save(T request, UriComponentsBuilder builder);
}
