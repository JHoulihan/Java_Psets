package City;

import java.util.Scanner;

public class SortCity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number the number of cities: ");
        int num = Integer.parseInt(sc.nextLine());

        City[] cities = new City[num];

        

        for(int i = 0; i<cities.length; i++){
            String name = sc.nextLine();
            double area = Double.parseDouble(sc.nextLine());
            int pop = Integer.parseInt(sc.nextLine());

                cities[i] = new City(name, area, pop);
            }

                sc.close();
        
                sortCity(cities);
        }
        
        //sorting method, if statement orders city objects by area descending in size
        public static void sortCity(City data[]){
            for(int i=1; i<data.length;i++){
            
                for(int j=0;j<data.length-1;j++){
            
                    if(data[j].getArea()<data[j+1].getArea()){
                    City temp=data[j+1];
                    data[j+1]=data[j];
                    data[j]=temp;
                    }
                }
            }
            printCity(data);
        }

        //printing method to display the sorted city, gets called in the sort method 
        //after sorting
        public static void printCity(City data[]){
            for(int i=0; i<data.length; i++){
                System.out.println(data[i].toString());
            }
        }

}
