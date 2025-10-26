package com.prathampatil.JobifyApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
public class JobPost {

    @Id
    private int postId;
    private String postProfile;
    private String postDesc;
    private Integer reqExperience;
    private List<String> postTechStack;

//    public JobPost(){
//        this.postId = 0;
//        this.postProfile = "";
//        this.postDesc = "";
//        this.reqExperience = 0;
//        this.postTechStack = new ArrayList<String>();
//    }
//    public JobPost(int postId, String postProfile, String postDesc, int reqExperience, List<String> postTechStack) {
//        this.postId = postId;
//        this.postProfile = postProfile;
//        this.postDesc = postDesc;
//        this.reqExperience = reqExperience;
//        this.postTechStack = postTechStack;
//    }
}