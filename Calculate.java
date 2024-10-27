package org.example.demo3;
public class Calculate {
    private double weight;
    private double height;
    private double bmi;
    public void calculateBMI() {
        this.bmi = weight / (height * height);

    }
        public double getWeight () {
            return weight;
        }

        public void setWeight ( int weight){
            this.weight = weight;
        }

        public double getHeight () {
            return height;
        }

        public void setHeight ( int height){
            this.height = height;
        }
        public double getResult() {
            return bmi;
         }

        public void setResult(int bmi) {
            this.bmi = bmi;
    }

}