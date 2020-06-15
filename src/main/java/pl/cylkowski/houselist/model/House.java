package pl.cylkowski.houselist.model;


import javax.persistence.*;

@Entity
@Table
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long house_id;
    private String name;
    private String city;
    private double price;
    private double distance;
    private String houseArea;
    private String plotArea;
    private String link;



    public House() { }

    public House(long house_id, String name, String city, double price, double distance, String houseArea, String plotArea, String link) {
        this.house_id = house_id;
        this.name = name;
        this.city = city;
        this.price = price;
        this.distance = distance;
        this.houseArea = houseArea;
        this.plotArea = plotArea;
        this.link = link;
    }

    public long getHouse_id() {
        return house_id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public double getPrice() {
        return price;
    }

    public double getDistance() {
        return distance;
    }

    public String getHouseArea() {
        return houseArea;
    }

    public String getPlotArea() {
        return plotArea;
    }

    public String getLink() {
        return link;
    }
}
