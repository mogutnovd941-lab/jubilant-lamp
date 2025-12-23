public class Index {
    public static void main(String[] args) {
        Index in = new Index();
        in.calculate();
    }

    public void calculate() {
        double weight = 59;
        double height = 1.87;
        double massIndex = weight / (height * height);

        if (massIndex > 16 && massIndex < 18.5) {
            System.out.println("Дефицит массы тела");
        } else if (massIndex > 18.5 && massIndex < 25) {
            System.out.println("Норма");
        } else if (massIndex > 25 && massIndex < 30) {
            System.out.println("Лишний вес");
        } else if (massIndex > 30 && massIndex < 35) {
            System.out.println("Ожирение 1 степени");
        } else if (massIndex > 35 && massIndex < 40) {
            System.out.println("Ожирение 2 степени");
        } else {
            System.out.println("Ожирение 3 степени");

    }
}}