# 📚 Library Management System (Java)

A **console-based Library Management System** written in Java.  
It allows you to **manage books, members, and borrowing/returning records.**

---

## ✨ Features
- **Add new books** to the library
- **Register library members**
- **Issue books** to members
- **Return books**
- **View all books**
- **View all members**
- **View issued books**
- Auto-generated IDs for **Books** and **Members**

---

## 📂 Project Structure
```
LibraryManagementSystem/
│
├── Book.java # Book details and status
├── Member.java # Library member details
├── IssuedBook.java # Issued book record (book + member + date)
├── LibraryManagement.java # Main class with menu system
└── README.md # Project documentation
```


---

## 🛠️ Technologies Used
- **Java SE** (Core Java)
- **ArrayList** for data storage
- **Scanner** for user input

---

## 🚀 How to Run the Project

**1️⃣ Clone the repository**
```bash
git clone https://github.com/dibyendupaul-09/Library-Management-System.git
cd LibraryManagementSystem
```

**2️⃣ Compile the Java files**
```bash
javac *.java
```

**3️⃣ Run the program**
```bash
java LibraryManagement
```

## 📸 Sample Output
```bash
==== Library Management System ====
1. Add Book
2. Register Member
3. Issue Book
4. Return Book
5. View All Books
6. View All Members
7. View Issued Books
0. Exit

Enter choice: 1
Enter Book Title: Java Programming
Enter Book Author: James Gosling
Book added successfully!
```

## 🎯 Learning Outcomes

- Understanding OOP in Java
- Working with ArrayLists
- Implementing a menu-driven console application
- Using encapsulation and constructors
