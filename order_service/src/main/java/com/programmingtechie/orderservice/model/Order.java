package com.programmingtechie.orderservice.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Table(name = "t_orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Long id;
    @Column(name = "order_number")
    String orderNumber;
    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "list_order_item")
    List<OrderLineItems> orderLineItemsList;

}
