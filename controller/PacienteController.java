package com.clinicalima.controller;

import com.clinicalima.model.Paciente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/pacientes")
public class PacienteController {

    private static List<Paciente> pacientes = new ArrayList<>();

    @GetMapping("/lista")
    public String listar(Model model) {
        model.addAttribute("pacientes", pacientes);
        return "pacientes/lista";
    }

    @GetMapping("/nuevo")
    public String formulario(Model model) {
        model.addAttribute("paciente", new Paciente());
        return "pacientes/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Paciente paciente) {
        paciente.setId((long) (pacientes.size() + 1));
        paciente.setEstado("En espera"); // Estado por defecto
        pacientes.add(paciente);
        return "redirect:/pacientes/lista";
    }
}