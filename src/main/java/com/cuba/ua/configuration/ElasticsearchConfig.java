//package com.cuba.ua.configuration;
//
//import org.elasticsearch.client.RestHighLevelClient;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.elasticsearch.client.ClientConfiguration;
//import org.springframework.data.elasticsearch.client.erhlc.RestClients;
//
//@Configuration
//public class ElasticsearchConfig {
//
//    @Bean
//    public RestHighLevelClient elasticsearchClient() {
//        ClientConfiguration clientConfiguration = ClientConfiguration.builder()
//                .connectedTo("localhost:9200") // Потом подключить нужно
//                .build();
//
//        return RestClients.create(clientConfiguration).rest();
//    }
//}
