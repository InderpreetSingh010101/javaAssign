package Q_4;

public class factoryMethod {

    public animals chooseAnimal(String animal){
        switch (animal){
            case "CAT":
                return new cat();
            case "DOG":
                return new dog() ;
            case "COW":
                return new cow() ;

        }
        return new dog() ;
    }
}
