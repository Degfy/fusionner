package com.degfy.fusionner.dal.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "v1_user")
@Data
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    /**
     * 用户名
     */
    @Column(name = "name", nullable = false)
    private String name = "";

    /**
     * 密码hash
     */
    @Column(name = "password_hash", nullable = false)
    private String passwordHash = "";

    /**
     * 角色bitmap：1产品，2开发，4测试，8运维
     */
    @Column(name = "role", nullable = false)
    private Integer role;

    /**
     * 创建者
     */
    @Column(name = "created_by", nullable = false)
    private Integer createdBy;

    /**
     * 创建时间
     */
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    /**
     * 修改者
     */
    @Column(name = "updated_by")
    private Integer updatedBy;

    /**
     * 修改时间
     */
    @Column(name = "updated_at")
    private LocalDateTime updatedAt = LocalDateTime.now();

}
