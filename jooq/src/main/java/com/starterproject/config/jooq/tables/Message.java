/*
 * This file is generated by jOOQ.
 */
package com.starterproject.config.jooq.tables;


import com.starterproject.config.jooq.EdMex;
import com.starterproject.config.jooq.Keys;
import com.starterproject.config.jooq.tables.records.MessageRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
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
public class Message extends TableImpl<MessageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ed_mex.message</code>
     */
    public static final Message MESSAGE = new Message();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MessageRecord> getRecordType() {
        return MessageRecord.class;
    }

    /**
     * The column <code>ed_mex.message.idRoom</code>.
     */
    public final TableField<MessageRecord, Integer> IDROOM = createField(DSL.name("idRoom"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ed_mex.message.sender</code>.
     */
    public final TableField<MessageRecord, String> SENDER = createField(DSL.name("sender"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>ed_mex.message.message</code>.
     */
    public final TableField<MessageRecord, String> MESSAGE_ = createField(DSL.name("message"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>ed_mex.message.created_date</code>.
     */
    public final TableField<MessageRecord, LocalDateTime> CREATED_DATE = createField(DSL.name("created_date"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field(DSL.raw("CURRENT_TIMESTAMP"), SQLDataType.LOCALDATETIME)), this, "");

    private Message(Name alias, Table<MessageRecord> aliased) {
        this(alias, aliased, null);
    }

    private Message(Name alias, Table<MessageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ed_mex.message</code> table reference
     */
    public Message(String alias) {
        this(DSL.name(alias), MESSAGE);
    }

    /**
     * Create an aliased <code>ed_mex.message</code> table reference
     */
    public Message(Name alias) {
        this(alias, MESSAGE);
    }

    /**
     * Create a <code>ed_mex.message</code> table reference
     */
    public Message() {
        this(DSL.name("message"), null);
    }

    public <O extends Record> Message(Table<O> child, ForeignKey<O, MessageRecord> key) {
        super(child, key, MESSAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : EdMex.ED_MEX;
    }

    @Override
    public UniqueKey<MessageRecord> getPrimaryKey() {
        return Keys.KEY_MESSAGE_PRIMARY;
    }

    @Override
    public List<UniqueKey<MessageRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_MESSAGE_IDROOM_UNIQUE);
    }

    @Override
    public List<ForeignKey<MessageRecord, ?>> getReferences() {
        return Arrays.asList(Keys.IDROOM);
    }

    private transient Room _room;

    /**
     * Get the implicit join path to the <code>ed_mex.room</code> table.
     */
    public Room room() {
        if (_room == null)
            _room = new Room(this, Keys.IDROOM);

        return _room;
    }

    @Override
    public Message as(String alias) {
        return new Message(DSL.name(alias), this);
    }

    @Override
    public Message as(Name alias) {
        return new Message(alias, this);
    }

    @Override
    public Message as(Table<?> alias) {
        return new Message(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Message rename(String name) {
        return new Message(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Message rename(Name name) {
        return new Message(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Message rename(Table<?> name) {
        return new Message(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Integer, ? super String, ? super String, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Integer, ? super String, ? super String, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
