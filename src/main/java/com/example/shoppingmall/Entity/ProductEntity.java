package com.example.shoppingmall.Entity;
//8. 테이블 작성

import lombok.*;

import javax.persistence.*;

@Entity
//자동 생성할 메소드
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
//테이블
@Table(name="goods")
@SequenceGenerator(
        name="goods_SEQ",
        sequenceName = "goods_SEQ",
        initialValue = 1,
        allocationSize = 1
)
public class ProductEntity extends BaseEntity {
    @Id@GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "goods_SEQ")
    private Integer pid; //번호
    @Column(name="product", length=100)
    private String product; //상품명
    @Column(name="detail", length=200)
    private String detail; //상품설명
    @Column(name="quantity")
    private Integer quantity; //재고량
    @Column(name="price")
    private Integer price; //가격
    @Column(name="sale")
    private Integer sale; //세일상태
    @Column(name="state")
    private Integer state; //상품상태
    @Column(name="img")
    private String img; //상품이미지 파일명
}
