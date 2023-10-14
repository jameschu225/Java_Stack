package com.codingdojo.daikichiRoutes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiController {
	@RequestMapping("/daikichi")
	public String daikichi() {
		return "Welcome!";
	}
	@RequestMapping("/daikichi/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	@RequestMapping("/daikichi/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	@RequestMapping("/daikichi/{activity}/{location}")
	public String todolist(@PathVariable("activity")String activity,
			@PathVariable("location")String location ) {
		return "Congratulations! You will soon " + activity + " to " + location;
	}
	@RequestMapping("/daikichi/lotto/{number}")
	public String guessNumber(@PathVariable("number")int number) {
		if (number%2==0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		}
		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
	}
}
