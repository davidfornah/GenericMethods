package com.sapunka;
//Grneric method invoked passing different data types
    public class Main {
        public static class GenericMethodDemo {
            public static void main(String[] args) {

                Integer[] integers = {1, 2, 3, 4, 5};
                Double [] doubles = {1.2, 4.5,3.5};
                String[] strings = {"Freetown", "BO", "Makeni", "Kenema"};

            //  Passing Array of Integer Object to invoke the generic print method
                System.out.println("ARRAY INTEGERS LEAST");
                GenericMethodDemo.print(integers);
                System.out.println("**************************");

            //  Invoke print with an array of string
                System.out.println("ARRAY STRING LEAST");
                GenericMethodDemo.print(strings);
                System.out.println("**************************");

            //  Invock the array of doubles
                System.out.println("ARRAY DOUBLES LEAST");
                GenericMethodDemo.print(doubles);
            }
            public static <E> void print(E[] list) {
                for (E e : list) {
                    System.out.print(e + "");

                    System.out.println();
                }
            }
        }
    }

