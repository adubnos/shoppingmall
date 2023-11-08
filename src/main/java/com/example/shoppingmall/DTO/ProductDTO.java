package com.example.shoppingmall.DTO;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

//9. 데이터 교환
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO {
    private Integer pid; //번호
    @NotEmpty(message="상품명은 생략할 수 없습니다.")
    private String product; //상품명
    private String detail; //상품설명
    private Integer quantity; //재고량
    private Integer price; //가격
    private Integer sale; //세일상태
    private Integer state; //상품상태
    private String img; //상품이미지 파일명
    private LocalDateTime regDate; //등록일
    private LocalDateTime modDate; //수정일
}
