package com.xuange.spring6.tx.service;

import org.springframework.stereotype.Service;

public interface BookService {
    void buyBook(Integer bookId, Integer userId);
}
