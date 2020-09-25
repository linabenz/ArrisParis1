package com.projet.arrisparis.controller;

import com.projet.arrisparis.dao.ProduitsDAO;
import com.projet.arrisparis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CommandeController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ProduitsDAO produitsDAO;

   /* @PostMapping("/commande")*/

//    public Order saveOrder(@RequestBody OrderForm orderForm){
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//
//        Client client=new Client();
//        client.setName(orderForm.getClient().getName());
//        client.setEmail(orderForm.getClient().getEmail());
//        client.setAddress(orderForm.getClient().getAddress());
//        client.setPhoneNumber(orderForm.getClient().getPhoneNumber());
//        client.setUsername(orderForm.getClient().getUsername());
//        client=clientRepository.save(client);
//        System.out.println(client.getId());
//
//        Order order=new Order();
//        order.setClient(client);
//        order.setDate(new Date());
//        order=orderRepository.save(order);
//        double total=0;
//        for(OrderProduct p:orderForm.getProducts()){
//            OrderItem orderItem=new OrderItem();
//            orderItem.setOrder(order);
//            Product product=productRepository.findById(p.getId()).get();
//            orderItem.setProduct(product);
//            orderItem.setPrice(product.getCurrentPrice());
//            orderItem.setQuantity(p.getQuantity());
//            orderItemRepository.save(orderItem);
//            total+=p.getQuantity()*product.getCurrentPrice();
//        }
//        order.setTotalAmount(total);
//        return orderRepository.save(order);
//    }

}




