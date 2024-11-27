package com.example.test;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.FileInputStream;

public class HelloController {
    public ImageView characters;
    public Button previousButton;
    public Button nextButton;
    public Button addButton;
    public ChoiceBox characterBox;
    ToggleGroup radioGroup = new ToggleGroup();
    public RadioButton pochaccoButton;
    public RadioButton pomButton;
    public RadioButton gudetamaButton;
    public RadioButton maruButton;
    public RadioButton keroppiButton;
    public TextArea backgroundArea;

    Image image;
    Image image2;
    Image image3;
    Image image4;
    Image image5;
    Image image6;
    int currentImgNumber;
    FileChooser fileChooser = new FileChooser();


    public void initialize() throws Exception {
        FileInputStream input = new FileInputStream("src/gudetama2.png");
        image = new Image(input);
        characters.setImage(image);
        characterBox.setValue("Gudetama");
        currentImgNumber = 1;
        gudetamaButton.setSelected(true);
        backgroundArea.setText("Name:Gudetama\nSpecies:Egg Yolk\nLikes:napping,watching tv\nDislikes:being active");

        FileInputStream input2 = new FileInputStream("src/badtz.png");
        image2 = new Image(input2);

        FileInputStream input3 = new FileInputStream("src/keroppi.gif");
        image3 = new Image(input3);

        FileInputStream input4 = new FileInputStream("src/pompompurin.png");
        image4 = new Image(input4);

        FileInputStream input5 = new FileInputStream("src/pochacco3.png");
        image5 = new Image(input5);

        characterBox.setOnAction(actionEvent -> {
            Object choice = characterBox.getValue();
            System.out.println(choice);
            if (choice.toString().equalsIgnoreCase("Badtz-Maru")) {
                characters.setImage(image2);
                currentImgNumber = 2;
                maruButton.setSelected(true);
                //false other than maru
                keroppiButton.setSelected(false);
                pomButton.setSelected(false);
                pochaccoButton.setSelected(false);
                gudetamaButton.setSelected(false);
                backgroundArea.setText("Name:Badtz-Maru \nSpecies:Bird \nSkills: Pretending to play the piano");

            } else if (choice.toString().equalsIgnoreCase("Keroppi")) {
                characters.setImage(image3);
                currentImgNumber = 3;
                keroppiButton.setSelected(true);
                //false other than keroppi
                pomButton.setSelected(false);
                pochaccoButton.setSelected(false);
                gudetamaButton.setSelected(false);
                maruButton.setSelected(false);
                backgroundArea.setText("Name:Keroppi\nSpecies:Frog\nLikes:playing games");

            } else if (choice.toString().equalsIgnoreCase("Pompompurin")) {
                characters.setImage(image4);
                currentImgNumber = 4;
                pomButton.setSelected(true);
                //false other than pom
                pochaccoButton.setSelected(false);
                gudetamaButton.setSelected(false);
                maruButton.setSelected(false);
                keroppiButton.setSelected(false);
                backgroundArea.setText("Name:Pompompurin\nSpecies:Dog\nLikes:milk,pudding");

            } else if (choice.toString().equalsIgnoreCase("Pochacco")) {
                characters.setImage(image5);
                currentImgNumber = 5;
                pochaccoButton.setSelected(true);
                //false other than pochacco
                gudetamaButton.setSelected(false);
                maruButton.setSelected(false);
                keroppiButton.setSelected(false);
                pomButton.setSelected(false);
                backgroundArea.setText("Name:Pochacco\nSpecies:Dog\nLikes:Banana Ice Cream");

            } else {
                characters.setImage(image);
                currentImgNumber = 1;
                gudetamaButton.setSelected(true);
                // false other than gudetama
                maruButton.setSelected(false);
                keroppiButton.setSelected(false);
                pomButton.setSelected(false);
                pochaccoButton.setSelected(false);
                backgroundArea.setText("Name:Gudetama\nSpecies:Egg Yolk\nLikes:napping,watching tv\nDislikes:being active");
            }

        });
        characterBox.getItems().add("Badtz-Maru");
        characterBox.getItems().add("Keroppi");
        characterBox.getItems().add("Pompompurin");
        characterBox.getItems().add("Pochacco");
        characterBox.getItems().add("Gudetama");
    }

    public void previousCharacter() throws Exception {
        if (currentImgNumber > 1) {
            currentImgNumber = currentImgNumber - 1;
        } else {
            currentImgNumber = 5;
        }
        if (currentImgNumber == 1) {
            characters.setImage(image);
            characterBox.setValue("Gudetama");
            gudetamaButton.setSelected(true);
            maruButton.setSelected(false);
            keroppiButton.setSelected(false);
            pomButton.setSelected(false);
            pochaccoButton.setSelected(false);
            backgroundArea.setText("Name:Gudetama\nSpecies:Egg Yolk\nLikes:napping,watching tv\nDislikes:being active");
        }
        if (currentImgNumber == 2) {
            characters.setImage(image2);
            characterBox.setValue("Badtz-Maru");
            maruButton.setSelected(true);
            //false other than maru
            keroppiButton.setSelected(false);
            pomButton.setSelected(false);
            pochaccoButton.setSelected(false);
            gudetamaButton.setSelected(false);
            backgroundArea.setText("Name:Badtz-Maru \nSpecies:Bird \nSkills: Pretending to play the piano");
        }
        if (currentImgNumber == 3) {
            characters.setImage(image3);
            characterBox.setValue("Keroppi");
            keroppiButton.setSelected(true);
            //false other than keroppi
            pomButton.setSelected(false);
            pochaccoButton.setSelected(false);
            gudetamaButton.setSelected(false);
            maruButton.setSelected(false);
            backgroundArea.setText("Name:Keroppi\nSpecies:Frog\nLikes:playing games");
        }
        if (currentImgNumber == 4) {
            characters.setImage(image4);
            characterBox.setValue("Pompompurin");
            pomButton.setSelected(true);
            //false other than pom
            pochaccoButton.setSelected(false);
            gudetamaButton.setSelected(false);
            maruButton.setSelected(false);
            keroppiButton.setSelected(false);
            backgroundArea.setText("Name:Pompompurin\nSpecies:Dog\nLikes:milk,pudding");
        }
        if (currentImgNumber == 5) {
            characters.setImage(image5);
            characterBox.setValue("Pochacco");
            pochaccoButton.setSelected(true);
            //false other than pochacco
            gudetamaButton.setSelected(false);
            maruButton.setSelected(false);
            keroppiButton.setSelected(false);
            pomButton.setSelected(false);
            backgroundArea.setText("Name:Pochacco\nSpecies:Dog\nLikes:Banana Ice Cream");
        }


    }

    public void nextCharacter() throws Exception {
        if (currentImgNumber < 5) {
            currentImgNumber = currentImgNumber + 1;
        } else {
            currentImgNumber = 1;
        }

        if (currentImgNumber == 2) {
            characters.setImage(image2);
            characterBox.setValue("Badtz-Maru");
            maruButton.setSelected(true);
            //false other than maru
            keroppiButton.setSelected(false);
            pomButton.setSelected(false);
            pochaccoButton.setSelected(false);
            gudetamaButton.setSelected(false);
            backgroundArea.setText("Name:Badtz-Maru \nSpecies:Bird \nSkills: Pretending to play the piano");
        }
        if (currentImgNumber == 3) {
            characters.setImage(image3);
            characterBox.setValue("Keroppi");
            keroppiButton.setSelected(true);
            //false other than keroppi
            pomButton.setSelected(false);
            pochaccoButton.setSelected(false);
            gudetamaButton.setSelected(false);
            maruButton.setSelected(false);
            backgroundArea.setText("Name:Keroppi\nSpecies:Frog\nLikes:playing games");
        }
        if (currentImgNumber == 4) {
            characters.setImage(image4);
            characterBox.setValue("Pompompurin");
            pomButton.setSelected(true);
            //false other than pom
            pochaccoButton.setSelected(false);
            gudetamaButton.setSelected(false);
            maruButton.setSelected(false);
            keroppiButton.setSelected(false);
            backgroundArea.setText("Name:Pompompurin\nSpecies:Dog\nLikes:milk,pudding");
        }
        if (currentImgNumber == 5) {
            characters.setImage(image5);
            characterBox.setValue("Pochacco");
            pochaccoButton.setSelected(true);
            //false other than pochacco
            gudetamaButton.setSelected(false);
            maruButton.setSelected(false);
            keroppiButton.setSelected(false);
            pomButton.setSelected(false);
            backgroundArea.setText("Name:Pochacco\nSpecies:Dog\nLikes:Banana Ice Cream");
        }
        if (currentImgNumber == 1) {
            characters.setImage(image);
            characterBox.setValue("Gudetama");
            gudetamaButton.setSelected(true);
            maruButton.setSelected(false);
            keroppiButton.setSelected(false);
            pomButton.setSelected(false);
            pochaccoButton.setSelected(false);
            backgroundArea.setText("Name:Gudetama\nSpecies:Egg Yolk\nLikes:napping,watching tv\nDislikes:being active");
        }
    }

    public void radioButtons() throws Exception {
        //ToggleGroup radioGroup = new ToggleGroup();
        gudetamaButton.setToggleGroup(radioGroup);
        maruButton.setToggleGroup(radioGroup);
        keroppiButton.setToggleGroup(radioGroup);
        pomButton.setToggleGroup(radioGroup);
        pochaccoButton.setToggleGroup(radioGroup);

        if (gudetamaButton.isSelected()) {
            characters.setImage(image);
            currentImgNumber = 1;
            characterBox.setValue("Gudetama");
            backgroundArea.setText("Name:Gudetama\nSpecies:Egg Yolk\nLikes:napping,watching tv\nDislikes:being active");
        }
        if (maruButton.isSelected()) {
            characters.setImage(image2);
            currentImgNumber = 2;
            characterBox.setValue("Badtz-Maru");
            backgroundArea.setText("Name:Badtz-Maru \nSpecies:Bird \nSkills: Pretending to play the piano");
        }
        if (keroppiButton.isSelected()) {
            characters.setImage(image3);
            currentImgNumber = 3;
            characterBox.setValue("Keroppi");
            backgroundArea.setText("Name:Keroppi\nSpecies:Frog\nLikes:playing games");
        }
        if (pomButton.isSelected()) {
            characters.setImage(image4);
            currentImgNumber = 4;
            characterBox.setValue("Pompompurin");
            backgroundArea.setText("Name:Pompompurin\nSpecies:Dog\nLikes:milk,pudding");
        }
        if (pochaccoButton.isSelected()) {
            characters.setImage(image5);
            currentImgNumber = 5;
            characterBox.setValue("Pochacco");
            backgroundArea.setText("Name:Pochacco\nSpecies:Dog\nLikes:Banana Ice Cream");
        }

    }

    public void newCharacter () throws Exception {
            File selectedFile = fileChooser.showOpenDialog(characters.getScene().getWindow());
            FileInputStream selectedFIS = new FileInputStream(selectedFile);
            image6 = new Image(selectedFIS);



    }

}