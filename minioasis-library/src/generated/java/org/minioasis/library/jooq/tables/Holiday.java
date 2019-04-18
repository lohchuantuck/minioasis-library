/*
 * This file is generated by jOOQ.
*/
package org.minioasis.library.jooq.tables;


import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.minioasis.library.jooq.Indexes;
import org.minioasis.library.jooq.Keys;
import org.minioasis.library.jooq.Public;
import org.minioasis.library.jooq.tables.records.HolidayRecord;


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
public class Holiday extends TableImpl<HolidayRecord> {

    private static final long serialVersionUID = 512082968;

    /**
     * The reference instance of <code>PUBLIC.HOLIDAY</code>
     */
    public static final Holiday HOLIDAY = new Holiday();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HolidayRecord> getRecordType() {
        return HolidayRecord.class;
    }

    /**
     * The column <code>PUBLIC.HOLIDAY.ID</code>.
     */
    public final TableField<HolidayRecord, Long> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>PUBLIC.HOLIDAY.END_DATE</code>.
     */
    public final TableField<HolidayRecord, Date> END_DATE = createField("END_DATE", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.HOLIDAY.FINE</code>.
     */
    public final TableField<HolidayRecord, Boolean> FINE = createField("FINE", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.HOLIDAY.NAME</code>.
     */
    public final TableField<HolidayRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.HOLIDAY.START_DATE</code>.
     */
    public final TableField<HolidayRecord, Date> START_DATE = createField("START_DATE", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * Create a <code>PUBLIC.HOLIDAY</code> table reference
     */
    public Holiday() {
        this(DSL.name("HOLIDAY"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.HOLIDAY</code> table reference
     */
    public Holiday(String alias) {
        this(DSL.name(alias), HOLIDAY);
    }

    /**
     * Create an aliased <code>PUBLIC.HOLIDAY</code> table reference
     */
    public Holiday(Name alias) {
        this(alias, HOLIDAY);
    }

    private Holiday(Name alias, Table<HolidayRecord> aliased) {
        this(alias, aliased, null);
    }

    private Holiday(Name alias, Table<HolidayRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PRIMARY_KEY_6B, Indexes.UK_3JJDI9M362Y965LR542FPEJT_INDEX_6);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<HolidayRecord, Long> getIdentity() {
        return Keys.IDENTITY_HOLIDAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HolidayRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_6B;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HolidayRecord>> getKeys() {
        return Arrays.<UniqueKey<HolidayRecord>>asList(Keys.CONSTRAINT_6B, Keys.UK_3JJDI9M362Y965LR542FPEJT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Holiday as(String alias) {
        return new Holiday(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Holiday as(Name alias) {
        return new Holiday(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Holiday rename(String name) {
        return new Holiday(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Holiday rename(Name name) {
        return new Holiday(name, null);
    }
}
