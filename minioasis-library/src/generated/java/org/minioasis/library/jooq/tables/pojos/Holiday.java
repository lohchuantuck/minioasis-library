/*
 * This file is generated by jOOQ.
*/
package org.minioasis.library.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Date;

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
public class Holiday implements Serializable {

    private static final long serialVersionUID = -541686672;

    private Long    id;
    private Date    endDate;
    private Boolean fine;
    private String  name;
    private Date    startDate;

    public Holiday() {}

    public Holiday(Holiday value) {
        this.id = value.id;
        this.endDate = value.endDate;
        this.fine = value.fine;
        this.name = value.name;
        this.startDate = value.startDate;
    }

    public Holiday(
        Long    id,
        Date    endDate,
        Boolean fine,
        String  name,
        Date    startDate
    ) {
        this.id = id;
        this.endDate = endDate;
        this.fine = fine;
        this.name = name;
        this.startDate = startDate;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Boolean getFine() {
        return this.fine;
    }

    public void setFine(Boolean fine) {
        this.fine = fine;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Holiday (");

        sb.append(id);
        sb.append(", ").append(endDate);
        sb.append(", ").append(fine);
        sb.append(", ").append(name);
        sb.append(", ").append(startDate);

        sb.append(")");
        return sb.toString();
    }
}
