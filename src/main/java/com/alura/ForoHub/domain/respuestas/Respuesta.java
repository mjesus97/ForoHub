package com.alura.ForoHub.domain.respuestas;

import com.alura.ForoHub.domain.Usuario.Usuario;
import com.alura.ForoHub.domain.curso.Curso;
import com.alura.ForoHub.domain.topico.Topico;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "respuesta")
@Entity(name = "Respuesta")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mensaje;
    private Topico topico;
    private String fecha;
    private Usuario autor;
    private String solucion;

}
