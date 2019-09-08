package com.muhammad.studentroster.services;

import org.springframework.stereotype.Service;

import com.muhammad.studentroster.entities.ContactInfo;
import com.muhammad.studentroster.repositories.ContactInfoRepository;

@Service
public class ContactInfoService {
	
	private final ContactInfoRepository contactInfoRepository;

	public ContactInfoService(ContactInfoRepository contactInfoRepository) {
		this.contactInfoRepository = contactInfoRepository;
	}
	
	public void saveContactInfo(ContactInfo contactInfo) {
		contactInfoRepository.save(contactInfo);
	}
	
}
