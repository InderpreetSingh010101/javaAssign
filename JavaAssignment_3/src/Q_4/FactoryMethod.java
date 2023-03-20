package Q_4;

public class FactoryMethod {

    public Animals chooseAnimal(String animal){
        switch (animal){
            case "CAT":
                return new Cat();
            case "DOG":
                return new Dog() ;
            case "COW":
                return new Cow() ;

        }
        return new Dog() ;
    }
}
