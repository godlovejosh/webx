package com.alibaba.webx.tutorial1.app1.module.screen.multievent;

/**
 * Screen方法可带有返回值。
 * <p/>
 * 这个screen所返回的对象将被转换成json格式，并输出到用户浏览器。
 *
 * @author Wuxing
 */
public class SayHello2 {
    /** 英文 */
    public Hello doEnglish() {
        return new Hello("English", "Hello");
    }

    /** 中文 */
    public Hello doChinese() {
        return new Hello("Chinese", "你好");
    }

    /** 法语 */
    public Hello doFrench() {
        return new Hello("French", "Bonjour");
    }

    /** 西班牙语 */
    public Hello doSpanish() {
        return new Hello("Spanish", "Hola");
    }

    public static class Hello {
        private String language;
        private String howToSay;

        public Hello(String language, String howToSay) {
            this.language = language;
            this.howToSay = howToSay;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getHowToSay() {
            return howToSay;
        }

        public void setHowToSay(String howToSay) {
            this.howToSay = howToSay;
        }
    }
}