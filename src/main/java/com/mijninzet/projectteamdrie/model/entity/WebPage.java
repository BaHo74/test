package com.mijninzet.projectteamdrie.model.entity;

public enum WebPage {
    //Dit is een overzicht van mogelijke schermen binnen de applicatie. Hier kan naar worden verwezen in de rest van de app.
    //Deze lijst is slechts een voorbeeld. Wordt nog aangepast.
    CREATE_USER( "Create New User"),
    MANAGE_USER("Change User"),
    CREATE_TASKS("Create Tasks"),
    OVERVIEW_TASKS_TEACHER("Overview my Tasks "),
    OVERVIEW_TASKS_MANAGER("Overview all Tasks "),
    MANAGE_TASKS_TEACHER("Change My Tasks"),
    MANAGE_TASKS_MANAGER("Change tasks"),
    VIEW_CREATED_SCHEDULE("View Generated Schedule");

    private static final WebPage[] WINDOWS_TEACHER = {MANAGE_TASKS_TEACHER, OVERVIEW_TASKS_TEACHER};
    private static final WebPage[] WINDOWS_ADMINISTRATOR = {CREATE_USER, MANAGE_USER};
    private static final WebPage[] WINDOWS_COORDINATOR = {VIEW_CREATED_SCHEDULE};
    private static final WebPage[] WINDOWS_SCHEDULER = {VIEW_CREATED_SCHEDULE};
    private static final WebPage[] WINDOWS_MANAGER = {MANAGE_TASKS_MANAGER, OVERVIEW_TASKS_TEACHER};

    private String description;

    WebPage(String screenDescription) {
        this.description = screenDescription;
    }

    public static WebPage getWindowByDescription(String description) {

        if (description.equals(CREATE_USER.getDescription())) {
            return CREATE_USER;
        } else if (description.equals(MANAGE_USER.getDescription())) {
            return MANAGE_USER;
        } else if (description.equals(CREATE_TASKS.getDescription())) {
            return CREATE_TASKS;
        } else if (description.equals(OVERVIEW_TASKS_TEACHER.getDescription())) {
            return OVERVIEW_TASKS_TEACHER;
        } else if (description.equals(OVERVIEW_TASKS_MANAGER.getDescription())) {
            return OVERVIEW_TASKS_MANAGER;
        } else if (description.equals(MANAGE_TASKS_TEACHER.getDescription())) {
            return MANAGE_TASKS_TEACHER;
        } else if (description.equals(MANAGE_TASKS_MANAGER.getDescription())) {
            return MANAGE_TASKS_MANAGER;
        } else if (description.equals(VIEW_CREATED_SCHEDULE.getDescription())) {
            return VIEW_CREATED_SCHEDULE;
        } else {
            return null;
        }
    }

    public String getDescription() {
        return description;
    }

    public static WebPage[] getWindowsTeacher() {
        return WINDOWS_TEACHER;
    }

    public static WebPage[] getWindowsAdministrator() {
        return WINDOWS_ADMINISTRATOR;
    }

    public static WebPage[] getWindowsCoordinator() {
        return WINDOWS_COORDINATOR;
    }

    public static WebPage[] getWindowsScheduler() {
        return WINDOWS_SCHEDULER;
    }

    public static WebPage[] getWindowsManager() {
        return WINDOWS_MANAGER;
    }

    @Override
    public String toString() {
        return String.format("Scherm heeft functie %s", description);
    }
}


