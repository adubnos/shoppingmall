package com.example.shoppingmall.Entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;
//8. 등록일과 수정일 관리 필드
@Getter
@Setter
@MappedSuperclass //연결용
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
    @Column(name="regDate", nullable = false, updatable = false)
    @CreatedDate
    private LocalDateTime regDate;

    @Column(name = "modDate")
    @LastModifiedDate
    private LocalDateTime modDate;
}
