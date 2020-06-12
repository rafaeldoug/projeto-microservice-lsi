package br.cesed.si.lsi.microservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.cesed.si.lsi.microservice.dto.CursoDTO;
import br.cesed.si.lsi.microservice.dto.MatriculaDTO;

@Service
public class MatriculaService {

	@Autowired
	private RestTemplate client;

	public void realizaMatricula(MatriculaDTO matricula) {

		ResponseEntity<CursoDTO> exchange = client.exchange("http://curso/info/" + matricula.getCursoCod(),
				HttpMethod.GET, null, CursoDTO.class);

		System.out.println(exchange.getBody().getNome());

	}

}
