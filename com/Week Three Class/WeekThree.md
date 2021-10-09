# Week Three

## Exception Handling

```java
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainExceptionHandling {
    public static void main(String[] args) {
        // print("test");
        
        try {
            FileInputStream inputStream = new FileInputStream("input.txt");
            System.out.println(inputStream);
            
        } catch (FileNotFoundException ignored ) {
            //TODO: handle exception
            System.out.println("File not Found");
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz: ");
        int num = -1;
        try {
            num = scanner.nextInt();

        } catch(Exception e ){
            System.out.println("Input Hatalı");
        }finally{
            System.out.println("Her Zaman Çalışır");
        }

        if(num != -1){
            System.out.println("Input is : " + num);    
        }

        scanner.close();

    }

    public static void print(String name){
        print(name);
    }
}
```

## Multi-Threading

```java
public class MainThread {
    public static void main(String[] args) {
        /*longTask();
        System.out.println("After Long Task. Thread name : " + Thread.currentThread().getName());
        */
        System.out.println("Uzun işlem başlatılıyor.");
        Thread thread = new Thread(MainThread::longTask);
        thread.start();
        System.out.println("Thread çalıştı...");
    }

    static void longTask(){
        try{
            Thread.sleep(10000);
            System.out.println("Uzun işlem sonlandı. Thread name : " + Thread.currentThread().getName());
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
}

public class MainThread2 {
    public static void main(String[] args) {
        Thread thread = new Thread(MainThread2::print);
        Thread thread2 = new Thread(MainThread2::print);
        thread.start();
        thread2.start();
        System.out.println(Thread.currentThread().getName());
    }
    
    public static void print(){
        for(int i = 0; i < 100; i++){
            System.out.printf("Count :  %d Thread Name : %s \n", i,Thread.currentThread().getName());
        }
    }
}
```

### Executors

```java
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

```
