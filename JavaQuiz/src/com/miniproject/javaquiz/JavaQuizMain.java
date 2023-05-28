package com.miniproject.javaquiz;

import java.util.Scanner;

public class JavaQuizMain {
	static int ch;

	public static void main(String[] args) {
		System.out.println("*****Java Programming Quiz*****");
		System.out.println("1.New User");
		System.out.println("2.Existing User");
		System.out.println("3.Display Quiz result");
		System.out.println("4.Exit");
		System.out.println();
		SelectCase();
	}

	public static void SelectCase() {
		do {
			System.out.println("Please enter your choice :");
			Scanner sc = new Scanner(System.in);
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("**Student Registration**");
				UserInput objUserInput = new UserInput();
				objUserInput.UserInputData();
				break;
			case 2:
				System.out.println("Please select login user type :  ");
				System.out.println("1.Admin");
				System.out.println("2.Student");
				int ch = sc.nextInt();
				LoginCredentials objLoginCredentials = new LoginCredentials();
				switch (ch) {
				case 1:
					System.out.println("**Admin Login**");
					objLoginCredentials.AdminLoginDetails();
					break;

				case 2:
					System.out.println("**Student Login**");
					objLoginCredentials.FetchLoginData();
					break;
				}
			case 3:
				/*QuizResult objQuizResult = new QuizResult();
				objQuizResult.resultData();*/
				/*StudentFunction obj = new StudentFunction();
				obj.studentOperation();*/
				
				AdminFunctions  objAdminFunctions = new AdminFunctions();
				objAdminFunctions.adminOperation2();
				break;
			case 4:
				Exit(0);

			default:
			}
		} while (ch != 4);
	}

	private static void Exit(int i) {
	}

}
