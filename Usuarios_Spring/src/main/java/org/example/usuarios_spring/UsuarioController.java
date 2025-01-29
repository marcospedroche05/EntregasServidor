package org.example.usuarios_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    UserRepository repositorioUsuarios;
    public UsuarioController() {}

    @Autowired
    public UsuarioController(UserRepository repositorioUsuarios) {
        this.repositorioUsuarios = repositorioUsuarios;
    }

    @GetMapping
    public ResponseEntity<Iterable<Usuario>> getAll() {
        return ResponseEntity.ok(this.repositorioUsuarios.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getById(@PathVariable Integer id) {
        Usuario usuario = this.repositorioUsuarios.findById(id).orElseThrow();
        return ResponseEntity.ok(usuario);
    }

    @PostMapping
    public ResponseEntity<Usuario> create(@RequestBody Usuario usuario) {
        Usuario usuarioPersistido = this.repositorioUsuarios.save(usuario);
        return ResponseEntity.ok(usuario);
    }

    @PutMapping
    public ResponseEntity<Usuario> update(@RequestBody Usuario usuario) {
        Usuario usuarioPersistido = this.repositorioUsuarios.save(usuario);
        return ResponseEntity.ok(usuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id) {
        this.repositorioUsuarios.deleteById(id);
        return ResponseEntity.ok("Usuario con la id: " + id + " eliminado");
    }
}
