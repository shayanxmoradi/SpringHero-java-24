package org.example.springherojava24.core.beanscope.scopes;

import org.springframework.stereotype.Service;

import java.time.LocalTime;
@Service // by defualt is singleton
public class SingletonMessageService {

    private final String creationTime;

    public SingletonMessageService() {
        this.creationTime = LocalTime.now().toString();
        System.out.println("SingletonMessageService: Bean CREATED at " + creationTime);
    }

    public void showMessage(String message) {
        System.out.println("SingletonMessageService (created at " + creationTime + "): " + message);
    }

    public String getCreationTime() {
        return creationTime;
    }
}

