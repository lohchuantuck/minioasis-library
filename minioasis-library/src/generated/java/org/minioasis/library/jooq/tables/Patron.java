/*
 * This file is generated by jOOQ.
*/
package org.minioasis.library.jooq.tables;


import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
import org.minioasis.library.jooq.tables.records.PatronRecord;


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
public class Patron extends TableImpl<PatronRecord> {

    private static final long serialVersionUID = 476172701;

    /**
     * The reference instance of <code>PUBLIC.PATRON</code>
     */
    public static final Patron PATRON = new Patron();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PatronRecord> getRecordType() {
        return PatronRecord.class;
    }

    /**
     * The column <code>PUBLIC.PATRON.ID</code>.
     */
    public final TableField<PatronRecord, Long> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>PUBLIC.PATRON.ACTIVE</code>.
     */
    public final TableField<PatronRecord, String> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.CHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.field("'Y'", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>PUBLIC.PATRON.CARD_KEY</code>.
     */
    public final TableField<PatronRecord, String> CARD_KEY = createField("CARD_KEY", org.jooq.impl.SQLDataType.CHAR(16).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.PATRON.ADDRESS1</code>.
     */
    public final TableField<PatronRecord, String> ADDRESS1 = createField("ADDRESS1", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.PATRON.ADDRESS2</code>.
     */
    public final TableField<PatronRecord, String> ADDRESS2 = createField("ADDRESS2", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.PATRON.ADDRESS3</code>.
     */
    public final TableField<PatronRecord, String> ADDRESS3 = createField("ADDRESS3", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.PATRON.CITY</code>.
     */
    public final TableField<PatronRecord, String> CITY = createField("CITY", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.PATRON.COUNTRY</code>.
     */
    public final TableField<PatronRecord, String> COUNTRY = createField("COUNTRY", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.PATRON.POSTCODE</code>.
     */
    public final TableField<PatronRecord, String> POSTCODE = createField("POSTCODE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.PATRON.STATE</code>.
     */
    public final TableField<PatronRecord, String> STATE = createField("STATE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.PATRON.EMAIL</code>.
     */
    public final TableField<PatronRecord, String> EMAIL = createField("EMAIL", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.PATRON.MOBILE</code>.
     */
    public final TableField<PatronRecord, String> MOBILE = createField("MOBILE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.PATRON.TEL</code>.
     */
    public final TableField<PatronRecord, String> TEL = createField("TEL", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.PATRON.CREATED</code>.
     */
    public final TableField<PatronRecord, Timestamp> CREATED = createField("CREATED", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>PUBLIC.PATRON.END_DATE</code>.
     */
    public final TableField<PatronRecord, Date> END_DATE = createField("END_DATE", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.PATRON.ENTANGLED</code>.
     */
    public final TableField<PatronRecord, String> ENTANGLED = createField("ENTANGLED", org.jooq.impl.SQLDataType.CHAR(16).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.PATRON.GENDER</code>.
     */
    public final TableField<PatronRecord, String> GENDER = createField("GENDER", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.PATRON.IC</code>.
     */
    public final TableField<PatronRecord, String> IC = createField("IC", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.PATRON.NAME</code>.
     */
    public final TableField<PatronRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.PATRON.NAME2</code>.
     */
    public final TableField<PatronRecord, String> NAME2 = createField("NAME2", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.PATRON.NOTE</code>.
     */
    public final TableField<PatronRecord, String> NOTE = createField("NOTE", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>PUBLIC.PATRON.ORDER_NO</code>.
     */
    public final TableField<PatronRecord, Short> ORDER_NO = createField("ORDER_NO", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>PUBLIC.PATRON.RESERVABLE_DATE</code>.
     */
    public final TableField<PatronRecord, Date> RESERVABLE_DATE = createField("RESERVABLE_DATE", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.PATRON.START_DATE</code>.
     */
    public final TableField<PatronRecord, Date> START_DATE = createField("START_DATE", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.PATRON.UNCOLLECTED_NO</code>.
     */
    public final TableField<PatronRecord, Short> UNCOLLECTED_NO = createField("UNCOLLECTED_NO", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.PATRON.UPDATED</code>.
     */
    public final TableField<PatronRecord, Timestamp> UPDATED = createField("UPDATED", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>PUBLIC.PATRON.GROUP_ID</code>.
     */
    public final TableField<PatronRecord, Long> GROUP_ID = createField("GROUP_ID", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>PUBLIC.PATRON.PATRONTYPE_ID</code>.
     */
    public final TableField<PatronRecord, Long> PATRONTYPE_ID = createField("PATRONTYPE_ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>PUBLIC.PATRON</code> table reference
     */
    public Patron() {
        this(DSL.name("PATRON"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.PATRON</code> table reference
     */
    public Patron(String alias) {
        this(DSL.name(alias), PATRON);
    }

    /**
     * Create an aliased <code>PUBLIC.PATRON</code> table reference
     */
    public Patron(Name alias) {
        this(alias, PATRON);
    }

    private Patron(Name alias, Table<PatronRecord> aliased) {
        this(alias, aliased, null);
    }

    private Patron(Name alias, Table<PatronRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.FK_PATRON_GROUP_INDEX_8, Indexes.FK_PATRON_PATRONTYPE_INDEX_8, Indexes.PRIMARY_KEY_8C, Indexes.UK_3CND47DLNMG4XI9OQ6JNI97X3_INDEX_8, Indexes.UK_E9FRUVR3H2998KELNJ73YM6CY_INDEX_8);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PatronRecord, Long> getIdentity() {
        return Keys.IDENTITY_PATRON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PatronRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_8C;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PatronRecord>> getKeys() {
        return Arrays.<UniqueKey<PatronRecord>>asList(Keys.CONSTRAINT_8C, Keys.UK_3CND47DLNMG4XI9OQ6JNI97X3, Keys.UK_E9FRUVR3H2998KELNJ73YM6CY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<PatronRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PatronRecord, ?>>asList(Keys.FK_PATRON_GROUP, Keys.FK_PATRON_PATRONTYPE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Patron as(String alias) {
        return new Patron(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Patron as(Name alias) {
        return new Patron(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Patron rename(String name) {
        return new Patron(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Patron rename(Name name) {
        return new Patron(name, null);
    }
}
