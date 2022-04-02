package com.example.UserFeedback.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.UserFeedback.entities.Feedback;
import com.example.UserFeedback.repositories.FeedbackRepository;
import com.example.UserFeedback.services.FeedbackService;

@RestController
public class RestUpdateController 
{
	
	@Autowired
	FeedbackService feedbackService;
	
	@Autowired
	FeedbackRepository feedbackRepository;
	
    @GetMapping("/update")
    public String getEmployeeByName(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("feedback") String feedback, @RequestParam("rating") int rating) {
 
    	
    	Feedback f = new Feedback(count()+1, name, email, feedback, rating);
    	feedbackRepository.save(f);
 
        return "<html>\n"
		 		+ "<head>\n"
		 		+ "	<style>\n"
		 		+ "		.center {\n"
		 		+ "	  		text-align: center;\n"
		 		+ "	  	}\n"
		 		+ "	  	\n"
		 		+ "	</style>\n"
		 		+ "</head>\n"
		 		+ "<body style=\"background-color: lightblue;\">\n"
		 		+ "	<div class=\"center\">\n"
		 		+ "		<h1>User Feedback Page</h1>\n"
		 		+ "		\n"
		 		+ "		<h2 class=\"hello-title\">Successfully Added Your Feedback</h2>\n"
		 		+ "		\n"
		 		+ "		<a href=\"/feedback\"><button>Click here to view all Feedbacks</button></a>\n"
		 		+ "	</div>\n"
		 		+ "</body>\n"
		 		+ "</html>";
    }
    
    public Integer count() {
    	int i = 1;
    	while(feedbackRepository.existsById(i))
    		i++;
    	return i;
    }
}	