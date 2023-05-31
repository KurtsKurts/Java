package OOP.HW_6.lsp;

public class Program {
    public static void main(String[] args) {

        Bird oT1 = new Bird(); // T
        Bird oT2 = new Bird(); // T
        Bird oT3 = new Bird(); // T

        Duck oS1 = new Duck(); // S
        Duck oS2 = new Duck(); // S
        Penguin oS3 = new Penguin();

        fly(oT1);
        fly(oT2);
        fly(oT3);


        fly(oS1);
        fly(oS2);
        fly(oS3);
    }


    public static void fly(Bird bird){ // T
        try {
            bird.fly();
        }
        catch (Exception e){
            System.out.println("Не удалось запустить птичку в полет.");
        }
    }

}
