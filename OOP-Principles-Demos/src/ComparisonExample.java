class ComparisonExample {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(5);
        System.out.println("c1 == c2? " + (c1.equals(c2)));
        String s1 = "Alan";
        String s2 = "Bob";
        String s3 = "B" + "o" + b();
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));

        System.out.println("compareTo: ");
        System.out.println("helen".compareTo("bob"));

    }

    static char b() {
        return 'b';
    }
}
