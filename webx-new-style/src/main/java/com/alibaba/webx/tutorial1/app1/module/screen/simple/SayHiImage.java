package com.alibaba.webx.tutorial1.app1.module.screen.simple;

import com.alibaba.citrus.service.requestcontext.buffered.BufferedRequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 动态创建二进制图片。
 *
 * @author Wuxing
 */
public class SayHiImage {
    @Autowired
    private HttpServletResponse response;

    @Autowired
    private BufferedRequestContext brc;

    public void execute() throws Exception {
        // 为了节省内存，关闭buffering。
        brc.setBuffering(false);

        // 只要设置了正确的content type，你就可以输出任何文本或二进制的内容：
        // HTML、JSON、JavaScript、JPG、PDF、EXCEL等。
        response.setContentType("image/jpeg");

        OutputStream out = response.getOutputStream();

        writeImage(out);
    }

    private void writeImage(OutputStream out) throws IOException {
        BufferedImage img = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = img.createGraphics();

        g2d.setPaint(Color.red);
        g2d.setFont(new Font("Serif", Font.BOLD, 36));
        g2d.drawString("Hi there, how are you doing today?", 5, g2d.getFontMetrics().getHeight());
        g2d.dispose();

        ImageIO.write(img, "jpg", out);
    }
}