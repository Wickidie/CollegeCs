
public class App {
    public static class Datainput {
        private double weight;
        private double height;
        private double bmiresult;

        public Datainput(double weight, double height) {
            this.weight = weight;
            this.height = height;
        }

        public double getWeight() {
            return weight;
        }

        public void SetWeight(double weight) {
            this.weight = weight;
        }

        public void SetHeight(double height) {
            this.height = height;
        }

        public double getHeight() {
            return height;
        }

        public void SetBmiresult(double bmiresult) {
            this.bmiresult = bmiresult;
        }

        public double getBmiresult() {
            return bmiresult;
        }

        void calculate() {
            bmiresult = weight / (height * height);
            System.out.println(bmiresult);

            if (bmiresult < 18.5) {
                System.out.println("Underweight");
            } else if (bmiresult >= 18.5 && bmiresult <= 24.9) {
                System.out.println("Healthy");
            } else if (bmiresult >= 25 && bmiresult <= 29.9) {
                System.out.println("Overweight");
            } else {
                System.out.println("Obese");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Datainput john = new Datainput(60, 1.74);
        john.calculate();

    }
}
