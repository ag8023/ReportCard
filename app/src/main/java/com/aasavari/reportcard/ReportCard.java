package com.aasavari.reportcard;

import static java.lang.Math.floor;

/**
 * Created by Aasavari on 2/18/2017.
 */

public class ReportCard {

    private int mStudentId;
    private String mFirstName;
    private String mLastName;
    private String mSemester;
    private double mMathScore;
    private double mSocialStudiesScore;
    private double mScienceScore;
    private double mPhyEdScore;
    private double mReadingScore;

    public static final int totalSubjects = 5;

    public ReportCard(int StudentId, String FirstName, String LastName,
                      String Semester, double MathScore, double SocialStudiesScore,
                      double ScienceScore, double PhyEdScore, double ReadingScore){
        mStudentId = StudentId;
        mFirstName = FirstName;
        mLastName = LastName;
        mSemester = Semester;
        mMathScore = MathScore;
        mSocialStudiesScore = SocialStudiesScore;
        mScienceScore = ScienceScore;
        mPhyEdScore = PhyEdScore;
        mReadingScore = ReadingScore;

    }

    public String GetFinalGrade(){

        double finalScore = (mMathScore + mSocialStudiesScore + mScienceScore + mPhyEdScore + mReadingScore)/totalSubjects;
        int tallyScore = (int)Math.floor(finalScore)/10;
        String finalGrade;
        switch(tallyScore){
            case 10:
            case 9:
                    finalGrade = "A";
                    break;
            case 8:
            case 7:
                    finalGrade = "B";
                    break;
            case 6:
                   finalGrade = "C";
                   break;
            case 5:
            case 4:
                  finalGrade = "D";
                  break;
            default:
                  finalGrade = "F";
                  break;

        };
        return finalGrade;
    }


    public int getStudentId() {
        return mStudentId;
    }

    public void setStudentId(int mStudentId) {
        this.mStudentId = mStudentId;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String mLastName) {
        this.mLastName = mLastName;
    }

    public String getSemester() {
        return mSemester;
    }

    public void setSemester(String mSemester) {
        this.mSemester = mSemester;
    }

    public double getReadingScore() {
        return mReadingScore;
    }

    public void setReadingScore(double mReadingScore) {
        this.mReadingScore = mReadingScore;
    }

    public double getPhyEdScore() {
        return mPhyEdScore;
    }

    public void setPhyEdScore(double mPhyEdScore) {
        this.mPhyEdScore = mPhyEdScore;
    }

    public double getScienceScore() {
        return mScienceScore;
    }

    public void setScienceScore(double mScienceScore) {
        this.mScienceScore = mScienceScore;
    }

    public double getSocialStudiesScore() {
        return mSocialStudiesScore;
    }

    public void setSocialStudiesScore(double mSocialStudiesScore) {
        this.mSocialStudiesScore = mSocialStudiesScore;
    }

    public double getMathScore() {
        return mMathScore;
    }

    public void setMathScore(double mMathScore) {
        this.mMathScore = mMathScore;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "mStudentId= " + mStudentId +
                ", mFirstName= '" + mFirstName + '\'' +
                ", mLastName= '" + mLastName + '\'' +
                ", mSemester= '" + mSemester + '\'' +
                ", mMathScore= " + mMathScore +
                ", mSocialStudiesScore= " + mSocialStudiesScore +
                ", mScienceScore= " + mScienceScore +
                ", mPhyEdScore= " + mPhyEdScore +
                ", mReadingScore= " + mReadingScore +
                '}';
    }
}
