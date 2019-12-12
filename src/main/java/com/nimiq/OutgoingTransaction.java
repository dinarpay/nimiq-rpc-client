package com.nimiq;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Details on a transaction that is not yet sent.
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OutgoingTransaction {

    /** The address the transaction is send from. */
    private String from;

    /**
     * (optional, default: 0, Account.Type.BASIC) The account type at the given
     * address (BASIC: 0, VESTING: 1, HTLC: 2).
     */
    private Account.Type fromType;

    /** The address the transaction is directed to. */
    private String to;

    /**
     * (optional, default: 0, Account.Type.BASIC) The account type at the given
     * address (BASIC: 0, VESTING: 1, HTLC: 2).
     */
    private Account.Type toType;

    /** Integer of the value (in smallest unit) sent with this transaction. */
    private long value;

    /** Integer of the fee (in smallest unit) for this transaction. */
    private long fee;

    /** Hex-encoded contract parameters or a message. */
    private String data;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public Account.Type getFromType() {
        return fromType;
    }

    public void setFromType(Account.Type fromType) {
        this.fromType = fromType;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Account.Type getToType() {
        return toType;
    }

    public void setToType(Account.Type toType) {
        this.toType = toType;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public long getFee() {
        return fee;
    }

    public void setFee(long fee) {
        this.fee = fee;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "OutgoingTransaction [data=" + data + ", fee=" + fee + ", from=" + from + ", fromType=" + fromType
                + ", to=" + to + ", toType=" + toType + ", value=" + value + "]";
    }
}
