package com.leejinwook.avalonBE.entity;

import com.leejinwook.avalonBE.enumerate.PlayerMissionChoice;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table
@Getter
@NoArgsConstructor
public class PlayerMission {
    @Id @GeneratedValue
    private Long playerMissionId;

    @Column(nullable = false)
    private boolean playerExpedition;

    @Column
    private PlayerMissionChoice playerMissionChoice;
}
