package br.trabalhopadroes2.strategy;

public class LoggerFile implements LoggerStrategy {

	@Override
	public String registraLog(LoggerEventView loggerEvent) {
    	String s = "";    
	    s = ("LOGFile :: " + loggerEvent.getDadosLog());  
        return s;  
    }
}
