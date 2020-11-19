package com.degfy.fusionner.dal.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Accessors(chain = true)
@Table(name = "v1_repo")
public class Repo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 代码仓库ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    /**
     * 产品ID
     */
    @Column(name = "product_id", nullable = false)
    private Integer productId;

    /**
     * 仓库名
     */
    @Column(name = "name", nullable = false)
    private String name = "";

    /**
     * 仓库描述
     */
    @Column(name = "description")
    private String description;

    /**
     * 仓库地址
     */
    @Column(name = "url", nullable = false)
    private String url = "";

    /**
     * 有权登陆仓库的用户名
     */
    @Column(name = "user")
    private String user;

    /**
     * 有权登陆仓库的用户名-对应密码
     */
    @Column(name = "password")
    private String password;

    /**
     * 访问仓库的私钥证书
     */
    @Column(name = "id_rsa")
    private String idRsa;

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
