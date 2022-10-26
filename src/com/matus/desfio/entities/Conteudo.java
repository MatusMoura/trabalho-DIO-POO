package com.matus.desfio.entities;

public class Conteudo {

	       public void eat() {

	            System.out.print( "Animal eating;" );

	       }

	  }

	  public class Dog  extends Conteudo {

	       public void eat() {

	            System.out.print( "Dog eating;" );

	       }

	  }
	  public class Tiger extends Conteudo {

	       public void eat() {

	            System.out.print( "Tiger eating;" );

	       }

	  

	    public void makeAnimalEat( Conteudo animal ) {

	         animal.eat();

	    }

	    public static void main( String[] args ) {

	          Main m = new Main();

	          Conteudo animal = new Dog();

	          m.makeAnimalEat((Conteudo) animal);

	          m.makeAnimalEat(animal);

	          animal = new Tiger();

	          m.makeAnimalEat(animal);

	     }

	}

	  


