package com.example.myapplication;

public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts = {
            new Workout("Ослабитель Конечностей",
                    "5 отжиманий на руках в стойке\n" +
                             "10 приседаний на 1 ногу\n" +
                             "15 подтягиваний"),
            new Workout("Сердцевинная агония",
                    "100 подтягиваний\n" +
                             "100 отжиманий\n" +
                             "100 приседаний\n" +
                             "100 приседаний"),
            new Workout("Особенный Слабак",
                    "5 подтягиваний\n" +
                             "10 отжиманий\n" +
                             "15 приседаний"),
            new Workout("Прочность и длина",
                    "бег на 500 метров\n" +
                             "качели с гирями 21 х 1,5кг\n" +
                             "21 подтягиваний")
    };

    private Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name;
    }
}
