package app.pojo.transaction;

import java.math.BigDecimal;
import java.util.UUID;

public class Transaction {
    private Long id;
    private String uuid = UUID.randomUUID().toString();
    private BigDecimal total;

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", total=" + total +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
