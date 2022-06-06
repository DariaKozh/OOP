package animals;

public class Main {
    //В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
    // В цикле отправляйте их на прием к ветеринару.
    public static void main(String[] args) {

        Dog dog = new Dog("косточки", "квартира Феди", "Шарик");
        Cat cat = new Cat("мясо", "квартира Оли", "Пушок");
        Veterinarian vet = new Veterinarian("врач Илья", 36);

        Animal[] animalsArray = {dog, cat};
        for (int i = 0; i < animalsArray.length; i++){
            vet.treatAnimal(animalsArray[i]);
        }
    }
}
