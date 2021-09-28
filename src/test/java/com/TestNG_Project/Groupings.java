package com.TestNG_Project;

import org.testng.annotations.Test;

public class Groupings {
@Test(groups="Outdoor games")
private void cricket() {
		System.out.println("cricket_Outdoor");
}
@Test(groups="Outdoor games")
private void tennis() {
		System.out.println("tennis_Outdoor");
}
@Test(groups="Outdoor games")
private void football() {
		System.out.println("football_Outdoor");
}
@Test(groups="Indoor games")
private void chess() {
		System.out.println("chess_Indoor");
}
@Test(groups="Indoor games")
private void carrom() {
		System.out.println("carrom_Indoor");
}
}
