package by.teachmeslills.nikamotors.entity;

import java.util.Objects;

public class Goods {
    public Long id;
    private String code;
    private String name;
    private ProductSubtype subtype;
    private double cost;
    private  int quantityInStock;




    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductSubtype getSubtype() {
        return subtype;
    }

    public void setSubtype(ProductSubtype subtype) {
        this.subtype = subtype;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }



    public enum ProductSubtype{
        PASSENGERCAR,
        THETRUCK;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Goods good)) return false;
        return Double.compare(cost, good.cost) == 0 && quantityInStock == good.quantityInStock && Objects.equals(id, good.id) && Objects.equals(code, good.code) && Objects.equals(name, good.name) && subtype == good.subtype;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, name, subtype, cost, quantityInStock);
    }
}
