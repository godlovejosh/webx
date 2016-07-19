package com.alibaba.webx.tutorial1.app1.module.screen.list;

import com.alibaba.citrus.turbine.Context;

public class Default {
    public void execute(Context context) {
        context.put("list", new String[] {
                "Adobe Photoshop",
                "Adobe Acrobat",
                "Adobe Lightroom",
                "Apple Aperture",
                "Microsoft Office",
                "IntelliJ IDEA",
                "<<\"Objective-C\"指南>>"
        });
    }
}