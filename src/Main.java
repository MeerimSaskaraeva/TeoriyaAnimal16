public class Main {
    public static void main(String[] args) {

        Animal[]animals={new Cow(),new Horse()};
        voice(animals);

    }
    public static void voice(Animal[] animals){
        for (Animal animal : animals) {
            animal.talk();

            if (animal.getClass().equals(Cow.class)){
                ((Cow) animal).sound();
            }else if(animal.getClass().equals(Horse.class)){
                ((Horse) animal).sound();
            }
        }
    }
}
