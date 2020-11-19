package com.degfy.fusionner.dal.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 提测版本
 */
@Entity
@Data
@Accessors(chain = true)
@Table(name = "v1_test_point_version")
public class TestPointVersion implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 提测版本ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    /**
     * 特性仓库ID
     */
    @Column(name = "feature_repo_id", nullable = false)
    private Integer featureRepoId;

    /**
     * 版本tag
     */
    @Column(name = "tag")
    private String tag;

    /**
     * 版本hash值
     */
    @Column(name = "hash")
    private String hash;

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
