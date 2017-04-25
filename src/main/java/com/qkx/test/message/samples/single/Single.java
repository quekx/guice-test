package com.qkx.test.message.samples.single;

import com.google.inject.Singleton;

/**
 * Created by qkx on 17/4/25.
 */
@Singleton
public class Single {
    public void f() {
        System.out.println("This is singleton!");
    }
}
