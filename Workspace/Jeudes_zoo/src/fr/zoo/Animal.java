package fr.zoo;

public abstract  class Animal implements IAnimal {
   private int count;

   public Animal(int count){
       this.count++;
   }

    @Override
    public void manger() {

    }

    @Override
    public void nager() {

    }

    @Override
    public void voler() {

    }
}
