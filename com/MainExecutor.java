package com;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;


public class MainExecutor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> {
            System.out.println("Thread name : " + Thread.currentThread().getName());
        });
        System.out.println("Thread name : " + Thread.currentThread().getName());

        executorService.submit(() -> {
            System.out.println("Thread Name : " + Thread.currentThread().getName());
        });

        Callable<Integer> task = () ->{
            try{
                TimeUnit.SECONDS.sleep(1);
                return 123;
            }catch(InterruptedException e){
                throw new IllegalStateException("Task interrupted", e);
            }
        };
        ExecutorService service = Executors.newFixedThreadPool(3);
        Future<Integer> integerFuture = service.submit(task);

        System.out.println("Is Completed: " + integerFuture.isDone());
        Integer result = null;
        try {
            result = integerFuture.get();    
        } catch (InterruptedException | ExecutionException e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
        System.out.println("Future Done: " + integerFuture.isDone());
        System.out.println("Result: " + result);

        service.shutdown();

        
    }
    
    
}
