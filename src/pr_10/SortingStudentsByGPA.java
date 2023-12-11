package pr_10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortingStudentsByGPA implements Comparator<Student> {
    public Student[] iDNumber;

    public void setArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count of students in class: ");
        int len = scanner.nextInt();
        iDNumber = new Student[len];

        String name, surname, specialization, group;
        int year, gpa;
        for (int i = 0; i < len; ++i) {
            System.out.printf("Student: %d%n", i + 1);

            System.out.print("Enter name: ");
            name = scanner.next();
            System.out.print("Enter surname: ");
            surname = scanner.next();
            System.out.print("Enter specialization: ");
            specialization = scanner.next();
            System.out.print("Enter group: ");
            group = scanner.next();

            System.out.print("Enter year: ");
            year = scanner.nextInt();
            System.out.print("Enter GPA: ");
            gpa = scanner.nextInt();

            iDNumber[i] = new Student(name, surname, specialization, group, year, gpa);
        }
    }

    @Override
    public int compare(Student n1, Student n2) {
        return -Integer.compare(n1.getGpa(), n2.getGpa());
    }
    public int compareGroup(Student n1, Student n2) {
        return -n1.getGroup().compareTo(n2.getGroup());
    }

    public void quickSort() {
        if (iDNumber.length == 0)
            return;

        int  low = 0, high = iDNumber.length - 1;
        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        Student opornii = iDNumber[middle];

        int i = low, j = high;
        while (i <= j) {
            while (compare(iDNumber[i], opornii) < 0)
                i++;

            while (compare(iDNumber[j], opornii) > 0)
                j--;

            if (i <= j) {
                Student temp = iDNumber[i];
                iDNumber[i] = iDNumber[j];
                iDNumber[j] = temp;
                i++;
                j--;
            }
        }
    }

    public void mergeSort(Student[] iDNumber) {
        if (iDNumber == null || iDNumber.length <= 1) {
            return; // Нечего сортировать
        }

        int middle = iDNumber.length/2;
        Student[] left = new Student[middle];
        Student[] right = new Student[iDNumber.length - middle];

        // Копируем элементы во временные массивы
        System.arraycopy(iDNumber, 0, left, 0, middle);
        System.arraycopy(iDNumber, middle, right, 0, iDNumber.length - middle);

        // Рекурсивно сортируем левую и правую половины
        mergeSort(left);
        mergeSort(right);

        // Объединяем два отсортированных массива
        merge(iDNumber, left, right);
    }
    private void merge(Student[] array, Student[] left, Student[] right) {
        int leftIndex = 0, rightIndex = 0, arrayIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (compareGroup(left[leftIndex], (right[rightIndex])) <= 0) {
                array[arrayIndex++] = left[leftIndex++];
            } else {
                array[arrayIndex++] = right[rightIndex++];
            }
        }
        // Копируем оставшиеся элементы из левого и правого массивов (если они есть)
        while (leftIndex < left.length) {
            array[arrayIndex++] = left[leftIndex++];
        }
        while (rightIndex < right.length) {
            array[arrayIndex++] = right[rightIndex++];
        }
    }


    public void mergeSort_group(Student[] iDNumber) {
        if (iDNumber == null || iDNumber.length <= 1) {
            return; // Нечего сортировать
        }

        int middle = iDNumber.length/2;
        Student[] left = new Student[middle];
        Student[] right = new Student[iDNumber.length - middle];

        // Копируем элементы во временные массивы
        System.arraycopy(iDNumber, 0, left, 0, middle);
        System.arraycopy(iDNumber, middle, right, 0, iDNumber.length - middle);

        // Рекурсивно сортируем левую и правую половины
        mergeSort_group(left);
        mergeSort_group(right);

        // Объединяем два отсортированных массива
        merge_group(iDNumber, left, right);
    }
    public void merge_group(Student[] array, Student[] left, Student[] right) {
        int leftIndex = 0, rightIndex = 0, arrayIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (compareGroup(left[leftIndex], (right[rightIndex])) <= 0) {
                array[arrayIndex++] = left[leftIndex++];
            } else {
                array[arrayIndex++] = right[rightIndex++];
            }
        }
        // Копируем оставшиеся элементы из левого и правого массивов (если они есть)
        while (leftIndex < left.length) {
            array[arrayIndex++] = left[leftIndex++];
        }
        while (rightIndex < right.length) {
            array[arrayIndex++] = right[rightIndex++];
        }
    }

    public void outArray() {
        System.out.println(Arrays.toString(iDNumber));
    }


}
