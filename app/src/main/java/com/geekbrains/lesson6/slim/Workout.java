package com.geekbrains.lesson6.slim;

class Workout {
    private String name;
    private String description;
    private int imageResourceId;

    static final Workout[] workouts = {
            new Workout(SlimApp.context.getString(R.string.riveting_name),
                    SlimApp.context.getString(R.string.riveting),
                    R.drawable.riveting),
            new Workout(SlimApp.context.getString(R.string.kick_back_name),
                    SlimApp.context.getString(R.string.kick_back),
                    R.drawable.kickback),
            new Workout(SlimApp.context.getString(R.string.squat_name),
                    SlimApp.context.getString(R.string.squat),
                    R.drawable.squat),
            new Workout(SlimApp.context.getString(R.string.twists_name),
                    SlimApp.context.getString(R.string.twists),
                    R.drawable.twists),
            new Workout(SlimApp.context.getString(R.string.jumping_name),
                    SlimApp.context.getString(R.string.jumping),
                    R.drawable.jumping),
            new Workout(SlimApp.context.getString(R.string.boat_name),
                    SlimApp.context.getString(R.string.boat),
                    R.drawable.boat),
            new Workout(SlimApp.context.getString(R.string.twisting_name),
                    SlimApp.context.getString(R.string.twisting),
                    R.drawable.twisting)
    };

    // В объекте Workout хранится имя и описание
    private Workout(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    String getName() {
        return name;
    }

    String getDescription() {
        return description;
    }

    int getImageResourceId() {
        return imageResourceId;
    }
}

