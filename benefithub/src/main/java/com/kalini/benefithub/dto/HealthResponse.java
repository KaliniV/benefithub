package com.kalini.benefithub.dto;


public class HealthResponse {
  private String name;
    private String version;
    private String status;

    public HealthResponse(String name, String version, String status) {
        this.name = name;
        this.version = version;
        this.status = status;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    
}
