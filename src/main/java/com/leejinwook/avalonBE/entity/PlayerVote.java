package com.leejinwook.avalonBE.entity;

import com.leejinwook.avalonBE.enumerate.PlayerVoteChoice;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table
@Getter
@NoArgsConstructor
public class PlayerVote {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long playerVoteId;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private PlayerVoteChoice playerVoteChoice;
}
