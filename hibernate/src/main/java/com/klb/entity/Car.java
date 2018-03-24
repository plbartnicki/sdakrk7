package com.klb.entity;

import javax.persistence.*;

/*
 (id,  cena wypożyczenia, marka, czy wypożyczony)
 */
@Entity
@Table(name="cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="brand")
    private String brand;

    @Column(name="rent")
    private boolean rent;

    public Car() {
    }

    public Car(String brand, boolean rent) {
        this.brand = brand;
        this.rent = rent;
    }

    public Car(Long id, String brand, boolean rent) {
        this.id = id;
        this.brand = brand;
        this.rent = rent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", rent=" + rent +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return id == car.getId();
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + brand.hashCode();
        result = 31 * result + (rent ? 1 : 0);
        return result;
    }
}
