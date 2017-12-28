package app.entities;

public class Memes {
    private Long picture_id;
    private String name;
    private byte[] imageData;
    private String imageFileName;


    public Memes() {

    }


    public Memes(Long picture_id, String name, byte[] imageData, String imageFileName) {
        this.picture_id = picture_id;
        this.name = name;
        this.imageData = imageData;
        this.imageFileName = imageFileName;
    }

    public Long getPicture_id() {
        return picture_id;
    }

    public void setPicture_id(Long picture_id) {
        this.picture_id = picture_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public byte[] getImageData() {
        return imageData;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }
}
