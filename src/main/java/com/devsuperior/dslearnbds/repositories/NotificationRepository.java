package com.devsuperior.dslearnbds.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearnbds.entities.Notification;
import com.devsuperior.dslearnbds.entities.User;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

	Page<Notification> findByUser(User user, Pageable pageable);
	
	//ESSE MÉTODO FINDBYUSER DEVE SER ATUALIZADO, APRENDEMOS COMO ATUALIZA-LO NO CAPITULO POSTERIOR AO QUE FIZEMOS ESSE PROJETO.
	//PARA VER COMO ATUALIZAR, BASTA LER O ARQUIVO: Atualizacao da Listagem de Notificacao QUE ENCONTRA-SE NA PASTA DE APRENDIZADO (RESUMO).
}
