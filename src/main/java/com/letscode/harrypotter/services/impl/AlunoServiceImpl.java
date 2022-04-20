package com.letscode.harrypotter.services.impl;

import com.letscode.harrypotter.clients.GetChaveCasaClient;
import com.letscode.harrypotter.clients.GetCasaInfoClient;
import com.letscode.harrypotter.dto.PostAlunoResponse;
import com.letscode.harrypotter.dto.clients.CasaInfo;
import com.letscode.harrypotter.exception.StudentNotFoundException;
import com.letscode.harrypotter.model.Aluno;
import com.letscode.harrypotter.dto.AlunoRequest;
import com.letscode.harrypotter.dto.GetAlunoResponse;
import com.letscode.harrypotter.repositories.AlunoRepository;
import com.letscode.harrypotter.services.AlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AlunoServiceImpl implements AlunoService {
  private final GetChaveCasaClient getChaveCasaClient;
  private final GetCasaInfoClient getCasaInfoClient;
  private final AlunoRepository alunoRepository;

  @Override
  public PostAlunoResponse create(AlunoRequest alunoRequest) {
    Aluno aluno = new Aluno();

    BeanUtils.copyProperties(alunoRequest, aluno);

    var chaveCasa = getChaveCasaClient.execute();

    aluno.setChaveCasa(chaveCasa.getChave());

    Aluno savedStudent = alunoRepository.save(aluno);

    return new PostAlunoResponse(savedStudent);
  }

  @Override
  public GetAlunoResponse findById(Long id) {
    Aluno aluno = alunoRepository.findById(id).orElseThrow(() -> new StudentNotFoundException(id));

    CasaInfo casaInfo = getCasaInfoClient.execute(aluno.getChaveCasa());

    GetAlunoResponse getAlunoResponse = new GetAlunoResponse(aluno);
    getAlunoResponse.setCasa(casaInfo);

    return getAlunoResponse;
  }
}
