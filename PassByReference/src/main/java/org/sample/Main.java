package org.sample;


public class Main {
    static void main() {
        Box b = new Box();
        b.value = 10 ;
        System.out.println(b.value);
        change(b);
        System.out.println(b.value) ;
    }
    static void change(Box b){
        b.value = 30 ;
    }
}

// static void change(Box b) {
//     b = new Box();   // new object
//     b.value = 99;
// }

// public static void main(String[] args) {
//     Box box = new Box();
//     box.value = 10;

//     change(box);
//     System.out.println(box.value); // ?
// }


// THIS IS ACTUAL PASS BY REFERENCE MEANS YOU ARE CHANGING THE ADDRESS YOU ARE CREATING NEW OBJECT FOR THAT REFERENCE .
// IT WILL NOT AFFECT TO THE OUTSIDE OF THE METHOD.


// Before:
// box ───▶ Box(value=10)

// Inside method:
// b ───▶ Box(value=10)
// b ───▶ NEW Box(value=99)

// After method:
// box ───▶ Box(value=10)

// ❌ Original reference box never changed
// ✔️ Only the copied reference b changed

// C++ (reference can be changed)
// void change(Box* &b) {
//     b = new Box(99);
// }


// ✔️ Original variable updated

// Java (reference CANNOT be changed)
// static void change(Box b) {
//     b = new Box(); // affects only local copy
// }


// ❌ Original variable unchanged

