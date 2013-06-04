package bsu.gof.factory;

public abstract class Creator {
    /*public abstract Computer createComputer();
    public abstract Motherboard createMotherboard();
    public abstract ROM createROM();
    public abstract CPU createCPU();*/
    
    public abstract Computer factoryMethod();
    
    public static Creator
                   getInstance(ComputerType ctype) {
       Creator cf = null; 
       switch(ctype) {
       case MAC:
       cf = new MACCreator();
       break;
       case PC:
       cf = new PCCreator(); 
           break;
       }
       return cf;
    }
}
