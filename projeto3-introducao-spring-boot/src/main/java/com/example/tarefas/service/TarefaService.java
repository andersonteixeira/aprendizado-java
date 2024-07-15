package com.example.tarefas.service;

import com.example.tarefas.model.Tarefa;
import com.example.tarefas.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class TarefaService {

@Autowired
private TarefaRepository tarefaRepository;

	public List<Tarefa> listarTarefas() {
		return tarefaRepository.findAll();
	}

	public Tarefa criarTarefa(@RequestBody Tarefa tarefa) {
		return tarefaRepository.save(tarefa);
	}

	public void removerTarefa(Long id) {
		tarefaRepository.deleteById(id);
	}
}
