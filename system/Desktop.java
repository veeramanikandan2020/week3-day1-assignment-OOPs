package org.system;

public class Desktop extends Computer {

	private void desktopSize() {
		System.out.println("Desktop Size is 14inch");

	}

	public static void main(String[] args) {

		Desktop desk = new Desktop();

		desk.desktopSize();

		desk.computerModel();

	}

}
