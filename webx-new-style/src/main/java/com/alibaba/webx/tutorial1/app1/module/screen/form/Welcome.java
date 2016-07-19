package com.alibaba.webx.tutorial1.app1.module.screen.form;

import com.alibaba.citrus.turbine.Context;
import com.alibaba.citrus.turbine.dataresolver.Param;

public class Welcome {
    public void execute(@Param("name") String name, Context context) {
        context.put("name", name);
    }
}