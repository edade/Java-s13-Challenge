package employeeApp;

import employeeApp.enums.Plan;

import java.util.Arrays;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
    Healthplan h1 = new Healthplan(1,"Ahmet", Plan.BASIC);
    Healthplan h2 = new Healthplan(2,"Mehmet", Plan.MEDIUM);
        System.out.println(h1);
        System.out.println(h2);

        String[] healthplan = new String[3];
        healthplan[0]= h1.getName();
        healthplan[1]=h2.getName();
    Employee e1= new Employee(3,"Eda","eda@fds.com","qwert", healthplan);
    e1.addHealthplan(2,"Ece");
    e1.addHealthplan(3,"seda");

        System.out.println(Arrays.toString(e1.getHealthplan()));
        System.out.println(e1);

    Company c1 = new Company(4,"yazılım a.ş", 345632,new String[]{"Ayşe", "Eda","Dogancan"});
        System.out.println(c1);
    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
