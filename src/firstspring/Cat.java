/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstspring;

/**
 *
 * @author mbrester1
 * @version 1.0
 */
public class Cat implements Animal{

    @Override
    public void speak() {
        System.out.println("Meow");
    }
    
}
