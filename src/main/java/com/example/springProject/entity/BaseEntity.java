package com.example.springProject.entity;

import lombok.CustomLog;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Data
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creadtedAt;

    @Column(name = "ceated_by", length = 400)
    private String createdBy;

    @Column(name = "update_by", length = 400)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @Column(name = "update_by" , length = 400)
    private String updatedBy;

    @Column(name = "status")
    private Boolean status;
}
