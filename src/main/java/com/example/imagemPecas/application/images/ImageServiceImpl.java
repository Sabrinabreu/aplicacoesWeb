package com.example.imagemPecas.application.images;

import com.example.imagemPecas.domain.entity.Image;
import com.example.imagemPecas.infra.Repository.ImageRepository;
import com.example.imagemPecas.service.imageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ImageServiceImpl implements imageService {

    private final ImageRepository repository;

    @Override
    @Transactional
    public Image save (Image image) {
        return repository.save(image);
    }
}
