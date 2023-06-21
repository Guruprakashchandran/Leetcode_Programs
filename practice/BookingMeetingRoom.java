package com.practice;

import java.util.*;

public class BookingMeetingRoom {

	public static void main(String[] args) {

		new BookingMeetingRoom().getInputs();
	}

	private void getInputs() {

		Scanner scanner = new Scanner(System.in);
		try {

			System.out.print("Enter Number Of Meetings : ");
			int noOfMeetings = scanner.nextInt();
			int[][] meeting = new int[noOfMeetings][2];
			for (int i = 0; i < noOfMeetings; ++i) {

				for (int j = 0; j < 2; ++j) {

					meeting[i][j] = scanner.nextInt();
				}
			}
			findAllMeetingsAreAvailable(meeting, noOfMeetings);

		} catch (Exception e) {

			System.out.println("Wrong Input!!!");
		} finally {

			scanner.close();
		}
	}

	private void findAllMeetingsAreAvailable(int[][] meeting, int noOfMeetings) {

		try {

			int meetingRooms = 1;
			for (int i = 0; i < noOfMeetings; ++i) {

				for (int j = i + 1; j < noOfMeetings; ++j) {

					if (!((meeting[i][0] < meeting[j][0] && meeting[i][1] > meeting[j][0])
							|| (meeting[i][0] < meeting[j][1] && meeting[i][1] > meeting[j][1]))) {

						meetingRooms++;
						break;
					}
				}
			}
			System.out.println("No Of Meeting Allocated : " + meetingRooms);
		} catch (Exception e) {

			System.out.println("Index Problem!!!");
		}
	}
}
