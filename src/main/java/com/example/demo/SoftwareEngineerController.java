package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping
    public List<SoftwareEngineer> getEngineers(){

        return softwareEngineerService.getAllSoftwareEngineers();

//        return List.of(new SoftwareEngineer(1,"james","java, docker, kubernetes"),
//                new SoftwareEngineer(1,"phill","python, gitlab, grafana"));
    }
    @PostMapping
    public void addNewSoftwareEngineers(SoftwareEngineer softwareEngineer){

        softwareEngineerService.insertSoftwareEngineers(softwareEngineer);

    }

}
