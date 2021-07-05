package javakamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javakamp.hrms.business.abstracts.CandidatesService;
import javakamp.hrms.core.utilities.results.DataResult;
import javakamp.hrms.core.utilities.results.Result;
import javakamp.hrms.entities.concretes.Candidate;
import javakamp.hrms.entities.dtos.CurriculumVitaeDto;

@RestController
@RequestMapping("/api/candidates")
@CrossOrigin
public class CandidatesController {

	private CandidatesService candidatesService;

	@Autowired
	public CandidatesController(CandidatesService candidatesService) {
		super();
		this.candidatesService = candidatesService;
	}
	@GetMapping("/getall")
	public DataResult<List<Candidate>> getAll(){
		return this.candidatesService.getAll();
	}
	@PostMapping("/record")
	public Result record(@RequestBody Candidate candidate) {
		return this.candidatesService.record(candidate);
	}
	
	
}
