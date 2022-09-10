package day031;

import java.util.Scanner;

public class Contact {
    private  String name;
    private int phoneNumber;
    private String emailAddress;

    public Contact(String name, int phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber=phoneNumber;
        this.emailAddress=emailAddress;
    }
    public Contact(){

    }

    public Contact(String ahmet_dursun, String QWE, String dfghj) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {

    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
public void sendSMS(){
    System.out.println(this.phoneNumber+" SMS gonderiliyor");
}
public void sendEmail(){
    System.out.println(this.emailAddress+" Eamil gonderiliyor");
}
public void call(){
    System.out.println(this.phoneNumber+" Telefon aciliyor");
}
public void showInfo(){
    System.out.println(this.getName());
    System.out.println(this.getPhoneNumber());
    System.out.println(this.getEmailAddress());

}
public void inputFromKeybord(){
    Scanner input=new Scanner(System.in);

    System.out.print("Isim: ");
    this.setName(input.nextLine());
    System.out.print("Tel : ");
    this.setPhoneNumber(Integer.parseInt(input.nextLine()));
    System.out.print("Email ; ");
    this.setEmailAddress(input.nextLine());


}

}

