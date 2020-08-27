package com.konglingzhan.permission.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "t_user_role")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private static final long serialVersionUID = -3166012934498268403L;

    private Long userId;

    private Long roleId;
}
