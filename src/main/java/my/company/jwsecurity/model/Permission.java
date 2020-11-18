package my.company.jwsecurity.model;

public enum Permission {
    NOTE_READ("note:read"),
    NOTE_WRITE("note:write");

    private final String permission;

    Permission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
