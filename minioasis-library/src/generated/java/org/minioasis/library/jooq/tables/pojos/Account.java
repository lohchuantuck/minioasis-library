/*
 * This file is generated by jOOQ.
*/
package org.minioasis.library.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Account implements Serializable {

    private static final long serialVersionUID = 1755405518;

    private Long    id;
    private String  code;
    private String  name;
    private Integer type;

    public Account() {}

    public Account(Account value) {
        this.id = value.id;
        this.code = value.code;
        this.name = value.name;
        this.type = value.type;
    }

    public Account(
        Long    id,
        String  code,
        String  name,
        Integer type
    ) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.type = type;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Account (");

        sb.append(id);
        sb.append(", ").append(code);
        sb.append(", ").append(name);
        sb.append(", ").append(type);

        sb.append(")");
        return sb.toString();
    }
}
