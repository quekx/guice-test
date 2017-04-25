package com.qkx.test.message.samples.single;

import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

/**
 * Created by qkx on 17/4/25.
 */
public class SingleSample {
    public static void main() {
        Injector injector = Guice.createInjector(new Module() {
            public void configure(Binder binder) {
            }
        });
        SingleHolder singleHolder = injector.getInstance(SingleHolder.class);
        singleHolder.f();
    }
}
