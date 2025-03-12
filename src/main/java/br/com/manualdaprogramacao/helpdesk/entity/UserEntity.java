package br.com.manualdaprogramacao.helpdesk.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;
import java.util.Date;


@Data
@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    private UUID id;

    private String username;
    private String password;
    private String name;
    private String email;
    private Boolean active;

    @Column(name = "created_by")
    private UUID createdBy;

    @Column(name = "created_at")
    private Date createAt;

    @Column(name = "update_by")
    private UUID updateBy;

    @Column(name = "update_at")
    private Date updateAt;

}
