package io.github.alissonlima.db;

public class WalletEntity {

    private long id;
    private double value;

    public WalletEntity(long id, double value) {
        this.id = id;
        this.value = value;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
