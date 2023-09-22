package com.dpk.problems.companies.aspectcap;

import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PriceHolder {
    private final ConcurrentMap<String, BigDecimal> latestPrices;
    private final ConcurrentMap<String, Boolean> priceChangedFlags;

    private final ReentrantLock lock = new ReentrantLock();

    public PriceHolder() {
        latestPrices = new ConcurrentHashMap<>();
        priceChangedFlags = new ConcurrentHashMap<>();
    }

    /**
     * Question-1
     */
    public <T, R> List<R> map(Function<T, R> f, List<T> l) {
        return l.stream().map(f).collect(Collectors.toList());
    }

    /**
     * Question-2
     */
    public void putPrice(String e, BigDecimal p) {
        lock.lock();

        try {
            // Update the priceChanged flag if the key doesn't exist or the value is different
            if(!latestPrices.containsKey(e) || !latestPrices.get(e).equals(p)) {
                priceChangedFlags.put(e, true);
                latestPrices.put(e, p);
            }

        } finally {
            lock.unlock();
        }
    }

    public BigDecimal getPrice(String e) {
        BigDecimal result = null;

        if(latestPrices.get(e) != null) {
            result = latestPrices.get(e);

            if(hasPriceChanged(e)) {
                synchronized (this) {
                    // Double-checking here to handle race conditions
                    if(hasPriceChanged(e)) {
                        // Set the flag to false as the new value is read
                        priceChangedFlags.put(e, false);
                        return latestPrices.get(e);
                    }
                }
            }
        }

        return result;
    }

    public boolean hasPriceChanged(String e) {
        return priceChangedFlags.getOrDefault(e, false);
    }


    /**
     * Question-3
     */
    public BigDecimal waitForNextPrice(String e) throws InterruptedException {
        BigDecimal result = latestPrices.get(e);
        if (result != null) {
            if (!hasPriceChanged(e)) {
                // Wait until the entity is updated
                synchronized (this) {
                    Thread.sleep(200);
                    while (!hasPriceChanged(e)) {
                        this.wait();
                        Thread.sleep(200);
                    }
                }
                // Waiting finished
            }
            result = getPrice(e);
        }

        return result;
    }
}
