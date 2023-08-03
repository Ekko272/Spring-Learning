package com.xuange.spring6.tx.dao;

public interface BookDao {
    Integer getBookPriceByBookId(Integer bookId);

    void updateStock(Integer bookId);

    void bookDaoUpdateUserBalance(Integer userId, Integer price);
}
