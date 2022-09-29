package com.docker.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerJenkinsDemoController {

	@GetMapping("/test-jenkins")
	public String getData() {
		return "test docker-jenkins integration app";
	}
}
