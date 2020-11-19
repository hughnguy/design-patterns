package com.creational.objectpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Allows the reuse of objects that are expensive to create. A pool helps to manage available resources in a better way.
 * When an object is taken from the pool, it is not available in the pool until it is put back.
 *
 * We don't want a process to have to wait for a particular object to be released, so the
 * Object Pool also instantiates new objects as they are required, but must also implement a facility to clean up unused objects periodically.
 *
 * Object pools are usually implemented as Singletons
 *
 * Advantages:
 * - It boosts the performance of the application significantly.
 * - It is most effective in a situation where the rate of initializing a class instance is high.
 * - It manages the connections and provides a way to reuse and share them.
 * - It can also provide the limit for the maximum number of objects that can be created.
 */
public class Main {
    private ObjectPool<ExportingProcess> pool;
    private final AtomicLong processNo = new AtomicLong(0);

    public void createPool() {
        pool = new ObjectPool<>(4, 10, 5) {
            protected ExportingProcess createObject() {
                return new ExportingProcess(processNo.incrementAndGet());
            }
        };
    }
    public void destroyPool() {
        pool.shutdown();
    }

    public void testObjectPool() {
        ExecutorService executor = Executors.newFixedThreadPool(8);

        // execute 8 tasks in separate threads
        // each of these tasks will borrow a process from the pool
        executor.execute(new ExportingTask(pool, 1));
        executor.execute(new ExportingTask(pool, 2));
        executor.execute(new ExportingTask(pool, 3));
        executor.execute(new ExportingTask(pool, 4));
        executor.execute(new ExportingTask(pool, 5));
        executor.execute(new ExportingTask(pool, 6));
        executor.execute(new ExportingTask(pool, 7));
        executor.execute(new ExportingTask(pool, 8));

        executor.shutdown();

        try {
            executor.awaitTermination(30, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Main op = new Main();
        op.createPool();
        op.testObjectPool();
        op.destroyPool();
    }
}
