package app.mapperintf;

import app.pojo.transaction.Transaction;
import app.pojo.transaction.TransactionDTO;
import org.mapstruct.Mapper;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

@Mapper(componentModel = "spring")
abstract class TransactionMapper {

    public TransactionDTO toTransactionDTO(Transaction transaction) {
        TransactionDTO transactionDTO = new TransactionDTO();
        transactionDTO.setUuid(transaction.getUuid());
        transactionDTO.setTotalInCents(transaction.getTotal()
                .multiply(new BigDecimal("100"))
                .longValue());
        return transactionDTO;
    }

    // let MapStruct implement this method
    public abstract List<TransactionDTO> toTransactionDTO(Collection<Transaction> transactions);
}
