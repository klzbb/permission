package com.konglingzhan.permission.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "t_role_menu")
public class RoleMenu implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private static final long serialVersionUID = -7573904024872252113L;

    private Long roleId;

    private Long menuId;
}
