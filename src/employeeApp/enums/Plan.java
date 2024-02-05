package employeeApp.enums;

public enum Plan {

    BASIC("BASIC", 200),
    MEDIUM("MEDIM" ,400),
    ADVANCE("ADVANCE", 60);

    private String name;
    private  int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
