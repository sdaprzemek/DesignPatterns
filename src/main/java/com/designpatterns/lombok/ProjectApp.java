package com.designpatterns.lombok;

class ProjectApp {

    public static void main(String[] args) {
        Project project = Project.builder().name("Przemek Marciniak").company("SDAcademy").author("John Wick").closed(false).build();

        System.out.println(project.toString());
    }
}
