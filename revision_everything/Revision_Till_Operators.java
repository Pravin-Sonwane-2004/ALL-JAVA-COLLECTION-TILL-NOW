package revision_everything;
public class Revision_Till_Operators {
        double length;
        double width;
        //default constructor
        Revision_Till_Operators () {
            this.length = 1.0;
            this.width = 1.0;
        }
        //parameterized constructor
        Revision_Till_Operators (double length , double width) {
            this.length = length;
            this.width = width;
        }
        //calculate area
        double calculatearea () {
            return this.length*this.width;
        }
        //calculate parameter
        double calculateparameter () {
            return 2*(this.length * this.width);
        }
        double addtotal (Revision_Till_Operators other) {
            return this.calculatearea() + other.calculatearea();
        }

        public static void main(String[] args) {
            //using default constructor
            Revision_Till_Operators react1 = new Revision_Till_Operators();
            System.out.println("Constructor : " + react1.calculatearea());
            System.out.println("parameter : "+react1.calculateparameter());

            //using parameterized constructor
            Revision_Till_Operators react2 = new Revision_Till_Operators(4.0,5.0);
            System.out.println("Rectangle 2 : " + react2.calculatearea());
            System.out.println("Rectangle 2 : " + react2.calculateparameter());

            //adding area of two rectangle
            double totalArea = react1.addtotal(react2);
            System.out.println("total area of both rect : " + totalArea);
    }
} 