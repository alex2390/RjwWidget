package com.example.sb_cm.rjwwidget.widget.ball;

/**
 * Desc:
 * <p>
 * Created by renjiawen on 2019/1/15.
 */
public class TaskModel {
    private  String id;

    private String name;

    private String difficultyLevel ;

    public TaskModel(String id, String name, String difficultyLevel) {
        this.id = id;
        this.name = name;
        this.difficultyLevel = difficultyLevel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
}
