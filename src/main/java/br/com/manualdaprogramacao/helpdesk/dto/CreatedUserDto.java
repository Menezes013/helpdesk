package br.com.manualdaprogramacao.helpdesk.dto;

public record CreatedUserDto(
        String username,
        String password,
        String name,
        String email) {
}
