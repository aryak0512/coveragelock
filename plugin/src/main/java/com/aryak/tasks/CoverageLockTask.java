package com.aryak.tasks;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.TaskAction;

import java.io.File;

public class CoverageLockTask extends DefaultTask {

    @InputFile
    private File jacocoReportXmlFile;

    @OutputFile
    private File coverageLockFile;

    @Input
    private float goal;

    public File getJacocoReportXmlFile() {
        return jacocoReportXmlFile;
    }

    public void setJacocoReportXmlFile(final File jacocoReportXmlFile) {
        this.jacocoReportXmlFile = jacocoReportXmlFile;
    }

    public File getCoverageLockFile() {
        return coverageLockFile;
    }

    public void setCoverageLockFile(final File coverageLockFile) {
        this.coverageLockFile = coverageLockFile;
    }

    public float getGoal() {
        return goal;
    }

    public void setGoal(final float goal) {
        this.goal = goal;
    }

    @TaskAction
    public void action() {
        System.out.println(getGoal());
        System.out.println(getJacocoReportXmlFile());
        System.out.println(getCoverageLockFile());
    }
}
