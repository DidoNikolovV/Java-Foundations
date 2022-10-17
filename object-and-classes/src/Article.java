import java.util.Scanner;

public class Article {
    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String Edit(String newContent) {
        this.content = newContent;
        return this.content;
    }

    public String ChangeAuthor(String newAuthor) {
        this.author = newAuthor;
        return this.author;
    }

    public String Rename(String newTitle) {
        this.title = newTitle;
        return this.title;
    }

    @Override
    public String toString() {
        return  this.title + " - " +  this.content + ": " + this.author;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String article = scanner.nextLine();
        String[] splittedArticle = article.split(", ");
        String title = splittedArticle[0];
        String content = splittedArticle[1];
        String author = splittedArticle[2];

        Article art = new Article(title, content, author);
        int n = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < n; i ++) {
            String[] cmdPart = scanner.nextLine().split(": ");
            String command = cmdPart[0];

            if(command.equals("Edit")) {
                String newContent = cmdPart[1];
                art.Edit(newContent);
            } else if(command.equals("ChangeAuthor")) {
                String newAuthor = cmdPart[1];
                art.ChangeAuthor(newAuthor);
            } else if(command.equals("Rename")) {
                String newTitle = cmdPart[1];
                art.Rename(newTitle);
            }
        }


        System.out.println(art.toString());
    }

}
