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
public class Groups implements Serializable {

    private static final long serialVersionUID = -1414664590;

    private Long   id;
    private String code;
    private String name;

    public Groups() {}

    public Groups(Groups value) {
        this.id = value.id;
        this.code = value.code;
        this.name = value.name;
    }

    public Groups(
        Long   id,
        String code,
        String name
    ) {
        this.id = id;
        this.code = code;
        this.name = name;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Groups (");

        sb.append(id);
        sb.append(", ").append(code);
        sb.append(", ").append(name);

        sb.append(")");
        return sb.toString();
    }
}
