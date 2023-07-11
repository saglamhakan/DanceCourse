package service;

import model.*;

import java.util.List;

public class DanceCourseService {

    /* private String name;
    private String address;
    private String founder;
    private String taxNumber;
    private String taxOffice;

    private List<BankAccount> bankAccountList;

    private List<PaymentMovement> paymentMovementList;
    private List<Instructor> instructorList;
    private List<Student> studentList;

     */

    public DanceCourse createDanceCourse(String name, String address, String founder, String taxNumber,
                                         String taxOffice, List<BankAccount> bankAccountList,
                                         List<PaymentMovement> paymentMovementList, List<Instructor> instructorList,
                                         List<Student> studentList){

        DanceCourse danceCourse = new DanceCourse();

        danceCourse.setName(name);
        danceCourse.setAddress(address);
        danceCourse.setFounder(founder);
        danceCourse.setTaxNumber(taxNumber);
        danceCourse.setTaxOffice(taxOffice);
        danceCourse.setBankAccountList(bankAccountList);
        danceCourse.setPaymentMovementList(paymentMovementList);
        danceCourse.setInstructorList(instructorList);
        danceCourse.setStudentList(studentList);

        return danceCourse;

    }
}
