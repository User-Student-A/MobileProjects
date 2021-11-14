package com.example.myapplication;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;
    public static final Drink[] drinks = {
            new Drink(  "Латте",
                    "Кофейный напиток родом из Италии, состоящий из молока и кофе эспрессо",
                              R.drawable.latte
            ),
            new Drink(  "Al-Cappuccino",
                    "Кофейный напиток итальянской кухни на основе эспрессо с добавлением в него подогретого вспененного молока",
                              R.drawable.cappuccino
            ),
            new Drink(  "Фильтр-Кофе",
                    "Кофе, приготовленный методом однократного пролива горячей воды через находящийся на фильтре слой молотого кофе",
                              R.drawable.filter
            ),
            new Drink(  "Сильный",
                    "Самое крепкое кофе на районе! Попробовал - сразу сердечко вылетело!",
                    R.drawable.strong
            )
    };

    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}
