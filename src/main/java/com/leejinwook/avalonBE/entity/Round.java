package com.leejinwook.avalonBE.entity;

import com.leejinwook.avalonBE.enumerate.RoundResult;
import com.leejinwook.avalonBE.enumerate.RoundStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table
@Getter
@NoArgsConstructor
public class Round {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roundId;

    @Column(nullable = false)
    private int roundCount;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private RoundStatus roundStatus;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private RoundResult roundResult;
}
