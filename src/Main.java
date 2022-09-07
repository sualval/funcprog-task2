
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            int price = Integer.parseInt(scanner.nextLine());
            generateList(20).stream()
                    .filter(property -> property.getPrice() < price)
                    .forEach(System.out::println);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static int rnd() {
        int max = 100;
        return (int) (Math.random() * ++max);
    }

    private static List<Property> generateList(int listSize) {
        int count = 0;
        List<Property> properties = new ArrayList<>();
        while (count < listSize) {
            properties.add(new Property(rnd(), rnd(), rnd()));
            count++;
        }
        return properties;
    }


}
