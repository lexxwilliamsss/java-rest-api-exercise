package com.cbfacademy.restapiexercise.ious;

import java.util.UUID;
import java.time.Instant;
import java.math.BigDecimal;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="ious")

public class IOU{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String borrower;
    private String lender;
    private BigDecimal amount;
    private Instant dateTime;



public IOU(String borrower, String lender, BigDecimal amount, Instant dateTime){
    id = UUID.randomUUID();
    this.borrower = borrower;
    this.lender = lender;
    this.amount = amount;
    this.dateTime = dateTime;
}

public IOU() {
    this(null,null,BigDecimal.ZERO,Instant.now());
}

public UUID getId() {
    return id;

}    


public String getBorrower() {
    return borrower;

}

public void setBorrower(String borrower){
    this.borrower = borrower;

}

public String getLender(){
    return lender;

}

public void setLender(String lender){
    this.lender = lender;

}

public BigDecimal getAmount(){
    return amount;

}

public void setAmount(BigDecimal amount){
    this.amount = amount;
}

public Instant getdateTime(){
    return dateTime;

}

public void setdateTime(Instant dateTime){
    this.dateTime = dateTime;
}

public static void setId(IOU updatedIOU) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setId'");
}


}
