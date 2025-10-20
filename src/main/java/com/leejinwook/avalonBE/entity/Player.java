package com.leejinwook.avalonBE.entity;

import com.leejinwook.avalonBE.enumerate.PlayerRole;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Player {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long playerId;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private PlayerRole playerRole;

    @Column(nullable = false)
    private int playerOrder;
}
