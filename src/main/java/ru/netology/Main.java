package ru.netology;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        CloseableHttpClient httpClient = HttpClientBuilder.create()
                .setDefaultRequestConfig(RequestConfig.custom()
                        .setConnectTimeout(5000)    // максимальное время ожидание подключения к серверу
                        .setSocketTimeout(30000)    // максимальное время ожидания получения данных
                        .setRedirectsEnabled(false) // возможность следовать редиректу в ответе
                        .build())
                .build();
        HttpGet request = new HttpGet("https://cat-fact.herokuapp.com/facts");
        ObjectMapper mapper = new ObjectMapper();

        try {
            CloseableHttpResponse response = httpClient.execute(request);
            List<Cat> cats = mapper.readValue(response.getEntity().getContent(),
                    new TypeReference<List<Cat>>() {});

//            Филипп Воронов  10 days ago
//            можете по любому полю данных сделать фильтр

            cats.stream()
                    .filter(e -> e.getStatus().getSentCount() == 1)
                    .forEach(x -> System.out.println(x.getType()));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
