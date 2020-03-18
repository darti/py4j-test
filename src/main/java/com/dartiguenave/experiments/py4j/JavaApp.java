package com.dartiguenave.experiments.py4j;

import py4j.GatewayServer;

public class JavaApp {

    public static void main(String[] args) {
        GatewayServer server = new GatewayServer();
        server.start();

        final PythonComputer computationService = (PythonComputer) server.getPythonServerEntryPoint(new Class[]{PythonComputer.class});

        try {
            String hello = computationService.sayHello("Matthieu");
            System.out.println(hello);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        server.shutdown();
    }
}
