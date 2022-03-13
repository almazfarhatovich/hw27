package com.company;

public class Box<Box> {
    private Box razmer;

    public Box() {
    }

    public Box(Box box) {
        this.razmer = box;
    }

    public Box getRazmer() {
        return razmer;
    }

    public void setRazmer(Box razmer) {
        this.razmer = razmer;
    }

    public static <Box> Box var(Box box) {
        return box;
    }

    @Override
    public String toString() {
        return "Box:" +
                "razmer:" + razmer;
    }
}
