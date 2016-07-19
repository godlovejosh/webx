package com.alibaba.webx.tutorial1.app1.module.action;

import com.alibaba.citrus.turbine.Navigator;
import com.alibaba.citrus.turbine.dataresolver.FormGroup;
import com.alibaba.webx.tutorial1.app1.Visitor;

public class RegisterAction {
    public void doRegister(@FormGroup("register") Visitor visitor, Navigator nav) {
        String name = visitor.getName();
        nav.redirectTo("app1Link").withTarget("form/welcome").withParameter("name", name);
    }
}