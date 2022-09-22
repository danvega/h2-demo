package dev.danvega.h2demo.model;

import org.springframework.data.annotation.Id;

public record Book(@Id Integer id, String title, Integer pages, String Author) {
}
