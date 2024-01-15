package main.java.person_class;

import person_class.App.Person_class;

class TestPerson {

    /**
     * @param args
     */
    public static void main (String[] args){
        
        Person_class objPerson1 = new Person_class();
        System.out.println("Su nombre es: " + objPerson1.getName());

        Person_class objPerson2 = new Person_class("Juan", 25, 1.7, 'm');
        System.out.println("Su nombre de persona 2 es: " +objPerson2.getName());
    }
}