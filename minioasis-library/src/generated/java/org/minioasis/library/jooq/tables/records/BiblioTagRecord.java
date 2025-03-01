/*
 * This file is generated by jOOQ.
*/
package org.minioasis.library.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;
import org.minioasis.library.jooq.tables.BiblioTag;


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
public class BiblioTagRecord extends UpdatableRecordImpl<BiblioTagRecord> implements Record2<Long, Long> {

    private static final long serialVersionUID = 547874850;

    /**
     * Setter for <code>PUBLIC.BIBLIO_TAG.BIBLIO_ID</code>.
     */
    public void setBiblioId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.BIBLIO_TAG.BIBLIO_ID</code>.
     */
    public Long getBiblioId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>PUBLIC.BIBLIO_TAG.TAG_ID</code>.
     */
    public void setTagId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.BIBLIO_TAG.TAG_ID</code>.
     */
    public Long getTagId() {
        return (Long) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Long, Long> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Long> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return BiblioTag.BIBLIO_TAG.BIBLIO_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return BiblioTag.BIBLIO_TAG.TAG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getBiblioId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getTagId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getBiblioId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getTagId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BiblioTagRecord value1(Long value) {
        setBiblioId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BiblioTagRecord value2(Long value) {
        setTagId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BiblioTagRecord values(Long value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BiblioTagRecord
     */
    public BiblioTagRecord() {
        super(BiblioTag.BIBLIO_TAG);
    }

    /**
     * Create a detached, initialised BiblioTagRecord
     */
    public BiblioTagRecord(Long biblioId, Long tagId) {
        super(BiblioTag.BIBLIO_TAG);

        set(0, biblioId);
        set(1, tagId);
    }
}
