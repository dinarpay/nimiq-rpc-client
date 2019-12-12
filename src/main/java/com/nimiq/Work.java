package com.nimiq;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Mining work instructions.
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Work {

    /**
     * Hex-encoded block header. This is what should be passed through the hash
     * function. The last 4 bytes describe the nonce, the 4 bytes before are the
     * current timestamp. Most implementations allow the miner to arbitrarily choose
     * the nonce and to update the timestamp without requesting new work
     * instructions.
     */
    private String data;

    /**
     * Hex-encoded block without the header. When passing a mining result to
     * submitBlock, append the suffix to the data string with selected nonce.
     */
    private String suffix;

    /** Compact form of the hash target to submit a block to this client. */
    private int target;

    /**
     * Field to describe the algorithm used to mine the block. Always nimiq-argon2
     * for now.
     */
    private String algorithm;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public String toString() {
        return "Work [algorithm=" + algorithm + ", data=" + data + ", suffix=" + suffix + ", target=" + target + "]";
    }
}
