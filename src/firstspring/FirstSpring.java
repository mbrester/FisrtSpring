/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstspring;

import org.springframework.context.support.*;

/**
 *
 * @author mbrester1
 */
public class FirstSpring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       final AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
               new String[] {"applicationContext.xml"});
        
        Owner owner = (Owner)ctx.getBean("owner");
        owner.getPet().speak();
    }
    
}
