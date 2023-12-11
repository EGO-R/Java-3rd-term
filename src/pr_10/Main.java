package pr_10;

public class Main {
    public static void main(String[] args) {
        SortingStudentsByGPA class1 = new SortingStudentsByGPA();
        class1.setArray();
        class1.quickSort();
        class1.outArray();
        SortingStudentsByGPA class2 = new SortingStudentsByGPA();
        class2.setArray();
        class2.mergeSort(class2.iDNumber);
        class2.outArray();

        SortingStudentsByGPA class3 = new SortingStudentsByGPA();
        class3.iDNumber = new Student[class1.iDNumber.length + class2.iDNumber.length];
        class3.merge_group(class3.iDNumber, class1.iDNumber, class2.iDNumber);
        class3.mergeSort_group(class3.iDNumber);
        class3.outArray();

    }
}
