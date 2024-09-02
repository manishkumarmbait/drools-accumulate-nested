package com.uncia.droolsaccumulatenested.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uncia.droolsaccumulatenested.model.Account;
import com.uncia.droolsaccumulatenested.model.Cibil;
import com.uncia.droolsaccumulatenested.service.UnciaCibilService;

@RestController
@RequestMapping("/ruleservice")
//@CrossOrigin(origins = "*")
public class UnciaCibilController {

	@Autowired
	private UnciaCibilService unciaCibilService;

//	@CrossOrigin(origins = "http://localhost:9090/")
	@PostMapping("/getOD")
	public ResponseEntity<List<Account>> getRate(@RequestBody Cibil guarantorDeviation) {
		 List<Account> response = unciaCibilService.getResponse(guarantorDeviation);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
