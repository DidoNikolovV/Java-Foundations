import org.w3c.dom.css.Rect;

public class RectanglesExample {
    static class Rectangle {
        protected int width, height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            if(width < 0) {
                throw new IllegalArgumentException("Width cannot be negative.");
            }
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            if(height < 0) {
                throw new IllegalArgumentException("Height cannot be negative.");
            }
            this.height = height;
        }

        public int calcArea() {
            return this.width * this.height;
        }

        @Override
        public String toString() {
            return "Rectangle{" +
                    "width=" + this.width +
                    ", height=" + this.height +
                    '}';
        }
    }

    static class FilledRectangle extends Rectangle {
        protected String color;

        public FilledRectangle(int width, int height, String color) {
            super(width, height);
            if(color == null || color.equals("")) {
                throw new IllegalArgumentException("Color cannot be empty.");
            }
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "FilledRectangle{" +
                    "color='" + this.color + '\'' +
                    ", width=" + this.width +
                    ", height=" + this.height +
                    '}';
        }
    }

    static class BorderedFilledRectangle extends FilledRectangle{
        private String borderColor;

        public BorderedFilledRectangle(int width, int height, String color, String borderColor) {
            super(width, height, color);
            this.borderColor = borderColor;
        }

        public String getBorderColor() {
            return borderColor;
        }

        public void setBorderColor(String borderColor) {
            this.borderColor = borderColor;
        }

        @Override
        public String toString() {
            return "BorderedFilledRectangle{" +
                    "borderColor='" + this.borderColor + '\'' +
                    ", color='" + this.color + '\'' +
                    ", width=" + this.width +
                    ", height=" + this.height +
                    '}';
        }
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(3, 5);
        System.out.println(rect);

        FilledRectangle filledRect = new FilledRectangle(3, 5, "blue");
        System.out.println(filledRect);

        BorderedFilledRectangle bigRect = new BorderedFilledRectangle(3, 5, "blue", "lightblue");
        System.out.println(bigRect);
        System.out.println("Area = " + bigRect.calcArea());

    }
}
