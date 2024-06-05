package com.example.praktikum_4mobile;

import java.util.ArrayList;

public class DataSource {
    public static ArrayList<User> users = generateDummyUsers();
    private static ArrayList<User> generateDummyUsers() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Nova", "INTJ", "The Analysts personality group in the MBTI consists of four types: INTJ, INTP, ENTJ, and ENTP. Analysts are often independent thinkers who enjoy intellectual challenges and exploring new ideas. They are driven by a quest for knowledge and are motivated by finding creative solutions to complex problems.", R.drawable.intj, R.drawable.analysts));
        users.add(new User("Nilo", "ISTJ", "The Sentinels personality group in the MBTI comprises four types: ISTJ, ISFJ, ESTJ, and ESFJ. They excel in organizing tasks, following established procedures, and ensuring that responsibilities are fulfilled. They prioritize loyalty, harmony, and cooperation in their interactions with others.", R.drawable.istj, R.drawable.sentinels));
        users.add(new User("Nara", "INFP", "The Diplomats personality group in the MBTI consists of four types: INFJ, INFP, ENFJ, and ENFP. These individuals are characterized by their empathy, idealism, and focus on human potential. Diplomats are often described as compassionate, insightful, and passionate about making a positive difference in the world.", R.drawable.infp, R.drawable.diplomats));
        users.add(new User("Niki", "ISFP", "The Explorers personality group in the MBTI comprises four types: ISTP, ISFP, ESTP, and ESFP. These individuals are characterized by their spontaneity, adaptability, and hands-on approach to life. Explorers are known for their love of excitement, variety, and new experiences. Explorers value freedom, autonomy, and living life to the fullest, and embracing opportunities for personal growth and self-expression.", R.drawable.isfp, R.drawable.explorers));
        return users;
    }
}
