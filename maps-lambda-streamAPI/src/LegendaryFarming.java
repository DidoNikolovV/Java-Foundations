import java.util.LinkedHashMap;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> keyMaterials = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> junkMaterials = new LinkedHashMap<>();

        boolean isShadowmourneObtainted = false;
        boolean isValanyrObtained = false;
        boolean isDragonwrathObtainted = false;

        while(!isShadowmourneObtainted || !isValanyrObtained || !isDragonwrathObtainted) {
            String[] input = scanner.nextLine().split(" ");
            for(int i =0; i < input.length; i++) {
                if(i + 1 == input.length - 1) {
                    break;
                }
                int quantity = Integer.parseInt(input[i]);
                String material = input[i + 1].toLowerCase();

                if(material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    if(keyMaterials.get(material) == null) {
                        keyMaterials.put(material, quantity);
                    } else {
                        Integer currentQuantity = keyMaterials.get(material);
                        currentQuantity += quantity;
                        if(currentQuantity >= 250) {
                            if(material.equals("shards")) {
                                isShadowmourneObtainted = true;
                                System.out.println("Shadowmourne obtained!");
                                break;
                            } else if(material.equals("fragments")) {
                                System.out.println("Valanyr obtained!");
                                isValanyrObtained = true;
                            } else if (material.equals("motes")) {
                                System.out.println("Dragonwrath obtained");
                                isDragonwrathObtainted = true;
                                break;
                            }

                        }
                        currentQuantity -= quantity;
                        keyMaterials.put(material, currentQuantity);
                    }
                } else {
                    if(junkMaterials.get(material) == null) {
                        junkMaterials.put(material, quantity);
                    } else {
                        Integer currentQuantity = junkMaterials.get(material);
                        currentQuantity += quantity;
                        junkMaterials.put(material, currentQuantity);
                    }
                }
            }
                }

    }
}
