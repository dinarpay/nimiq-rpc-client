package com.nimiq;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Mempool information.
 */
@JsonInclude(Include.NON_NULL)
// @JsonIgnoreProperties(ignoreUnknown = true)
public class Mempool {

    /** Total number of pending transactions in mempool. */
    private int total;

    /**
     * Array containing a subset of fee per byte buckets from [10000, 5000, 2000,
     * 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1, 0] that currently have more than
     * one transaction.
     */
    private int[] buckets;

    /**
     * Number of transactions in the bucket. A transaction is assigned to the
     * highest bucket of a value lower than its fee per byte value.
     */
    @JsonAnySetter
    private Map<String, Integer> transactions = new LinkedHashMap<>();

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int[] getBuckets() {
        return buckets;
    }

    public void setBuckets(int[] buckets) {
        this.buckets = buckets;
    }

    public int getNumberOfTransactions(int bucket) {
        return transactions.getOrDefault(String.valueOf(bucket), 0).intValue();
    }

    @Override
    public String toString() {
        return "Mempool [buckets=" + Arrays.toString(buckets) + ", total=" + total + ", transactions=" + transactions
                + "]";
    }
}
