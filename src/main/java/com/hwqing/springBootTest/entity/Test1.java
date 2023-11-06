package com.hwqing.springBootTest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Auther: Administrator
 * @Description:
 */
@Entity
@Table(name = "test1")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Test1 implements Serializable {
    @Id
    private int id;
    @Column (name = "name")
    private String name;
}
