package model.dto;

public class ChangeUserPasswordDto {
    private int id;
    private String currentPassword;
    private String newPassword;
    private String confirmNewPassword;

    public ChangeUserPasswordDto(int id, String currentPassword, String newPassword, String confirmNewPassword) {
        this.id = id;
        this.currentPassword = currentPassword;
        this.newPassword = newPassword;
        this.confirmNewPassword = confirmNewPassword;
    }

    public int getId() {
        return id;
    }

    public String getCurrentPassword() {
        return currentPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public String getConfirmNewPassword() {
        return confirmNewPassword;
    }
}
