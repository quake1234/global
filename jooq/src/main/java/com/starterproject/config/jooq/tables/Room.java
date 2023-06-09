/*
 * This file is generated by jOOQ.
 */
package com.starterproject.config.jooq.tables;


import com.starterproject.config.jooq.EdMex;
import com.starterproject.config.jooq.Keys;
import com.starterproject.config.jooq.tables.records.RoomRecord;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Room extends TableImpl<RoomRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ed_mex.room</code>
     */
    public static final Room ROOM = new Room();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoomRecord> getRecordType() {
        return RoomRecord.class;
    }

    /**
     * The column <code>ed_mex.room.idroom</code>.
     */
    public final TableField<RoomRecord, Integer> IDROOM = createField(DSL.name("idroom"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ed_mex.room.patient_name</code>.
     */
    public final TableField<RoomRecord, String> PATIENT_NAME = createField(DSL.name("patient_name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>ed_mex.room.patiente_surname</code>.
     */
    public final TableField<RoomRecord, String> PATIENTE_SURNAME = createField(DSL.name("patiente_surname"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    private Room(Name alias, Table<RoomRecord> aliased) {
        this(alias, aliased, null);
    }

    private Room(Name alias, Table<RoomRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ed_mex.room</code> table reference
     */
    public Room(String alias) {
        this(DSL.name(alias), ROOM);
    }

    /**
     * Create an aliased <code>ed_mex.room</code> table reference
     */
    public Room(Name alias) {
        this(alias, ROOM);
    }

    /**
     * Create a <code>ed_mex.room</code> table reference
     */
    public Room() {
        this(DSL.name("room"), null);
    }

    public <O extends Record> Room(Table<O> child, ForeignKey<O, RoomRecord> key) {
        super(child, key, ROOM);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : EdMex.ED_MEX;
    }

    @Override
    public List<UniqueKey<RoomRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_ROOM_PATIENT_IDX);
    }

    @Override
    public Room as(String alias) {
        return new Room(DSL.name(alias), this);
    }

    @Override
    public Room as(Name alias) {
        return new Room(alias, this);
    }

    @Override
    public Room as(Table<?> alias) {
        return new Room(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Room rename(String name) {
        return new Room(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Room rename(Name name) {
        return new Room(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Room rename(Table<?> name) {
        return new Room(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super Integer, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super Integer, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
