package com.example.buoi8_sboot_jpa.service;

import com.example.buoi8_sboot_jpa.entity.Blog;
import com.example.buoi8_sboot_jpa.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class BlogService {
    private final BlogRepository blogRepository;

    public Page<Blog> getByStatusAndOrderByPublishedAtDesc(boolean status, Integer page, Integer size){
        PageRequest pageRequest = PageRequest.of(page - 1, size, Sort.by("publishedAt").descending());
        return blogRepository.findByStatusAndPublishedAtNotNullOrderByPublishedAtDesc(status, pageRequest);
    }

    public Page<Blog> getByStatus(boolean status, Integer page, Integer size){
        PageRequest pageRequest = PageRequest.of(page - 1, size, Sort.by("publishedAt").descending());
        return blogRepository.findByStatus(status, pageRequest);
    }
    public Optional<Blog> getByStatusAndIdAndSlug(boolean status, int id, String slug){
        return blogRepository.findByStatusAndIdAndSlug(status, id, slug);
    }
}
