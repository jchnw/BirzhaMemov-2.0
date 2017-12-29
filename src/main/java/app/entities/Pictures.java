package app.entities;

import app.entities.Users;


public class Pictures {
    private Long picture_likes;
    private Long user_id;
    private Long picture_id;
    //private String name;
    //test
    private byte[] imageData;
    private String imageFileName;




    public Pictures() {}


    public Pictures(Long picture_likes, Long user_id, Long picture_id,  byte[] imageData, String imageFileName) {

        this.picture_likes = picture_likes;
        this.user_id = user_id;
        this.picture_id = picture_id;
        //this.name = name;
        this.imageData = imageData;
        this.imageFileName = imageFileName;

    }

    public Long getPicture_id() {
        return picture_id;
    }

    public void setPicture_id(Long picture_id) {
        this.picture_id = picture_id;
    }

    public Long getPicture_likes() {
        return picture_likes;
    }

    public void setPicture_likes(Long picture_likes) {
        this.picture_likes = picture_likes;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

   /* //public String getName() {
       // return name;
   // }

    //public void setName(String name) {
      //  this.name = name;
    *///}


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
