package com.leejinwook.avalonBE.entity;

import com.leejinwook.avalonBE.enumerate.GameResult;
import com.leejinwook.avalonBE.enumerate.GameStatus;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Game {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gameId;

    @Column(nullable = false)
    private int gameRoundNumber;

    @Column(nullable = false)
    private int gameAveMmr;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private GameStatus gameStatus;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private GameResult gameResult;
}
