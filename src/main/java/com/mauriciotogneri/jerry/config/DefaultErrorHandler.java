package com.mauriciotogneri.jerry.config;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.ErrorHandler;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DefaultErrorHandler extends ErrorHandler
{
    @Override
    public void doError(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException
    {
    }
}