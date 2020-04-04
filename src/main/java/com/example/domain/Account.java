package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;             // 항목을 구분하기 위해서. 화면 상에는 띄우지 않음.
    private Date date;              // 날짜  _  나중에 '월'만 추출하기.
    private String category;        // 항목
    private String content;         // 내용
    private String method;          // 수단
    private Integer price;          // 금액
    private Integer accumulated;    // 누적  _  자동 누적되는 메서드 만들기.
//    accumulated = 0;
//        public Integer sum(Integer price) {
//        accumulated += price;
//        return accumulated;
//        }
//    accumulated = sum(price);


}
