package com.alibaba.webx.tutorial1.app1.module.screen.simple;

import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 这是最简单的页面：不需要模板，直接输出到浏览器，就像最简单的servlet一样。
 *
 * @author Wuxing
 */
public class SayHi {
    @Autowired
    private HttpServletResponse response;

    public void execute() throws Exception {
        // 设置content type，但不需要设置charset。框架会设置正确的charset。
        response.setContentType("text/plain");

        // 如同servlet一样：取得输出流。
        PrintWriter out = response.getWriter();

        out.println("Hi there, how are you doing today?");
    }
}