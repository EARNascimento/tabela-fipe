package br.com.alura.tabelaFipe.service;

public interface IConverteDados {
    <T> T ConverteDados(String json, Class<T> classe);
}
