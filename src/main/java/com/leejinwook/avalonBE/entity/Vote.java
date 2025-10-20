package com.leejinwook.avalonBE.entity;

import com.leejinwook.avalonBE.enumerate.VoteResult;
import com.leejinwook.avalonBE.enumerate.VoteStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table
@Getter
@NoArgsConstructor
public class Vote {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long voteId;

    @Column(nullable = false)
    private int voteCount;

    @Column(nullable = false)
    private int voteTotalPositive;

    @Column(nullable = false)
    private int voteTotalNegative;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private VoteStatus voteStatus;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private VoteResult voteResult;
}
