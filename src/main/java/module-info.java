module com.example.knk2324 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.example.knk2324 to javafx.fxml;
    opens group_01.java_05 to javafx.fxml;

    opens group_01.java_01 to javafx.graphics;
    opens group_01.java_02 to javafx.graphics;
    opens group_01.java_03 to javafx.graphics;
    opens group_01.java_04 to javafx.graphics;

    opens group_02.java_01 to javafx.graphics;
    opens group_02.java_02 to javafx.graphics;
    opens group_02.java_03 to javafx.graphics;

    opens group_03.java_01 to javafx.graphics;
    opens group_03.java_02 to javafx.graphics;
    opens group_03.java_03 to javafx.graphics;

    exports com.example.knk2324;
    exports group_01.java_05;
}