/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties
public class Student {

    private String name;
    private int RollNo;
    private int appearingCount;
    public Student(String name,int RollNo,int appearingCount){
        this.appearingCount=appearingCount;
        this.RollNo=RollNo;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return RollNo;
    }

    public void setBackLog(int backLog) {
        this.RollNo= RollNo;
    }

    public int getAppearingCount() {
        return appearingCount;
    }

    public void setAppearingCount(int appearingCount) {
        this.appearingCount = appearingCount;
    }

    public String toString(){
        return getName()+" "+getRollNo()+" "+getAppearingCount();
    }


}
