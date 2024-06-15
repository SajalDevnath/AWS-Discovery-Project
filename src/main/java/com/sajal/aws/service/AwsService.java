package com.sajal.aws.service;

import java.util.List;

public interface AwsService {
	public String DiscoverServices(List<String> services);
	public String GetJobResult(String Jobid);
	public List<String> GetDiscoveryResult(String Service);
	public String GetS3BucketObjects(String BucketName);
	public int GetS3BucketObjectCount(String BucketName);
	public List<String> GetS3BucketObjectlike(String BucketName, String Pattern);
//	public List<String> listAllBucketNames();
}
