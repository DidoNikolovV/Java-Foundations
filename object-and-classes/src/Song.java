import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Song {
   private String typeList;
   private String name;
   private String time;

    public void setTypeList(String typeList) {
        this.typeList = typeList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTypeList() {
        return typeList;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> songs = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("_");
            String type = input[0];
            String name = input[1];
            String time = input[2];


            Song song = new Song();
            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);

            songs.add(song);
        }

        String typeList = scanner.nextLine();

        if(typeList.equals("all")){
            for(Song song: songs) {
                System.out.println(song.getName());
            }
        } else {
            for(Song song: songs) {
                if(song.getTypeList().equals(typeList)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
