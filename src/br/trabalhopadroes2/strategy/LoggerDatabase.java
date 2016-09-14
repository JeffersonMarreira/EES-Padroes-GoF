package br.trabalhopadroes2.strategy;


public class LoggerDatabase implements LoggerStrategy {
	
    @Override
    public String registraLog(LoggerEventView loggerEvent) {
    	String s = "";    
	    s = ("LOGDatabase :: " + loggerEvent.getDadosLog());  
        return s;  
    }	   
}
