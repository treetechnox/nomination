package dz.sgg.nomination;

import dz.sgg.nomination.dao.CandidatRepository;
import dz.sgg.nomination.dao.FonctionRepository;
import dz.sgg.nomination.dao.MouvementRepository;
import dz.sgg.nomination.entities.Candidat;
import dz.sgg.nomination.entities.EtatMouvement;
import dz.sgg.nomination.entities.Fonction;
import dz.sgg.nomination.entities.Mouvement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class NominationApplication implements CommandLineRunner {

    @Autowired
    FonctionRepository fonctionRepository;

    public static void main(String[] args) {
        //ConfigurableApplicationContext ctx =
            SpringApplication.run(NominationApplication.class, args);



        //CandidatRepository candidatRepository = ctx.getBean(CandidatRepository.class);
        //MouvementRepository mouvementRepository = ctx.getBean(MouvementRepository.class);
        //FonctionRepository fonctionRepository = ctx.getBean(FonctionRepository.class);
        //SimpleDateFormat formaDate = new SimpleDateFormat("dd/MM/yyyy");


        //Date date = null;
        //try {
        //    date = formaDate.parse("09/01/1986");
        //} catch (ParseException e) {
        //   e.printStackTrace();
        //}


//        candidatRepository.save(new Candidat("Khireddine","Tarek","خيرالدين","طارق", date,"Annaba","--","M"));
//        fonctionRepository.save(new Fonction("Directeur","مدير"));

        //mouvementRepository.sa



    }

    @Override
    public void run(String... args) throws Exception {
        //fonctionRepository.save(new Fonction("Directeur","مدير"));
        //List<Fonction> fonctions  =;
        for (Fonction fonction:fonctionRepository.findAll())
            System.out.println(fonction.getLibelle_ar()+" -- "+fonction.getLibelle_fr());



    }
}
