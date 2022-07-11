package kz.springeshop.service;

import kz.springeshop.domain.Bucket;
import kz.springeshop.domain.User;
import kz.springeshop.dto.BucketDto;

import java.util.List;

public interface BucketService {
	Bucket createBucket(User user, List<Long> productIds);

	void addProducts(Bucket bucket, List<Long> productIds);

	BucketDto getBucketByUser(String name);

	void commitBucketToOrder(String username);
}
