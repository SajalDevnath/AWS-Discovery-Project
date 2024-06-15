package com.sajal.aws.utility;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

public class AwsConnection {
	public S3Client getConnection() {
		Resource resources = new ClassPathResource("/application.properties");
		S3Client s3Client = null;
		try {
			Properties props = PropertiesLoaderUtils.loadProperties(resources);
			String accessKeyId = props.getProperty("AWS_ACCESS_KEY_ID");
			String secretAccessKey = props.getProperty("AWS_SECRET_ACCESS_KEY");
			AwsBasicCredentials awsCreds = AwsBasicCredentials.create(accessKeyId, secretAccessKey);
            s3Client = S3Client.builder()
                                        .credentialsProvider(StaticCredentialsProvider.create(awsCreds))
                                        .region(Region.AP_SOUTH_1) // You can specify your desired region
                                        .build();
     
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s3Client;
	}
}
