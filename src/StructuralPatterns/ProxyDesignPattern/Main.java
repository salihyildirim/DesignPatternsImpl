package StructuralPatterns.ProxyDesignPattern;

public class Main {
    public static void main(String [] args){

        CommandExecutor executor = new CommandExecutorProxy("Salih", "0001");
        try {
            executor.runCommand("cd Desktop");
            executor.runCommand("Start discord");
            //executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::"+e.getMessage());
        }

    }
}
