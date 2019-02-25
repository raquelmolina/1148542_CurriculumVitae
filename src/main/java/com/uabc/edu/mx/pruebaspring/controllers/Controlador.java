package com.uabc.edu.mx.pruebaspring.controllers;
import com.uabc.edu.mx.pruebaspring.model.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/app")
public class Controlador {
    @GetMapping(value="/recurso")
    public String pagina (Model modelo){
        Persona p = new Persona();
        p.setNombre("Raquel Itzel Molina Rodriguez");
        p.setOcupacion("Estudiate");
        p.setSitio("https:/lscraquelmolina/");
        p.setCorreo("raquel.molina@uabc.edu.mx");
        p.setContacto("686-120-07-33");
        p.setInfoPersonal("Actualmente estudiando Sistemas Computacionales, con más de 6 años de experiencia en con el uso y manejo de la paquetería Microsoft Office.\n" +
                "\n" +
                "Mi experiencia laboral se limita al mi desempeño del servicio social, entre mis puntos fuertes están:\n" +
                "\n" +
                "Programación en C.\n" +
                "\n" +
                "Contabilidad y Contabilidad de Costos.\n" +
                "\n" +
                "Informática.\n" +
                "\n" +
                "Creatividad en el desarrollo de actividades en grupo. \n" +
                "\n" +
                "Por último deseo expresar mi pasión por el mundo de la programación y la administración. ");
        p.setTab1("SEMARNAT. Servicio Social");
        p.setAnoTab1("2016");
        p.setInfoTab1("Archivo y captura de datos en la nómina de los trabajadores.");
        p.setTab2("UABC. Servicio Social");
        p.setAnoTab2("2017");
        p.setInfoTab2("Archivo y captura de datos de los alumnos de nuevo ingreso.\n" +
                "\n" +
                "Registro y cálculo de los presupuestos del departamento de Administración. ");
        p.setHab1("Archivo y captura de datos.");
        p.setHab2("Cálculo de nómina.");
        p.setHab3("Manejo de paquetería Office");
        p.setHab4("Programación en lenguaje C, JAVA, C#, MySQL");
        p.setHab5("Contabilidad básica y Costos");
        p.setHab6("Redes");
        p.setUni1("UABC");
        p.setGrado1("Estudiante");
        p.setInfoU1("Licenciado en Sistemas Computacionales (6to. Semestre)");
        p.setUni2("Centro de Bachillerato Tecnológico Industrial y de Servicios 21");
        p.setGrado2("Técnico en Contabilidad");
        p.setInfoU3("(2013-2016)");
        modelo.addAttribute("per",p);
        return "pagina";
    }
}
