package com.killrvideo.service.statistic.grpc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.killrvideo.grpc.AbstractSingleServiceGrpcServer;

import io.grpc.ServerServiceDefinition;

/**
 * Startup a GRPC server on expected port and register all services.
 *
 * @author DataStax Developer Advocates team.
 */
@Component
public class StatisticsGrpcServer extends AbstractSingleServiceGrpcServer {
    
    @Autowired
    private StatisticsServiceGrpc commentService;
    
    /** Listening Port for GRPC. */
    @Value("${killrvideo.grpc-server.port: 30200}")
    protected int defaultPort;
    
    /** {@inheritDoc} */
    public String getServiceName() {
        return StatisticsServiceGrpc.STATISTICS_SERVICE_NAME;
    }
    
    /** {@inheritDoc} */
    public ServerServiceDefinition getService() {
        return commentService.bindService();
    }

    /** {@inheritDoc} */
    public int getDefaultPort() {
        return defaultPort;
    }
    
}