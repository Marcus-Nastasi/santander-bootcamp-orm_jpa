package com.pan.ormJpa;

import com.pan.ormJpa.Models.Destiny;
import com.pan.ormJpa.Models.Reserve;
import com.pan.ormJpa.Models.User;
import com.pan.ormJpa.Repository.DestinyRepository;
import com.pan.ormJpa.Repository.ReserveRepository;
import com.pan.ormJpa.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class App implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ReserveRepository reserveRepository;

    @Autowired
    private DestinyRepository destinyRepository;

    @Override
    public void run(String... args) throws Exception {
        Map<Integer, Integer> userToReserve = new HashMap<>();
        List<User> users = userRepository.findAll();
        List<Reserve> reserves = reserveRepository.findAll();

        for(User u: users) for(Reserve r: reserves) if(r.getId_user() == u.getId()) userToReserve.put(u.getId(), r.getId());

        System.out.println(userToReserve);

        System.out.println("\n");

        List<Destiny> destinies = new ArrayList<>(destinyRepository.findAll());
        destinies.forEach(System.out::println);
        System.out.println("\n");

        destinies.forEach(d -> {
            reserves.forEach(r -> {
                if (r.getId_destiny() == d.getId()) System.out.println(r + "\n" + d + "\n");
            });
        });

        System.out.println(destinyRepository.count());

        /*User user = new User();
        user.setName("Jesus Salamanca");
        user.setEmail("jesus@hotmail.com");
        user.setBirth(LocalDate.of(1987, 3, 1));
        userRepository.save(user);*/

        /*User jesus = userRepository.findById(7).get();
        jesus.setEmail("jesus02@hotmail.com");
        userRepository.save(jesus);*/

        /*User jesus = userRepository.findById(7).get();
        jesus.update("Jesus Salamanca Guerva");
        userRepository.save(jesus);*/

        /*User jesus = userRepository.findById(7).get();
        jesus.update("Jesus Salamanca Guerva", "jesus@hotmail.com");
        userRepository.save(jesus);*/

        System.out.println("\n\n");
        System.out.println(userRepository.findById(7).get());
        System.out.println("\n\n");
    }
}


