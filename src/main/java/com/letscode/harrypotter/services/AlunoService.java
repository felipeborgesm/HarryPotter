package com.letscode.harrypotter.services;

import com.letscode.harrypotter.dto.AlunoRequest;
import com.letscode.harrypotter.dto.GetAlunoResponse;
import com.letscode.harrypotter.dto.PostAlunoResponse;

public interface AlunoService {

    PostAlunoResponse create(AlunoRequest alunoRequest);

    GetAlunoResponse findById(Long id);

}
