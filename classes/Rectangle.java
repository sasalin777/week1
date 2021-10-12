package week1.classes;

public class Rectangle {
    int width;
    int height;
    String color;
    Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
            }
    Rectangle() {
        this.width = 1;
        this.height = 1;
        this.color = "Blue";

    }

       void draw() {
        if ((this.width == 0) & (this.height == 0)) {
            for (int i = 1; i <= 1; i++) {
                for (int j = 1; j <= 1; j++) {
                    System.out.print("B");
                }
            }
        } else {
            for (int i = 1; i <= this.height; i++) {
                for (int j = 1; j <= this.width; j++) {
                    {
                        if ((i == 1) & (j ==1)) {

                            if (this.color == "Green")
                            {System.out.print("\033[32m"+"B");}
                            else if (this.color == "Red")
                            {System.out.print("\033[31m"+"B");}
                            else
                            {System.out.print("\033[34m"+"B");}

                        }
                        else
                        {
                            System.out.print("\033[37m"+"B");
                        }
                    }

                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
    }
}