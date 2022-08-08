package com.techprimers.lazy;

import org.springframework.stereotype.Service;

//@Lazy
@Service
public class LazyService {
//LazyService Definition
    public LazyService() {
        System.out.println("Lazy Service:: Constructor loaded properly");
    }

    public String hello() {
        return "hello Sayan! Nice to see you";
    }
}
