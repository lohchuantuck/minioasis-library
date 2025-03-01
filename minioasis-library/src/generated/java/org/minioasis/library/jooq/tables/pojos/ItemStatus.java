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
public class ItemStatus implements Serializable {

    private static final long serialVersionUID = 233001291;

    private Long    id;
    private Boolean borrowable;
    private String  name;
    private Boolean reservable;

    public ItemStatus() {}

    public ItemStatus(ItemStatus value) {
        this.id = value.id;
        this.borrowable = value.borrowable;
        this.name = value.name;
        this.reservable = value.reservable;
    }

    public ItemStatus(
        Long    id,
        Boolean borrowable,
        String  name,
        Boolean reservable
    ) {
        this.id = id;
        this.borrowable = borrowable;
        this.name = name;
        this.reservable = reservable;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getBorrowable() {
        return this.borrowable;
    }

    public void setBorrowable(Boolean borrowable) {
        this.borrowable = borrowable;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getReservable() {
        return this.reservable;
    }

    public void setReservable(Boolean reservable) {
        this.reservable = reservable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ItemStatus (");

        sb.append(id);
        sb.append(", ").append(borrowable);
        sb.append(", ").append(name);
        sb.append(", ").append(reservable);

        sb.append(")");
        return sb.toString();
    }
}
