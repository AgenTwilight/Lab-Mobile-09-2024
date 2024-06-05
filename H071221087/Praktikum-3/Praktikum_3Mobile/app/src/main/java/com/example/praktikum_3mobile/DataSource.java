package com.example.praktikum_3mobile;

import java.util.ArrayList;

public class DataSource {
    public static ArrayList<User> users = generateDummyUsers();

    private static ArrayList<User> generateDummyUsers() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("ProsePalettePages", "Explore the world through infinite pages. Books are windows into the imagination", R.drawable.profile1, R.drawable.igbook1, R.drawable.igbook1, "12908", "38273" ));
        users.add(new User("QuillAndQuest", "Among the fragile pages, I found unexpected strength. Books are faithful companions on life's journey.", R.drawable.profile2, R.drawable.profile2, R.drawable.igbook2, "1234", "24820"));
        users.add(new User("LiteraryLabyrinth", "Every page is a new adventure awaiting. Prepare yourself to soar far with words", R.drawable.profile3, R.drawable.igbook3, R.drawable.igbook3, "12908", "38273" ));
        users.add(new User("VerseVoyager", "In a world where time rushes by, books are eternal sanctuaries. Let's immerse ourselves in unforgettable stories", R.drawable.profile4, R.drawable.igbook4, R.drawable.igbuk, "12908", "38273" ));
        users.add(new User("StoryscapeSiren", "When the real world feels too heavy, there's joy in escaping into the realm of imagination. Books are my refuge.", R.drawable.profile5, R.drawable.igbook5, R.drawable.post1, "12908", "38273" ));
        users.add(new User("NovelNestling", "Through words, we can explore the past, feel the present, and envision the future. That's the charm of books", R.drawable.profile6, R.drawable.igbook6, R.drawable.igbook1, "12908", "38273" ));
        users.add(new User("PageTurnerPilgrim", "Every book is a story waiting to be unveiled. Let yourself be enchanted by the magic of words", R.drawable.profile7, R.drawable.igbook1, R.drawable.igbook7, "12908", "38273" ));
        users.add(new User("InkwellInsight", "In every page, there's a treasure trove of knowledge and wisdom. Let's explore the world with books as our compass", R.drawable.profile8, R.drawable.igbook8, R.drawable.post2, "12908", "38273" ));
        users.add(new User("BibliophileBloom", "A book is a boundless journey we can enjoy in the most comfortable place. Let's adventure together", R.drawable.profile9, R.drawable.igbook1, R.drawable.post4, "12908", "38273" ));
        users.add(new User("ChapterChronicler", "Explore the world through infinite pages. Books are windows into the imagination", R.drawable.profile10, R.drawable.igbook12, R.drawable.igbook10, "12908", "38273" ));
        return users;
    }
}
