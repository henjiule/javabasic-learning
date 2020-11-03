package com.congzhang.java.README.week5.README;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Book
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/2
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String ISBN;
    private Integer price;
    private String bookName;
}
