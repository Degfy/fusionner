package com.degfy.fusionner.dal.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 提测点：提测产生
 */
@Entity
@Table(name = "v1_test_point")
@Data
@Accessors(chain = true)
public class TestPoint implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 提测ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    /**
     * 特性ID
     */
    @Column(name = "feature_id", nullable = false)
    private Integer featureId;

    /**
     * 提测内容
     */
    @Column(name = "content")
    private String content;

    @Column(name = "test_record_id", nullable = false)
    private Integer testRecordId;

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
