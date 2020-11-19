package com.degfy.fusionner.dal.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Accessors(chain = true)
@Table(name = "v1_feature")
public class Feature implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 特性ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    /**
     * 特性编号
     */
    @Column(name = "code")
    private String code;

    /**
     * 产品ID
     */
    @Column(name = "product_id", nullable = false)
    private Integer productId;

    /**
     * 特性名称
     */
    @Column(name = "name", nullable = false)
    private String name = "";

    /**
     * 特性描述
     */
    @Column(name = "description")
    private String description;

    /**
     * 状态：0开始，5进行中，9结束
     */
    @Column(name = "status")
    private Integer status;

    /**
     * 是否落后于主版本
     */
    @Column(name = "is_behind")
    private Boolean behind;

    /**
     * 是否存在未测试的代码
     */
    @Column(name = "existed_not_test_code")
    private Integer existedNotTestCode;

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
