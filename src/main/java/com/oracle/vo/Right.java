package com.oracle.vo;

public class Right {
    String rightId;
    String rightName;
    String rightUrl;

    public String getRightId() {
        return rightId;
    }
    public void setRightId(String rightId) {
        this.rightId = rightId;
    }
    public String getRightName() {
        return rightName;
    }
    public void setRightName(String rightName) {
        this.rightName = rightName;
    }
    public String getRightUrl() {
        return rightUrl;
    }
    public void setRightUrl(String rightUrl) {
        this.rightUrl = rightUrl;
    }
    @Override
    public String toString() {
        return "Right [rightId=" + rightId + ", rightName=" + rightName + ", rightUrl=" + rightUrl + "]";
    }
}
