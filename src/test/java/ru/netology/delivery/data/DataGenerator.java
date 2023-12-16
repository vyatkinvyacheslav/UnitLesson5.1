package ru.netology.delivery.data;

import com.github.javafaker.Faker;
//import lombok.Value;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

public class DataGenerator {
    private DataGenerator() {

    }

    public static String generateDate(int shift) {
        return LocalDate.now().plusDays(shift).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public static String generateCity() {

        var cities = new String[] {"Екатеринбург", "Красноуфимск", "Североуральск", "Карпинск", "Асбест", "Новоуральск"
                , "Кушва", "Кировград", "Лесной", "Дегтярск", "Ивдель", "Реж", "Ирбит", "Камышлов", "Первоуральск"
                , "Алапаевск", "Серов", "Сысерть", "Полевской", "Ревда", "Тавда", "Талица"};
        return cities[new Random().nextInt(cities.length)];
    }

    public static String generateName() {
        //var faker = new Faker(new Locale(locale));
        //Object Name;
       // Name = Faker.Name();
        return faker.name().fullName();


    }

    public static String generatePhone(String locale) {
        var faker = new Faker(new Locale(locale));
        return faker.phoneNumber().phoneNumber();
    }

    public static class Registration {
        private Registration() {
        }




        public String getCity() {
        }

        public String getPhone() {
        }

        public String getName() {
        }
    }
}

