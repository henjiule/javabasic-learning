package com.congzhang.java.README.week5.README;

/**
 * @ClassName BookService
 * @Description 图书服务接口
 * @Author zc
 * @Date 2020/11/2
 **/
public interface BookService {
    boolean putOnSale(Book book) throws ISBNException,BookNameException,PriceException;

}
