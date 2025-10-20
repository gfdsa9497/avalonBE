package com.leejinwook.avalonBE.entity;

import com.leejinwook.avalonBE.enumerate.MissionResult;
import com.leejinwook.avalonBE.enumerate.MissionStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table
@Getter
@NoArgsConstructor
public class Mission {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long missionId;

    @Column(nullable = false)
    private int missionTotalSuccess;

    @Column(nullable = false)
    private int missionTotalFail;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private MissionStatus missionStatus;

    @Column
    @Enumerated(EnumType.STRING)
    private MissionResult missionResult;
}
