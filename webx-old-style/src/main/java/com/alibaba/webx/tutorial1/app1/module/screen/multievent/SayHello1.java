package com.alibaba.webx.tutorial1.app1.module.screen.multievent;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 这个例子演示了用一个screen类处理多个事件的方法。
 *
 * @author Wuxing
 */
public class SayHello1 {
    @Autowired
    private HttpServletResponse response;

    /** 此方法会在所有的event handler之前执行。 */
    public void beforeExecution() {
        response.setContentType("text/plain");
    }

    /** 此方法会在所有的event handler之后执行。 */
    public void afterExecution() throws IOException {
        response.flushBuffer(); // 此调用并非必须，只是用来演示afterExecution方法而已
    }

    /** 默认语言：英文 */
    public void doPerform() throws IOException {
        doEnglish();
    }

    /** 英文 */
    public void doEnglish() throws IOException {
        response.getWriter().println("English: Hello");
    }

    /** 中文 */
    public void doChinese() throws IOException {
        response.getWriter().println("Chinese: 你好");
    }

    /** 法语 */
    public void doFrench() throws IOException {
        response.getWriter().println("French: Bonjour");
    }

    /** 西班牙语 */
    public void doSpanish() throws IOException {
        response.getWriter().println("Spanish: Hola");
    }
}

