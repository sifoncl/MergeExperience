package by.javaguru.git.mergeexperience.topics;

import java.util.Optional;

public enum Module1Topics {
    JAKARTA(1, "Jakarta ", "Обзор java enterprise технологий",
            "Jakarta EE (ранее — Java Platform, Enterprise Edition, сокр. Java EE, до " +
                    "версии 5.0 — Java 2 Enterprise Edition или J2EE). В 2018 Eclipse Foundation " +
                    "переименовала Java EE в Jakarta EE — набор спецификаций и соответствующей документации " +
                    "для языка Java, описывающей архитектуру серверной платформы для задач средних " +
                    "и крупных предприятий."),
    MAVEN(2, "Apache Maven ", "Изучение сборщика проектов Maven"),
    TOMCAT(3, "Apache Tomcat ", "Изучение основ HTTP, TCP/IP и web сервера Tomcat"),
    SERVLET(4, "HttpServlet ", "Освоение технологии java сервлетов"),
    GIT(5, "GIT ", "Работа с системой контроля версий GIT");

    private int order;
    private String topic;
    private String desc;
    private String moreInfo;

    public String getMoreInfo() {
        return moreInfo;
    }

    Module1Topics(int order, String topic, String desc, String moreInfo) {
        this.order = order;
        this.topic = topic;
        this.desc = desc;
        this.moreInfo = moreInfo;
    }

    Module1Topics(int order, String topic, String desc) {
        this.order = order;
        this.topic = topic;
        this.desc = desc;
    }

    public int getOrder() {
        return order;
    }

    public String getTopic() {
        return topic;
    }

    public String getDesc() {
        return desc;
    }

    public static String getInfoByOrder(int order) {
        for (Module1Topics module1Topics : Module1Topics.values()) {
            if (module1Topics.getOrder() == order) {
                return module1Topics.moreInfo;
            }
        }
        return null;
    }
}
