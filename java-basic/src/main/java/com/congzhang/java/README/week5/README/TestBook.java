package com.congzhang.java.README.week5.README;

/**
 * @ClassName TestBook
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/2
 **/
public class TestBook {
    public static void main(String[] args) {
        Book[] books = new Book[]{
                Book.builder().ISBN("1231231231231").bookName("Java暴力破解").price(99).build(),
                Book.builder().ISBN("123123123123A").bookName("Java从入门到精通").price(99).build(),
                Book.builder().ISBN("1231231231231").bookName("Java学习笔记").price(199).build(),
                Book.builder().ISBN("1231231231231").bookName("Java案例开发").price(99).build()};
         BookService bs = new BookServiceImpl();
         for (Book book : books) {
             try {
                 boolean b = bs.putOnSale(book);
                 if (b) {
                     System.out.println(book.getBookName() + "成功上架！");
                 }
             } catch (ISBNException | BookNameException | PriceException e) {
                 System.err.println(e.getMessage());
             }
         }
    }

}










