package bsu.gof.factory;

public abstract class ComputerFactory {
    public abstract Computer createComputer();
    public abstract Motherboard createMotheboard();
    public abstract ROM createROM();
    public abstract CPU createCPU();
    
    public static ComputerFactory 
                   getInstance(ComputerType ctype) {
       ComputerFactory cf = null; 
       switch(ctype) {
       case MAC:
       cf = new MACFactory();
       break;
       case PC:
       cf = new PCFactory(); 
       break;
       case SPARC:
       cf = new SPARCFactory(); 
           break;
       }
       return cf;
    }
    
}

