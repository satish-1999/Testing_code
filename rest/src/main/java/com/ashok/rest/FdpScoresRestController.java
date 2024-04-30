package com.ashok.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fpd")
public class FdpScoresRestController 
{
	@GetMapping("/score")
	public String getFpdScores(@RequestParam(value="ssn" , required=false, defaultValue ="23479")Long ssn) {
		return "FPD is best Possible"+ssn;
	}
}
