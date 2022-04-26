package com.emsi.gestiondespatientsmysql;

import com.emsi.gestiondespatientsmysql.entities.Patient;
import com.emsi.gestiondespatientsmysql.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class GestionDesPatientsMySqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionDesPatientsMySqlApplication.class, args);
    }
    //@Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(new Patient(null,"Hamza",new Date(),false,12));
            patientRepository.save(new Patient(null,"Ayoub",new Date(),true,14));
            patientRepository.save(new Patient(null,"Ilyass",new Date(),false,19));
            patientRepository.save(new Patient(null,"Aymane",new Date(),true,07));
            patientRepository.save(new Patient(null,"Mouade",new Date(),true,17));
            patientRepository.findAll().forEach(p->{
            System.out.println(p.getNom());
                });
        };
    }
}
