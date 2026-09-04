package com.example.imagemPecas.service;

import com.example.imagemPecas.domain.entity.Image;

import java.util.Optional;

public interface imageService {
    Image save(Image image);

    Optional<Image> getById(String id);

}
