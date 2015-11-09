package com.felix;

import com.felix.bar.BarComponent;
import com.felix.foo.FooComponent;
import com.felix.fool.FoolComponent;

/**
 * Created by fsoewito on 11/9/2015.
 *
 */
public class Main {
    public static void main(String[] args) {
        BarComponent bar = new BarComponent();
        FooComponent foo = new FooComponent();
        FoolComponent fool = new FoolComponent();

        bar.bar();
        foo.foo();
        fool.fool();
    }
}
