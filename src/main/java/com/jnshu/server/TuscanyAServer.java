package com.jnshu.server;

import org.apache.tuscany.sca.node.Node;
import org.apache.tuscany.sca.node.NodeFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @program: ServerA
 * @description: ServerA
 * @author: Mr.xweiba
 * @create: 2018-06-17 21:41
 **/

public class TuscanyAServer implements ServletContextListener {
    private static Logger logger = LoggerFactory.getLogger(TuscanyAServer.class);
/*
    public static void main(String[] args) {
        Node node = NodeFactory.newInstance().createNode("tuscany/tuscanyA.composite");
        node.start();
        logger.debug("TuscanyServer 已启动 ");
    }
*/

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.setProperty("java.rmi.server.hostname", "192.168.0.115");
        Node node = NodeFactory.newInstance().createNode("tuscany/tuscanyA.composite");
        node.start();
        logger.debug("TuscanyServer 已启动 ");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
