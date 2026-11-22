package com.aryak.extensions;

import java.io.File;

public class CoverageLockExtension {

    private float goal;
    private boolean isCi;
    private File resultFile;
    private String jacocoMetric;

    public float getGoal() {
        return goal;
    }

    public void setGoal(final float goal) {
        this.goal = goal;
    }

    public boolean isCi() {
        return isCi;
    }

    public void setCi(final boolean ci) {
        isCi = ci;
    }

    public File getResultFile() {
        return resultFile;
    }

    public void setResultFile(final File resultFile) {
        this.resultFile = resultFile;
    }

    public String getJacocoMetric() {
        return jacocoMetric;
    }

    public void setJacocoMetric(final String jacocoMetric) {
        this.jacocoMetric = jacocoMetric;
    }
}
