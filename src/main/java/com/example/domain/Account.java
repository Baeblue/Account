package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;             // 입력 데이터를 구분하기 위해서. 화면 상에는 띄우지 않음.
    private Date date;              // 날짜
    private String category;        // 항목
    private String content;         // 내용
    private String method;          // 수단
    private Integer price;          // 금액
    private Integer accumulated;    // 누적 금액 _  자동 누적되는 메서드 만들기.
}