package br.com.dio.desafioreactor;

import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

public class Question2 {

    /*
    Recebe uma lista de usuários e retorna a quantos usuários admin tem na lista
     */
    public Mono<Long> countAdmins(final List<User> users){
        return Mono.just(users.stream()
                .filter(User::isAdmin)
                .collect(Collectors.counting()));
    }

}
