package com.sajal.aws.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sajal.aws.service.AwsService;

@RestController
@RequestMapping("/api")
public class S3Controller {
	@Autowired
	private AwsService awsService;
	
//	@GetMapping("/getBucketList")
//	public List<String> getBucketList() {
//		List<String> bucketList = awsService.listAllBucketNames();
//		return bucketList;
//	}
	
	@GetMapping("/getDiscoverServices")
	public String getDiscoverServices() {
		List<String> servicesList = new ArrayList<>();
		servicesList.add("s3");
		servicesList.add("ec2");
		String services = awsService.DiscoverServices(servicesList);
		return services;
	}
	
	@GetMapping("/getJobResult")
	public String getJobResult(@RequestParam("jobid") String jobId) {
		String jobResult = awsService.GetJobResult(jobId);
		return jobResult;
	}
	
	@GetMapping("/getDiscoveryResult")
	public List<String> getDiscoveryResult(@RequestParam("servicename") String serviceName) {
		List<String> discoveryResult = awsService.GetDiscoveryResult(serviceName);
		return discoveryResult;
	}
	
	@GetMapping("/getS3BucketObjects")
	public String getS3BucketObjects(@RequestParam("bucketname") String bucketName) {
		String jobId = awsService.GetS3BucketObjects(bucketName);
		return jobId;
	}
	
	@GetMapping("/getS3BucketObjectCount")
	public int getS3BucketObjectCount(@RequestParam("bucketname") String bucketName) {
		int objectCount = awsService.GetS3BucketObjectCount(bucketName);
		return objectCount;
	}
	
	@GetMapping("/getS3BucketObjectlike")
	public List<String> getS3BucketObjectlike(@RequestParam("bucketname") String bucketName) {
		List<String> filesList = awsService.GetDiscoveryResult(bucketName);
		return filesList;
	}
}
