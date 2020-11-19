package com.creational.objectpool;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public abstract class ObjectPool<T> {
    private ConcurrentLinkedQueue<T> pool;
    private ScheduledExecutorService executorService;

    protected abstract T createObject();

    public ObjectPool(final int minObjects) {
        initialize(minObjects);
    }

    public ObjectPool(
            final int minObjects,
            final int maxObjects,
            final long validationInterval
    ) {
        // initialize pool
        initialize(minObjects);
        // check pool conditions in a separate thread
        executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleWithFixedDelay(() -> {
            int size = pool.size();

            if (size < minObjects) {
                int sizeToBeAdded = minObjects + size;
                for (int i = 0; i < sizeToBeAdded; i++) {
                    pool.add(createObject());
                }
            } else if (size > maxObjects) {
                int sizeToBeRemoved = size - maxObjects;
                for (int i = 0; i < sizeToBeRemoved; i++) {
                    pool.poll();
                }
            }
        }, validationInterval, validationInterval, TimeUnit.SECONDS);
    }

    private void initialize(final int minObjects)  {
        pool = new ConcurrentLinkedQueue<>();
        for (int i = 0; i < minObjects; i++) {
            pool.add(createObject());
        }
    }

    public T borrowObject() {
        T object = pool.poll();
        if (object == null) {
            object = createObject();
        }
        return object;
    }

    public void returnObject(T object) {
        if (object == null) {
            return;
        }
        this.pool.offer(object);
    }

    public void shutdown(){
        if (executorService != null){
            executorService.shutdown();
        }
    }
}
