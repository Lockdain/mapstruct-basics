package app.pojo.transaction;

public class TransactionDTO {
    private String uuid;
    private Long totalInCents;

    @Override
    public String toString() {
        return "TransactionDTO{" +
                "uuid='" + uuid + '\'' +
                ", totalInCents=" + totalInCents +
                '}';
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Long getTotalInCents() {
        return totalInCents;
    }

    public void setTotalInCents(Long totalInCents) {
        this.totalInCents = totalInCents;
    }
}