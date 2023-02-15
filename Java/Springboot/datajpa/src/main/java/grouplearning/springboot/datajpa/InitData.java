package grouplearning.springboot.datajpa;

import grouplearning.springboot.datajpa.model.Animal;
import grouplearning.springboot.datajpa.model.AnimalType;
import grouplearning.springboot.datajpa.model.Region;
import grouplearning.springboot.datajpa.model.Zoo;
import grouplearning.springboot.datajpa.repository.AnimalRepository;
import grouplearning.springboot.datajpa.repository.AnimalTypeRepository;
import grouplearning.springboot.datajpa.repository.RegionRepository;
import grouplearning.springboot.datajpa.repository.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.persistence.NoResultException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class InitData {

    @Autowired
    RegionRepository regionRepo;

    @Autowired
    ZooRepository zooRepo;

    @Autowired
    AnimalTypeRepository animalTypeRepo;

    @Autowired
    AnimalRepository animalRepo;

    @Value("${grouplearning.springboot.datajpa.init-data}")
    private boolean mockupData;

    @Value("${grouplearning.springboot.datajpa.number-of-animals}")
    private int numOfAnimals;

    @PostConstruct
    private void initData() {
        if(mockupData) {
            insertRegions();
            insertZoos();
            insertAnimalTypes();
            insertAnimals();
        }
    }

    private void insertRegions() {
        Region eastRegion = new Region(); eastRegion.setName("East Region");
        Region southRegion = new Region(); southRegion.setName("South Region");
        Region westRegion = new Region(); westRegion.setName("West Region");
        Region northRegion = new Region(); northRegion.setName("North Region");

        regionRepo.save(eastRegion);
        regionRepo.save(southRegion);
        regionRepo.save(westRegion);
        regionRepo.save(northRegion);
    }

    private void insertZoos() {
        Region eastRegion = regionRepo.findByName("East Region");
        Zoo z1 = new Zoo(); z1.setName("Bronx Zoo, Bronx"); z1.setRegion(eastRegion); zooRepo.save(z1);
        Zoo z2 = new Zoo(); z2.setName("National Zoological Park, Washington DC"); z2.setRegion(eastRegion); zooRepo.save(z2);
        Zoo z3 = new Zoo(); z3.setName("Philadelphia Zoo"); z3.setRegion(eastRegion); zooRepo.save(z3);
        Zoo z4 = new Zoo(); z4.setName("Columbus Zoo"); z4.setRegion(eastRegion); zooRepo.save(z4);
        Zoo z5 = new Zoo(); z5.setName("Brevard Zoo"); z5.setRegion(eastRegion); zooRepo.save(z5);
        Zoo z6 = new Zoo(); z6.setName("Six Flags Wild Safari, NJ"); z6.setRegion(eastRegion); zooRepo.save(z6);

        Region southRegion = regionRepo.findByName("South Region");
        Zoo s1 = new Zoo(); s1.setName("McCarthy's Wildlife, West Palm Beach"); s1.setRegion(southRegion); zooRepo.save(s1);
        Zoo s2 = new Zoo(); s2.setName("Zoo Miami, Miami"); s2.setRegion(southRegion); zooRepo.save(s2);
        Zoo s3 = new Zoo(); s3.setName("Denver Zoo"); s3.setRegion(southRegion); zooRepo.save(s3);
        Zoo s4 = new Zoo(); s4.setName("Fort Worth Zoo"); s4.setRegion(southRegion); zooRepo.save(s4);
        Zoo s5 = new Zoo(); s5.setName("Cheyenne Mountain Zoo"); s5.setRegion(southRegion); zooRepo.save(s5);
        Zoo s6 = new Zoo(); s6.setName("Audubon Zoo"); s6.setRegion(southRegion); zooRepo.save(s6);
        Zoo s7 = new Zoo(); s7.setName("Lion Country Safari, Florida"); s7.setRegion(southRegion); zooRepo.save(s7);

        Region westRegion = regionRepo.findByName("West Region");
        Zoo w1 = new Zoo(); w1.setName("Oakland Zoo"); w1.setRegion(westRegion); zooRepo.save(w1);
        Zoo w2 = new Zoo(); w2.setName("San Diego Zoo and Safari Park"); w2.setRegion(westRegion); zooRepo.save(w2);
        Zoo w3 = new Zoo(); w3.setName("Woodland Park Zoo"); w3.setRegion(westRegion); zooRepo.save(w3);
        Zoo w4 = new Zoo(); w4.setName("The Living Desert Zoo"); w4.setRegion(westRegion); zooRepo.save(w4);

        Region northRegion = regionRepo.findByName("North Region");
        Zoo n1 = new Zoo(); n1.setName("Saint Louis Zoo"); n1.setRegion(northRegion); zooRepo.save(n1);
        Zoo n2 = new Zoo(); n2.setName("Alaska Zoo"); n2.setRegion(northRegion); zooRepo.save(n2);
        Zoo n3 = new Zoo(); n3.setName("Bear Country USA, South Dakota"); n3.setRegion(northRegion); zooRepo.save(n3);
        Zoo n4 = new Zoo(); n4.setName("Chicago Zoological Park"); n4.setRegion(northRegion); zooRepo.save(n4);
        Zoo n5 = new Zoo(); n5.setName("Indianapolis Zoo"); n5.setRegion(northRegion); zooRepo.save(n5);
        Zoo n6 = new Zoo(); n6.setName("Cincinnati Zoo"); n6.setRegion(northRegion); zooRepo.save(n6);
    }

    private void insertAnimalTypes() {
        AnimalType tiger = new AnimalType(); tiger.setName("Tiger"); animalTypeRepo.save(tiger);
        AnimalType horse = new AnimalType(); horse.setName("Horse"); animalTypeRepo.save(horse);
        AnimalType fox = new AnimalType(); fox.setName("Fox"); animalTypeRepo.save(fox);
        AnimalType cheetah = new AnimalType(); cheetah.setName("Cheetah"); animalTypeRepo.save(cheetah);
        AnimalType falcon = new AnimalType(); falcon.setName("Falcon"); animalTypeRepo.save(falcon);
        AnimalType jaguar = new AnimalType(); jaguar.setName("Jaguar"); animalTypeRepo.save(jaguar);
        AnimalType cat = new AnimalType(); cat.setName("Cat"); animalTypeRepo.save(cat);
        AnimalType dog = new AnimalType(); dog.setName("Dog"); animalTypeRepo.save(dog);
        AnimalType lion = new AnimalType(); lion.setName("Lion"); animalTypeRepo.save(lion);
        AnimalType panda = new AnimalType(); panda.setName("Panda"); animalTypeRepo.save(panda);
        AnimalType bear = new AnimalType(); bear.setName("Bear"); animalTypeRepo.save(bear);
        AnimalType chameleon = new AnimalType(); chameleon.setName("Chameleon"); animalTypeRepo.save(chameleon);
        AnimalType bird = new AnimalType(); bird.setName("Bird"); animalTypeRepo.save(bird);
        AnimalType peacock = new AnimalType(); peacock.setName("Peacock"); animalTypeRepo.save(peacock);
        AnimalType wolf = new AnimalType(); wolf.setName("Wolf"); animalTypeRepo.save(wolf);
        AnimalType monkey = new AnimalType(); monkey.setName("Monkey"); animalTypeRepo.save(monkey);
        AnimalType zebra = new AnimalType(); zebra.setName("Zebra"); animalTypeRepo.save(zebra);
        AnimalType turtle = new AnimalType(); turtle.setName("Turtle"); animalTypeRepo.save(turtle);
        AnimalType deer = new AnimalType(); deer.setName("Deer"); animalTypeRepo.save(deer);
        AnimalType rabbit = new AnimalType(); rabbit.setName("Rabbit"); animalTypeRepo.save(rabbit);
        AnimalType fish = new AnimalType(); fish.setName("Fish"); animalTypeRepo.save(fish);
    }

    private void insertAnimals() {
        Long zooCount = zooRepo.count();
        Long animalTypeCount = animalTypeRepo.count();

        Random random = new Random();

        for( int i = 0; i < numOfAnimals; i++) {
            Animal animal = new Animal();
            Zoo zoo = zooRepo.findById(1 + random.nextLong(zooCount)).orElseThrow(()-> new NoResultException());
            AnimalType animalType = animalTypeRepo.findById(1 + random.nextLong(animalTypeCount)).orElseThrow(()-> new NoResultException());

            animal.setAnimalName(getRandomName());
            animal.setAge(1 + random.nextInt(50));
            animal.setAnimalType(animalType);
            animal.setZoo(zoo);
            animal.setDescription(animal.getAnimalName() + " is a " + animal.getAnimalType().getName() + " living in " + animal.getZoo().getName());

            animalRepo.save(animal);
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
