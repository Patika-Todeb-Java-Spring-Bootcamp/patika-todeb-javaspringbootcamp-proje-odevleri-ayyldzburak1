//package com.odev.odev3.model;
//
//import lombok.*;
//
//import javax.persistence.*;
//
//@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Table(name= "item")
//public class Item {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    //TODO: Learn GenerationType.AUTO
//    //@Column(name = "item_id")
//    private Long itemId;
//    private String name;
//    //private User user;
//    @ManyToOne(fetch = FetchType.LAZY)
//   //@JoinColumn(name = "item_id", referencedColumnName = "order_id")
//    @JoinColumn()
//    private Order order;
//}
