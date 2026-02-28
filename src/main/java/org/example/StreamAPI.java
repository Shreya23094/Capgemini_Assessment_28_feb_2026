package org.example;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPI{


    public void streamAPIQuestions(){
        List<Owner> owner = CarRepository.getOwners();
        List<Car> car = CarRepository.getCars();

        //Questions :

        // 1. Return the list of names of the owners currently having no cars
        List<String> names = owner.stream()
                .filter(o -> o.getCars() == null || o.getCars().isEmpty())
                .map(Owner::getName)
                .collect(Collectors.toList());
        names.stream().forEach(System.out::println);

        // 2. create a map of name of person and number of cars he/she owns
        Map<String, Integer> map = owner.stream()
                .collect(Collectors.toMap(
                        Owner::getName,
                        o -> o.getCars() == null ? 0 : o.getCars().size()
                ));
        System.out.println(map);

        // 3. List cars not owned by any one
        List<Car> unownedCars = car
                .stream()
                .filter(c -> !owner.stream()
                        .filter(o -> o.getCars() != null)
                        .flatMap(o -> o.getCars().stream())
                        .collect(Collectors.toList()).contains(c))
                .collect(Collectors.toList());
        unownedCars.forEach(System.out::println);
    }
}







