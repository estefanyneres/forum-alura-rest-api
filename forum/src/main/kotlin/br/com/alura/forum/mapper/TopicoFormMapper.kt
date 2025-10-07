package br.com.alura.forum.mapper

import br.com.alura.forum.dto.TopicoForm
import br.com.alura.forum.model.Topico
import br.com.alura.forum.service.CursoService
import br.com.alura.forum.service.UsuarioService
import org.springframework.stereotype.Component

@Component
class TopicoFormMapper(
        private val cursoService: CursoService,
        private val usuarioService: UsuarioService
): Mapper<TopicoForm, Topico> {
    override fun map(topicoForm: TopicoForm): Topico {
        return Topico(
                titulo = topicoForm.titulo,
                mensagem = topicoForm.mensagem,
                curso = cursoService.buscarPorId(topicoForm.idCurso),
                autor = usuarioService.buscarPorId(topicoForm.idAutor)
        )
    }
}
