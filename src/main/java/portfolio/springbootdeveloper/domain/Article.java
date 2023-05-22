package portfolio.springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.Builder;

@Entity // 엔티티로 지정
public class Article {

    @Id // id 필드를 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키 자동으로 1씩 증가
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "title", nullable = false)   // 'title'이라는 not null 컬럼과 매핑
    private String title;

    @Column(name = "content", nullable = false)   // 'content'이라는 not null 컬럼과 매핑
    private String content;
}
