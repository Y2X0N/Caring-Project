package com.example.caRing.model.review;

import com.example.caRing.model.customer.Customer;

import lombok.Data;

@Data
public class ReviewDTO {
		private Review review;
		private Customer customer;
}

