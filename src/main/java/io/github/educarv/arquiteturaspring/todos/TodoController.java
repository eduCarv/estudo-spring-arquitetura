package io.github.educarv.arquiteturaspring.todos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    @PostMapping
    public TodoEntity salvar(@RequestBody TodoEntity novoTodo) {
        return this.service.salvar(novoTodo);
    }

    @PutMapping("/{id}")
    public void atualizarStatus(@PathVariable Integer id, @RequestBody TodoEntity todo) {
        todo.setId(id);
        this.service.atualizarStatus(todo);
    }

    @GetMapping("/{id}")
    public TodoEntity buscarPorId(@PathVariable Integer id) {
        return this.service.buscarPorId(id);
    }
}
