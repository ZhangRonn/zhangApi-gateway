
package com.zhang.zhangapigateway.provider;


public interface DemoService {

    String sayHello(String name);

    String sayHello2(String name);

   /* default CompletableFuture<String> sayHelloAsync(String name) {
        return CompletableFuture.completedFuture(sayHello(name));
    }*/

}
