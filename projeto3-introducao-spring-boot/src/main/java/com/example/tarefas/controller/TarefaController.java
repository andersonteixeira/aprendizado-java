package com.example.tarefas.controller;

import com.example.tarefas.model.Tarefa;
import com.example.tarefas.repository.TarefaRepository;
import com.example.tarefas.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

@Autowired
private TarefaService tarefaService;

	@GetMapping("")
	public List<Tarefa> listarTarefas() {
		return tarefaService.listarTarefas();
	}

	@PostMapping
	public Tarefa incluir(@RequestBody Tarefa tarefa) {
		return tarefaService.criarTarefa(tarefa);
	}

	@DeleteMapping("/{id}")
	public void removerTarefa(@PathVariable Long id) {
		tarefaService.removerTarefa(id);
	}
}
