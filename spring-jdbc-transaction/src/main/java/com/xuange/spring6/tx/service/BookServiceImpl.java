package com.xuange.spring6.tx.service;

import com.xuange.spring6.tx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDao bookDao;

    /*
    @Transactional标识在方法上，则只会影响该方法
    @Transactional标识的类上，则会影响类中所有的方法
    */
    @Override
    public void buyBook(Integer bookId, Integer userId) {
        //根据图书id查询图书价格
        Integer price = bookDao.getBookPriceByBookId(bookId);
        //更新图书表的库存量 -1
        bookDao.updateStock(bookId);
        //更新用户表用户余额 -图书价格
        bookDao.bookDaoUpdateUserBalance(userId, price);

    }

}
