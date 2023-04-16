public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " flim");
    }

    public static Movie getMovie(String type,String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new Science(title);
            default -> new Movie(title);
        };
    }
}
    class Adventure extends Movie {
        public Adventure(String title) {
            super(title);
        }

        @Override
        public void watchMovie() {
            super.watchMovie();
            System.out.printf(".. %s%n".repeat(3),
                    "pleasent scene",
                    "scary music",
                    "something happen bad");
        }

        public void watchAdventure() {
            System.out.println("watching a adventure");
        }
    }

class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "funny",
                "good feel movie",
                "happy ending");
    }
    public void watchComedy() {
        System.out.println("watching a comedy");
    }
}

class Science extends Movie {
    public Science(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "unexpected",
                "technoligies",
                "unexpected ending");
    }
    public void watchScienceFiction() {
        System.out.println("watching a science fiction");
    }
}

