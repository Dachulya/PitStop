package Transport;

public class Sponsor {
    private final String name;
    private final boolean company;
    private final int supportSum;

    public Sponsor(String name, boolean company, int supportSum) {
        this.name = name;
        this.company = company;
        this.supportSum = supportSum;
    }

    public void invest(){
        System.out.printf("Спонсирует %s заезд суммой %s",
                name,supportSum);

    }
    public String getName() {
        return name;
    }

    public boolean isCompany() {
        return company;
    }

    public int getSupportSum() {
        return supportSum;
    }
}
