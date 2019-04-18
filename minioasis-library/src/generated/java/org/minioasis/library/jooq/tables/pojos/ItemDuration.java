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
public class ItemDuration implements Serializable {

    private static final long serialVersionUID = 1555545517;

    private Long    id;
    private String  name;
    private Integer itemDurationValue;

    public ItemDuration() {}

    public ItemDuration(ItemDuration value) {
        this.id = value.id;
        this.name = value.name;
        this.itemDurationValue = value.itemDurationValue;
    }

    public ItemDuration(
        Long    id,
        String  name,
        Integer itemDurationValue
    ) {
        this.id = id;
        this.name = name;
        this.itemDurationValue = itemDurationValue;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getItemDurationValue() {
        return this.itemDurationValue;
    }

    public void setItemDurationValue(Integer itemDurationValue) {
        this.itemDurationValue = itemDurationValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ItemDuration (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(itemDurationValue);

        sb.append(")");
        return sb.toString();
    }
}
