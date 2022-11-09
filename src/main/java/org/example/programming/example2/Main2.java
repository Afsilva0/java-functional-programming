package org.example.programming.example2;

import org.example.Main;

public class Main2 {
    public static void main(String[] args) {

            /*
             * Implement the interface functional
             */
            InterfaceFunctional interfaceFunctional= new InterfaceFunctional() {
                @Override
                public void saludar() {
                    System.out.println("Hola mundo");
                }
            };

            interfaceFunctional.saludar();

            /*
             * Implement the interface functional with lambdas
             */

            InterfaceFunctional interfaceFunctional2= () -> System.out.println("Hola mundo 2");
            interfaceFunctional2.saludar();


            /*
             * Implement the interface functional with lambdas
             *  Using method
             */

            InterfaceFunctional interfaceFunctional3 = ()-> System.out.println("Hola Andres");
            Main2 main= new Main2();
            main.miMethod(interfaceFunctional3);

        }

        public void  miMethod(InterfaceFunctional interfaceFunctional){
            interfaceFunctional.saludar();
        }

}
