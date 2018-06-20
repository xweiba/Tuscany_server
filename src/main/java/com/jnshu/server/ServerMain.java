package com.jnshu.server;

import org.apache.tuscany.sca.node.Node;
import org.apache.tuscany.sca.node.NodeFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: SSM_WEB_SERVER
 * @description: 启动服务
 * @author: Mr.xweiba
 * @create: 2018-06-08 12:00
 **/

public class ServerMain {
    private static Logger logger = LoggerFactory.getLogger(ServerMain.class);
    public static void main(String[] args) {
        Node node = NodeFactory.newInstance().createNode("tuscany/tuscanyA.composite");
        node.start();
        logger.debug("TuscanyServer 已启动 ");
    }
}
