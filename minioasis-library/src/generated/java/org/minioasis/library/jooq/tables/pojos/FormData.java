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
public class FormData implements Serializable {

    private static final long serialVersionUID = -1533772872;

    private Long   id;
    private String data;
    private String dataType;

    public FormData() {}

    public FormData(FormData value) {
        this.id = value.id;
        this.data = value.data;
        this.dataType = value.dataType;
    }

    public FormData(
        Long   id,
        String data,
        String dataType
    ) {
        this.id = id;
        this.data = data;
        this.dataType = dataType;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDataType() {
        return this.dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FormData (");

        sb.append(id);
        sb.append(", ").append(data);
        sb.append(", ").append(dataType);

        sb.append(")");
        return sb.toString();
    }
}
