package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "content", length = 512)
    private String content;

    @Column(name = "is_published")
    private int isPublished;

    @ManyToOne
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    private List<Answer> answers = new ArrayList<>();

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    private List<AnswerEvent> answerEvent;

}
