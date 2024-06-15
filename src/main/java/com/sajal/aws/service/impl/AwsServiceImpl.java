package com.sajal.aws.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.sajal.aws.service.AwsService;
import com.sajal.aws.utility.AwsConnection;

@Service
public class AwsServiceImpl implements AwsService {
	AwsConnection awsCon = null;

//	@Override
//	public List<String> listAllBucketNames() {
//		awsCon = new AwsConnection();
//		S3Client s3Client = awsCon.getConnection();
//		// List S3 buckets
//		ListBucketsRequest listBucketsRequest = ListBucketsRequest.builder().build();
//		ListBucketsResponse listBucketsResponse = s3Client.listBuckets(listBucketsRequest);
//
//		// Retrieve and return bucket names
//		return listBucketsResponse.buckets().stream().map(bucket -> bucket.name()).collect(Collectors.toList());
//	}

	@Override
	public String DiscoverServices(List<String> services) {
		// TODO Auto-generated method stub
		return "DiscoverServices";
	}

	@Override
	public String GetJobResult(String Jobid) {
		// TODO Auto-generated method stub
		return "GetJobResult";
	}

	@Override
	public List<String> GetDiscoveryResult(String Service) {
		// TODO Auto-generated method stub
		List<String> test = new ArrayList<>();
		test.add("GetDiscoveryResult");
		return test;
	}

	@Override
	public String GetS3BucketObjects(String BucketName) {
		// TODO Auto-generated method stub
		return "GetS3BucketObjects";
	}

	@Override
	public int GetS3BucketObjectCount(String BucketName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<String> GetS3BucketObjectlike(String BucketName, String Pattern) {
		// TODO Auto-generated method stub
		List<String> test = new ArrayList<>();
		test.add("GetS3BucketObjectlike");
		return test;
	}

}
