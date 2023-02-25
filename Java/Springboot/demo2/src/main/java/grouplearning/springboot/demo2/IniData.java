package grouplearning.springboot.demo2;

import grouplearning.springboot.demo2.model.Cat;
import grouplearning.springboot.demo2.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class IniData {

    @Autowired
    CatRepository catRepository;

    @PostConstruct
    void initCat() {

        for (int i = 1; i <= 10; i ++) {
            Cat cat = new Cat();
            cat.setName(getRandomName());
            cat.setAge(i);

            catRepository.save(cat);

        }
    }

    private static String names[] = new String[] {
            "Bailey", "Bella", "Max", "Lucy", "Charlie", "Molly", "Buddy", "Daisy", "Rocky", "Maggie", "Jake",
            "Sophie", "Jack", "Sadie", "Toby", "Chloe", "Cody", "Bailey", "Buster", "Lola", "Duke", "Zoe",
            "Cooper", "Abby", "Riley", "Ginger", "Harley", "Roxy", "Bear", "Gracie", "Tucker", "Coco", "Murphy",
            "Sasha", "Lucky", "Lily", "Oliver", "Angel", "Sam", "Princess", "Oscar", "Emma", "Teddy", "Annie",
            "Winston", "Rosie", "Sammy", "Ruby", "Rusty", "Lady", "Shadow", "Gizmo", "Lilly", "Bentley", "Mia",
            "Zeus", "Katie", "Jackson", "Zoey", "Baxter", "Madison", "Bandit", "Stella", "Gus", "Penny", "Samson",
            "Belle", "Milo", "Casey", "Rudy", "Samantha", "Louie", "Holly", "Hunter", "Lexi", "Casey", "Lulu",
            "Rocco", "Brandy", "Sparky", "Jasmine", "Joey", "Shelby", "Bruno", "Sandy", "Beau", "Roxie", "Dakota",
            "Pepper", "Maximus", "Heidi", "Romeo", "Luna", "Boomer", "Dixie", "Luke", "Honey", "Henry", "Dakota"
    };

    private static List<String> animalNames = Arrays.asList(names);

    private static String getRandomName() {
        Random random = new Random();

        return animalNames.get(random.nextInt(animalNames.size()));
    }
}
