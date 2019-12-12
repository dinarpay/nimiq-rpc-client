package com.nimiq;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Details on a network peer.
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PeerInfo {

    public enum AddressState {
        NEW(1), ESTABLISHED(2), TRIED(3), FAILED(4), BANNED(5);

        private int number;

        AddressState(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        @JsonCreator
        public static AddressState fromNumber(int number) {
            for (AddressState state : AddressState.values()) {
                if (state.getNumber() == number) {
                    return state;
                }
            }
            return null;
        }
    }

    public enum ConnectionState {
        NEW(1), CONNECTING(2), CONNECTED(3), NEGOTIATING(4), ESTABLISHED(5), CLOSED(6);

        private int number;

        ConnectionState(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        @JsonCreator
        public static ConnectionState fromNumber(int number) {
            for (ConnectionState state : ConnectionState.values()) {
                if (state.getNumber() == number) {
                    return state;
                }
            }
            return null;
        }
    }

    /** Peer id. */
    private String id;

    /** Peer address. (URL) */
    private String address;

    /** Address state. */
    private AddressState addressState;

    /** Connection state. */
    private ConnectionState connectionState;

    /** Version. */
    private int version;

    /** Time offset. (ms) */
    private long timeOffset;

    /** Hash of the head block the peer is on. */
    private String headHash;

    /** Network latency. (ms) */
    private long latency;

    /** Bytes received. */
    private long rx;

    /** Bytes sent. */
    private long tx;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public AddressState getAddressState() {
        return addressState;
    }

    public void setAddressState(AddressState addressState) {
        this.addressState = addressState;
    }

    public ConnectionState getConnectionState() {
        return connectionState;
    }

    public void setConnectionState(ConnectionState connectionState) {
        this.connectionState = connectionState;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public long getTimeOffset() {
        return timeOffset;
    }

    public void setTimeOffset(long timeOffset) {
        this.timeOffset = timeOffset;
    }

    public String getHeadHash() {
        return headHash;
    }

    public void setHeadHash(String headHash) {
        this.headHash = headHash;
    }

    public long getLatency() {
        return latency;
    }

    public void setLatency(long latency) {
        this.latency = latency;
    }

    public long getRx() {
        return rx;
    }

    public void setRx(long rx) {
        this.rx = rx;
    }

    public long getTx() {
        return tx;
    }

    public void setTx(long tx) {
        this.tx = tx;
    }

    @Override
    public String toString() {
        return "PeerInfo [address=" + address + ", addressState=" + addressState + ", connectionState="
                + connectionState + ", headHash=" + headHash + ", id=" + id + ", latency=" + latency + ", rx=" + rx
                + ", timeOffset=" + timeOffset + ", tx=" + tx + ", version=" + version + "]";
    }
}
