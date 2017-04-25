package com.qkx.test.message.samples.single;

import com.google.inject.Inject;

/**
 * Created by qkx on 17/4/25.
 */
public class SingleHolder {
    @Inject
    Single single;

    public void f() {
        single.f();
    }
}
