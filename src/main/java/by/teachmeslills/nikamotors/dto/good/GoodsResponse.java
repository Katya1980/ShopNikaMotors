package by.teachmeslills.nikamotors.dto.good;

import by.teachmeslills.nikamotors.entity.Goods;

import java.util.Objects;

public class GoodsResponse {
    public Long id;
    private String code;
    private String name;
    private Goods.ProductSubtype subtype;
    private double cost;
    private  int quantityInStock;


    public Long getId() {
        return id;
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

    public Goods.ProductSubtype getSubtype() {
        return subtype;
    }

    public void setSubtype(Goods.ProductSubtype subtype) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GoodsResponse that)) return false;
        return Double.compare(cost, that.cost) == 0 && quantityInStock == that.quantityInStock && Objects.equals(id, that.id) && Objects.equals(code, that.code) && Objects.equals(name, that.name) && subtype == that.subtype;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, name, subtype, cost, quantityInStock);
    }

    @Override
    public String toString() {
        return "GoodsResponse{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", subtype=" + subtype +
                ", cost=" + cost +
                ", quantityInStock=" + quantityInStock +
                '}';
    }
}
