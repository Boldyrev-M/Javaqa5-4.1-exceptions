package ru.netology.repository;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class NotFoundException extends RuntimeException {
    public NotFoundException(String s) {
        System.out.println(s);
    }
}
