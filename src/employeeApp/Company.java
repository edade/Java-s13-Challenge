package employeeApp;

import java.util.Arrays;

public class Company {

    private int id;
    private String name;
    private int giro;
    private  String[] developerNames;

    public Company(int id, String name, int giro, String[] developerNames) {
        this.id = id;
        this.name = name;
       checkGiro(giro);
        this.developerNames = developerNames;
    }

    public void  checkGiro(int giro){
        if(giro<0){
            this.giro=0;
        }else {
            this.giro = giro;
        }
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGiro() {
        return giro;
    }

    public void setGiro(int giro) {
        checkGiro(giro);
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name){
        if(index<0){
            System.out.println("index sıfırdan kucuk olamaz");
        }else{
            try{
                if (developerNames[index]== null) {
                    developerNames[index] = name;}
                else {
                    System.out.println("index doludur");
                }
            }catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("invalid index" + index);
            }
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
