package com.wexflow;

import org.json.JSONException;
import org.json.JSONObject;

class Workflow {
    private final LaunchType launchType;
    private final Boolean isEnabled;
    private int id;
    private String name;
    //private String description;
    private Boolean isRunning;
    private Boolean isPaused;

    private Workflow(int id, String name, LaunchType launchType, Boolean isEnabled, Boolean isRunning, Boolean isPaused) {
        this.id = id;
        this.name = name;
        this.launchType = launchType;
        this.isEnabled = isEnabled;
        //this.description = description;
        this.isRunning = isRunning;
        this.isPaused = isPaused;
    }

    static Workflow fromJSONObject(JSONObject jsonObject) throws JSONException {
        return new Workflow(jsonObject.getInt("Id")
                , jsonObject.getString("Name")
                , LaunchType.fromInteger(jsonObject.getInt("LaunchType"))
                , jsonObject.getBoolean("IsEnabled")
                //, jsonObject.getString("Description")
                , jsonObject.getBoolean("IsRunning")
                , jsonObject.getBoolean("IsPaused"));
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    LaunchType getLaunchType() {
        return launchType;
    }

    Boolean getEnabled() {
        return isEnabled;
    }

    Boolean getRunning() {
        return isRunning;
    }

    void setRunning(Boolean running) {
        isRunning = running;
    }

    Boolean getPaused() {
        return isPaused;
    }

    void setPaused(Boolean paused) {
        isPaused = paused;
    }
}