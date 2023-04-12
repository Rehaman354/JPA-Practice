package com.example.JPA_Practcie;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="card_info")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardNo;
    @Enumerated(EnumType.STRING)
    private Status status;
    private Date expiry;

    //these 3 lines are making the Foreign key cloumn in current class
    @OneToOne//child -> one to user-> one
    @JoinColumn
    private User user;

    public Card(){}

    public Card(int cardNo, Status status, Date expiry) {
        this.cardNo = cardNo;
        this.status = status;
        this.expiry = expiry;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }
}
