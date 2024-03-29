package com.geekshirt.ordenservice.entities;

import com.geekshirt.ordenservice.utils.OrderStatusEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Table(name = "ORDERS")
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ORDER_ID")
    private String orderId;

    @Column(name = "STATUS")
    @Enumerated(value = EnumType.STRING)
    private OrderStatusEnum status;

    @Column(name = "ACCOUNT_ID")
    private String accountId;

    @Column(name = "TOTAL_AMOUNT")
    private Double totalAmount;

    @Column(name = "TOTAL_TAX")
    private Double totalTax;

    @Column(name = "TRANSACTION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "order")
    private List<OrderDetail> detailList;
}
