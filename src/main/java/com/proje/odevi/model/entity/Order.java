package com.proje.odevi.model.entity;

import lombok.*;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column(name = "order_id",updatable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

}
