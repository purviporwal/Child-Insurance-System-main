package com.capstone.child.insurance.system.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;

import com.capstone.child.insurance.system.dao.PremiumCalculationRepository;
import com.capstone.child.insurance.system.service.PremiumCalculationService;


@RestController
public class PremiumCalculationController {
	@Autowired
	PremiumCalculationService premCalcSerivce;


}
