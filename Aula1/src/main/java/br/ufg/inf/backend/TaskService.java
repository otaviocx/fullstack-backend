package br.ufg.inf.backend;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class TaskService {
	
	private List<String> tasks = new ArrayList<String>();
	
	public String list() throws FileNotFoundException {
		if(tasks.size() == 0) {
			throw new FileNotFoundException("Nenhuma tarefa cadastrada.");
		}
		String resultado = "";
		int i = 1;
		for (String task : tasks) {
			resultado += "Tarefa "+i+": "+task+"\n";
			i++;
		}
		return resultado;
	}
	
	public String add(String task) {
		tasks.add(task);
		return "Tarefa "+task+" salva com sucesso!";
	}
	
	public String update(int index, String task) {
		tasks.set(index-1, task);
		return "Tarefa "+index+" atualizada com sucesso!";
	}
	
	public String remove(int index) {
		tasks.remove(index-1);
		return "Tarefa "+index+" excluida com sucesso!";
	}
	
}
